package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowSqlLimitSwitchStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 语言
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    /**
     * 数据库类型
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatastoreTypeEnum(value);
            }
            return result;
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    public ShowSqlLimitSwitchStatusRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowSqlLimitSwitchStatusRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowSqlLimitSwitchStatusRequest withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlLimitSwitchStatusRequest showSqlLimitSwitchStatusRequest = (ShowSqlLimitSwitchStatusRequest) o;
        return Objects.equals(this.instanceId, showSqlLimitSwitchStatusRequest.instanceId)
            && Objects.equals(this.xLanguage, showSqlLimitSwitchStatusRequest.xLanguage)
            && Objects.equals(this.datastoreType, showSqlLimitSwitchStatusRequest.datastoreType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, xLanguage, datastoreType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlLimitSwitchStatusRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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
