/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.Iam;
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.core.utils.TimeUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.function.Function;

/**
 * @param <DerivedT> derived class such as BasicCredentials and
 *                   GlobalCredentials
 * @author HuaweiCloud_SDK
 */
public abstract class AbstractCredentials<DerivedT extends AbstractCredentials<DerivedT>> implements ICredential {
    private String ak;

    private String sk;

    private String securityToken;

    private String idpId;

    private String idTokenFile;

    private String iamEndpoint;

    protected Long expiredAt;

    protected String authToken;

    protected String regionId;

    protected String derivedAuthServiceName;

    private Function<HttpRequest, Boolean> derivedPredicate;

    public static final Function<HttpRequest, Boolean> DEFAULT_DERIVED_PREDICATE =
        httpRequest ->
            !Constants.DEFAULT_ENDPOINT_REG.matches(
                httpRequest.getEndpoint().replace(Constants.HTTPS_SCHEME + "://", ""));

    public abstract void processDerivedAuthParams(String derivedAuthServiceName, String regionId);

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public String getIdTokenFile() {
        return idTokenFile;
    }

    public void setIdTokenFile(String idTokenFile) {
        this.idTokenFile = idTokenFile;
    }

    public String getIamEndpoint() {
        return iamEndpoint;
    }

    public void setIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
    }

    public Function<HttpRequest, Boolean> getDerivedPredicate() {
        return derivedPredicate;
    }

    public void setDerivedPredicate(Function<HttpRequest, Boolean> derivedPredicate) {
        this.derivedPredicate = derivedPredicate;
    }

    /**
     * @param ak access key
     * @return DerivedT with ak set
     */
    public DerivedT withAk(String ak) {
        this.ak = ak;
        return (DerivedT) this;
    }

    /**
     * @param sk access secret key
     * @return DerivedT with sk set
     */
    public DerivedT withSk(String sk) {
        this.sk = sk;
        return (DerivedT) this;
    }

    /**
     * @param securityToken temporary token from temporary ak and sk
     * @return DerivedT with securityToken set
     */
    public DerivedT withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return (DerivedT) this;
    }

    /**
     * @param idpId identity provider id
     * @return DerivedT with idpId set
     */
    public DerivedT withIdpId(String idpId) {
        this.idpId = idpId;
        return (DerivedT) this;
    }

    /**
     * @param idTokenFile file path of the id token
     * @return DerivedT with idTokenFile set
     */
    public DerivedT withIdTokenFile(String idTokenFile) {
        this.idTokenFile = idTokenFile;
        return (DerivedT) this;
    }

    /**
     * @param iamEndpoint optional property
     * @return DerivedT with iamEndpoint set
     */
    public DerivedT withIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
        return (DerivedT) this;
    }

    /**
     * @param derivedPredicate optional property, judge whether to use the DerivedAKSKSigner
     * @return DerivedT with derived set
     */
    public DerivedT withDerivedPredicate(Function<HttpRequest, Boolean> derivedPredicate) {
        this.derivedPredicate = derivedPredicate;
        return (DerivedT) this;
    }

    protected String getDefaultIamEndpoint() {
        String iamEndpointEnv = System.getenv(Constants.IAM_ENDPOINT_ENV_NAME);
        return StringUtils.isEmpty(iamEndpointEnv) ? Constants.DEFAULT_IAM_ENDPOINT : iamEndpointEnv;
    }

    protected boolean isDerivedAuth(HttpRequest httpRequest) {
        if (derivedPredicate == null) {
            return false;
        }

        return derivedPredicate.apply(httpRequest);
    }

    protected String getIdToken() {
        String idToken;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(idTokenFile));
            idToken = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new SdkException(e);
        }

        if (StringUtils.isEmpty(idToken)) {
            throw new SdkException(String.format("The content is empty in id token file '%s'", idTokenFile));
        }
        return idToken;
    }

    protected boolean needUpdateSecurityToken() {
        if (Objects.isNull(ak) && Objects.isNull(sk)) {
            return true;
        }
        if (Objects.isNull(expiredAt) || Objects.isNull(securityToken)) {
            return false;
        }
        return expiredAt - TimeUtils.getTimeInMillis() < 60000;
    }

    protected void updateSecurityTokenFromMetadata() {
        Credential credential = Iam.getCredentialFromMetadata();
        ak = credential.getAccess();
        sk = credential.getSecret();
        securityToken = credential.getSecurityToken();
        try {
            String expiredTime = credential.getExpiresAt().replace("000Z", "Z");
            expiredAt = new SimpleDateFormat(Iam.EXPIRED_DATE_FORMAT).parse(expiredTime).getTime();
        } catch (ParseException e) {
            throw new SdkException(e);
        }
    }

    protected boolean needUpdateAuthToken() {
        if (Objects.isNull(idpId) || Objects.isNull(idTokenFile)) {
            return false;
        }
        if (Objects.isNull(authToken) || Objects.isNull(expiredAt)) {
            return true;
        }
        return expiredAt - TimeUtils.getTimeInMillis() < 60000;
    }

    protected abstract void updateAuthTokenByIdToken(HttpClient httpClient);
}
