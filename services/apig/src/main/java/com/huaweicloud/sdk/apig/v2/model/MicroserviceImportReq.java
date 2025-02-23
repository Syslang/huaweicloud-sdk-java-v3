package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入微服务的请求对象
 */
public class MicroserviceImportReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_info")

    private MicroserviceGroup groupInfo;

    /**
     * 微服务中心类型。 - CSE：CSE微服务注册中心 - CCE: CCE云容器引擎
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum CSE for value: "CSE"
         */
        public static final ServiceTypeEnum CSE = new ServiceTypeEnum("CSE");

        /**
         * Enum CCE for value: "CCE"
         */
        public static final ServiceTypeEnum CCE = new ServiceTypeEnum("CCE");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("CSE", CSE);
            map.put("CCE", CCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ServiceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServiceTypeEnum(value);
            }
            return result;
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServiceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private ServiceTypeEnum serviceType;

    /**
     * API网关访问微服务的请求协议 - HTTP - HTTPS
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<MicroserviceApiCreate> apis = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_timeout")

    private Integer backendTimeout;

    /**
     * API的认证方式，默认无认证[，site暂不支持IAM认证。](tag:Site) - NONE：无认证 - APP：APP认证 - IAM：IAM认证
     */
    public static final class AuthTypeEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        /**
         * Enum APP for value: "APP"
         */
        public static final AuthTypeEnum APP = new AuthTypeEnum("APP");

        /**
         * Enum IAM for value: "IAM"
         */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("APP", APP);
            map.put("IAM", IAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTypeEnum(value);
            }
            return result;
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors")

    private Boolean cors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cse_info")

    private MicroServiceInfoCSECreate cseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_info")

    private MicroServiceInfoCCECreate cceInfo;

    public MicroserviceImportReq withGroupInfo(MicroserviceGroup groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }

    public MicroserviceImportReq withGroupInfo(Consumer<MicroserviceGroup> groupInfoSetter) {
        if (this.groupInfo == null) {
            this.groupInfo = new MicroserviceGroup();
            groupInfoSetter.accept(this.groupInfo);
        }

        return this;
    }

    /**
     * Get groupInfo
     * @return groupInfo
     */
    public MicroserviceGroup getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(MicroserviceGroup groupInfo) {
        this.groupInfo = groupInfo;
    }

    public MicroserviceImportReq withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 微服务中心类型。 - CSE：CSE微服务注册中心 - CCE: CCE云容器引擎
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public MicroserviceImportReq withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * API网关访问微服务的请求协议 - HTTP - HTTPS
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public MicroserviceImportReq withApis(List<MicroserviceApiCreate> apis) {
        this.apis = apis;
        return this;
    }

    public MicroserviceImportReq addApisItem(MicroserviceApiCreate apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public MicroserviceImportReq withApis(Consumer<List<MicroserviceApiCreate>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 导入的api列表
     * @return apis
     */
    public List<MicroserviceApiCreate> getApis() {
        return apis;
    }

    public void setApis(List<MicroserviceApiCreate> apis) {
        this.apis = apis;
    }

    public MicroserviceImportReq withBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
        return this;
    }

    /**
     * APIG请求后端服务的超时时间。最大超时时间可通过实例特性backend_timeout配置修改，可修改的上限为600000，默认5000  单位：毫秒。
     * minimum: 1
     * @return backendTimeout
     */
    public Integer getBackendTimeout() {
        return backendTimeout;
    }

    public void setBackendTimeout(Integer backendTimeout) {
        this.backendTimeout = backendTimeout;
    }

    public MicroserviceImportReq withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * API的认证方式，默认无认证[，site暂不支持IAM认证。](tag:Site) - NONE：无认证 - APP：APP认证 - IAM：IAM认证
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public MicroserviceImportReq withCors(Boolean cors) {
        this.cors = cors;
        return this;
    }

    /**
     * 是否支持跨域，默认不支持 - true：支持 - false：不支持
     * @return cors
     */
    public Boolean getCors() {
        return cors;
    }

    public void setCors(Boolean cors) {
        this.cors = cors;
    }

    public MicroserviceImportReq withCseInfo(MicroServiceInfoCSECreate cseInfo) {
        this.cseInfo = cseInfo;
        return this;
    }

    public MicroserviceImportReq withCseInfo(Consumer<MicroServiceInfoCSECreate> cseInfoSetter) {
        if (this.cseInfo == null) {
            this.cseInfo = new MicroServiceInfoCSECreate();
            cseInfoSetter.accept(this.cseInfo);
        }

        return this;
    }

    /**
     * Get cseInfo
     * @return cseInfo
     */
    public MicroServiceInfoCSECreate getCseInfo() {
        return cseInfo;
    }

    public void setCseInfo(MicroServiceInfoCSECreate cseInfo) {
        this.cseInfo = cseInfo;
    }

    public MicroserviceImportReq withCceInfo(MicroServiceInfoCCECreate cceInfo) {
        this.cceInfo = cceInfo;
        return this;
    }

    public MicroserviceImportReq withCceInfo(Consumer<MicroServiceInfoCCECreate> cceInfoSetter) {
        if (this.cceInfo == null) {
            this.cceInfo = new MicroServiceInfoCCECreate();
            cceInfoSetter.accept(this.cceInfo);
        }

        return this;
    }

    /**
     * Get cceInfo
     * @return cceInfo
     */
    public MicroServiceInfoCCECreate getCceInfo() {
        return cceInfo;
    }

    public void setCceInfo(MicroServiceInfoCCECreate cceInfo) {
        this.cceInfo = cceInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroserviceImportReq microserviceImportReq = (MicroserviceImportReq) o;
        return Objects.equals(this.groupInfo, microserviceImportReq.groupInfo)
            && Objects.equals(this.serviceType, microserviceImportReq.serviceType)
            && Objects.equals(this.protocol, microserviceImportReq.protocol)
            && Objects.equals(this.apis, microserviceImportReq.apis)
            && Objects.equals(this.backendTimeout, microserviceImportReq.backendTimeout)
            && Objects.equals(this.authType, microserviceImportReq.authType)
            && Objects.equals(this.cors, microserviceImportReq.cors)
            && Objects.equals(this.cseInfo, microserviceImportReq.cseInfo)
            && Objects.equals(this.cceInfo, microserviceImportReq.cceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupInfo, serviceType, protocol, apis, backendTimeout, authType, cors, cseInfo, cceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroserviceImportReq {\n");
        sb.append("    groupInfo: ").append(toIndentedString(groupInfo)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
        sb.append("    backendTimeout: ").append(toIndentedString(backendTimeout)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
        sb.append("    cseInfo: ").append(toIndentedString(cseInfo)).append("\n");
        sb.append("    cceInfo: ").append(toIndentedString(cceInfo)).append("\n");
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
