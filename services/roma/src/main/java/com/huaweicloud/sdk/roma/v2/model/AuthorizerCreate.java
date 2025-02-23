package com.huaweicloud.sdk.roma.v2.model;

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
 * AuthorizerCreate
 */
public class AuthorizerCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 自定义认证类型  - FRONTEND：前端 - BACKEND：后端
     */
    public static final class TypeEnum {

        /**
         * Enum FRONTEND for value: "FRONTEND"
         */
        public static final TypeEnum FRONTEND = new TypeEnum("FRONTEND");

        /**
         * Enum BACKEND for value: "BACKEND"
         */
        public static final TypeEnum BACKEND = new TypeEnum("BACKEND");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FRONTEND", FRONTEND);
            map.put("BACKEND", BACKEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 自定义认证函数类型： - LD：自定义后端函数 - FUNC：函数服务函数
     */
    public static final class AuthorizerTypeEnum {

        /**
         * Enum LD for value: "LD"
         */
        public static final AuthorizerTypeEnum LD = new AuthorizerTypeEnum("LD");

        /**
         * Enum FUNC for value: "FUNC"
         */
        public static final AuthorizerTypeEnum FUNC = new AuthorizerTypeEnum("FUNC");

        private static final Map<String, AuthorizerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthorizerTypeEnum> createStaticFields() {
            Map<String, AuthorizerTypeEnum> map = new HashMap<>();
            map.put("LD", LD);
            map.put("FUNC", FUNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthorizerTypeEnum(String value) {
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
        public static AuthorizerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthorizerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthorizerTypeEnum(value);
            }
            return result;
        }

        public static AuthorizerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthorizerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthorizerTypeEnum) {
                return this.value.equals(((AuthorizerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerTypeEnum authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_uri")

    private String authorizerUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identities")

    private List<Identity> identities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ld_api_id")

    private String ldApiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_body")

    private Boolean needBody;

    public AuthorizerCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义认证的名称。 长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、“_”组成，且只能以英文或中文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorizerCreate withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义认证类型  - FRONTEND：前端 - BACKEND：后端
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AuthorizerCreate withAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * 自定义认证函数类型： - LD：自定义后端函数 - FUNC：函数服务函数
     * @return authorizerType
     */
    public AuthorizerTypeEnum getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerTypeEnum authorizerType) {
        this.authorizerType = authorizerType;
    }

    public AuthorizerCreate withAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
        return this;
    }

    /**
     * 函数地址。  注意：使用自定义后端的函数API，API请求方法必须为POST，且API状态必须为已部署。
     * @return authorizerUri
     */
    public String getAuthorizerUri() {
        return authorizerUri;
    }

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    public AuthorizerCreate withIdentities(List<Identity> identities) {
        this.identities = identities;
        return this;
    }

    public AuthorizerCreate addIdentitiesItem(Identity identitiesItem) {
        if (this.identities == null) {
            this.identities = new ArrayList<>();
        }
        this.identities.add(identitiesItem);
        return this;
    }

    public AuthorizerCreate withIdentities(Consumer<List<Identity>> identitiesSetter) {
        if (this.identities == null) {
            this.identities = new ArrayList<>();
        }
        identitiesSetter.accept(this.identities);
        return this;
    }

    /**
     * 认证来源
     * @return identities
     */
    public List<Identity> getIdentities() {
        return identities;
    }

    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
    }

    public AuthorizerCreate withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 缓存时间
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public AuthorizerCreate withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户数据
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public AuthorizerCreate withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    /**
     * 自定义后端服务ID。  自定义认证函数类型为LD时必填
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    public AuthorizerCreate withNeedBody(Boolean needBody) {
        this.needBody = needBody;
        return this;
    }

    /**
     * 是否发送body
     * @return needBody
     */
    public Boolean getNeedBody() {
        return needBody;
    }

    public void setNeedBody(Boolean needBody) {
        this.needBody = needBody;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizerCreate authorizerCreate = (AuthorizerCreate) o;
        return Objects.equals(this.name, authorizerCreate.name) && Objects.equals(this.type, authorizerCreate.type)
            && Objects.equals(this.authorizerType, authorizerCreate.authorizerType)
            && Objects.equals(this.authorizerUri, authorizerCreate.authorizerUri)
            && Objects.equals(this.identities, authorizerCreate.identities)
            && Objects.equals(this.ttl, authorizerCreate.ttl)
            && Objects.equals(this.userData, authorizerCreate.userData)
            && Objects.equals(this.ldApiId, authorizerCreate.ldApiId)
            && Objects.equals(this.needBody, authorizerCreate.needBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, authorizerType, authorizerUri, identities, ttl, userData, ldApiId, needBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizerCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    authorizerUri: ").append(toIndentedString(authorizerUri)).append("\n");
        sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
        sb.append("    needBody: ").append(toIndentedString(needBody)).append("\n");
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
