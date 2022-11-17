package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 场地信息
 */
public class CreateLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "district")

    private String district;

    /**
     * 场地所在国家
     */
    public static final class CountryEnum {

        /**
         * Enum CN for value: "CN"
         */
        public static final CountryEnum CN = new CountryEnum("CN");

        private static final Map<String, CountryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CountryEnum> createStaticFields() {
            Map<String, CountryEnum> map = new HashMap<>();
            map.put("CN", CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CountryEnum(String value) {
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
        public static CountryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CountryEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CountryEnum(value);
            }
            return result;
        }

        public static CountryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CountryEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CountryEnum) {
                return this.value.equals(((CountryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private CountryEnum country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private Condition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 场地名称（已废弃）,该参数不会再持久化存储，新建站点也不会再返回该字段
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateLocation withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 场地所在省/自治区/直辖市
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public CreateLocation withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 场地所在市/区
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CreateLocation withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * 场地所在区/县
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public CreateLocation withCountry(CountryEnum country) {
        this.country = country;
        return this;
    }

    /**
     * 场地所在国家
     * @return country
     */
    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    public CreateLocation withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public CreateLocation withCondition(Consumer<Condition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new Condition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public CreateLocation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 场地描述，最大支持长度为255个字节，不允许包含<>
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLocation createLocation = (CreateLocation) o;
        return Objects.equals(this.name, createLocation.name) && Objects.equals(this.province, createLocation.province)
            && Objects.equals(this.city, createLocation.city) && Objects.equals(this.district, createLocation.district)
            && Objects.equals(this.country, createLocation.country)
            && Objects.equals(this.condition, createLocation.condition)
            && Objects.equals(this.description, createLocation.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, province, city, district, country, condition, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLocation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
