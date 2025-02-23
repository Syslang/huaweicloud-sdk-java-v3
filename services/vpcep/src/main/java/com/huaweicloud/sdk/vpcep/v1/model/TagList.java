package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签列表，没有标签默认为空数组。
 */
public class TagList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TagList withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键。 最大长度36个unicode字符。  key不能为空。不能包含“=”、“*”、“<”、“>”、“\\”、“,”、“|”和“/”，且首尾字符不能为空格。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TagList withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值。 每个值最大长度43个unicode字符，可以为空字符串。  不能包含“=”、“*”、“<”、“>”、“\\”、“,”、“|”和“/”，且首尾字符不能为空格。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagList tagList = (TagList) o;
        return Objects.equals(this.key, tagList.key) && Objects.equals(this.value, tagList.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagList {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
