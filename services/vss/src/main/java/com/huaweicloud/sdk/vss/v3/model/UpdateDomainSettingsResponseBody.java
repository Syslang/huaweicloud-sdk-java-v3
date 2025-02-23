package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainSettingsResponseBody
 */
public class UpdateDomainSettingsResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_url")

    private String loginUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_username")

    private String loginUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_password")

    private String loginPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_cookies")

    private String loginCookies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_url")

    private String verifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_headers")

    private Map<String, String> httpHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public UpdateDomainSettingsResponseBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateDomainSettingsResponseBody withLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * 网站需要登录时，设置登录页面
     * @return loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public UpdateDomainSettingsResponseBody withLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }

    /**
     * 网站需要登录时，设置登录用户名
     * @return loginUsername
     */
    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public UpdateDomainSettingsResponseBody withLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }

    /**
     * 网站需要登录时，设置登录密码
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public UpdateDomainSettingsResponseBody withLoginCookies(String loginCookies) {
        this.loginCookies = loginCookies;
        return this;
    }

    /**
     * 网站需要登录时，设置登录cookie
     * @return loginCookies
     */
    public String getLoginCookies() {
        return loginCookies;
    }

    public void setLoginCookies(String loginCookies) {
        this.loginCookies = loginCookies;
    }

    public UpdateDomainSettingsResponseBody withVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }

    /**
     * 设置用于验证登录是否成功的网址
     * @return verifyUrl
     */
    public String getVerifyUrl() {
        return verifyUrl;
    }

    public void setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
    }

    public UpdateDomainSettingsResponseBody withHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public UpdateDomainSettingsResponseBody putHttpHeadersItem(String key, String httpHeadersItem) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new HashMap<>();
        }
        this.httpHeaders.put(key, httpHeadersItem);
        return this;
    }

    public UpdateDomainSettingsResponseBody withHttpHeaders(Consumer<Map<String, String>> httpHeadersSetter) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new HashMap<>();
        }
        httpHeadersSetter.accept(this.httpHeaders);
        return this;
    }

    /**
     * 设置自定义HTTP请求头
     * @return httpHeaders
     */
    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public UpdateDomainSettingsResponseBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainSettingsResponseBody updateDomainSettingsResponseBody = (UpdateDomainSettingsResponseBody) o;
        return Objects.equals(this.domainId, updateDomainSettingsResponseBody.domainId)
            && Objects.equals(this.loginUrl, updateDomainSettingsResponseBody.loginUrl)
            && Objects.equals(this.loginUsername, updateDomainSettingsResponseBody.loginUsername)
            && Objects.equals(this.loginPassword, updateDomainSettingsResponseBody.loginPassword)
            && Objects.equals(this.loginCookies, updateDomainSettingsResponseBody.loginCookies)
            && Objects.equals(this.verifyUrl, updateDomainSettingsResponseBody.verifyUrl)
            && Objects.equals(this.httpHeaders, updateDomainSettingsResponseBody.httpHeaders)
            && Objects.equals(this.domainName, updateDomainSettingsResponseBody.domainName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, loginUrl, loginUsername, loginPassword, loginCookies, verifyUrl, httpHeaders, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainSettingsResponseBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
        sb.append("    loginUsername: ").append(toIndentedString(loginUsername)).append("\n");
        sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
        sb.append("    loginCookies: ").append(toIndentedString(loginCookies)).append("\n");
        sb.append("    verifyUrl: ").append(toIndentedString(verifyUrl)).append("\n");
        sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
