package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListGraphsRespTags
 */
public class ListGraphsRespTags  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    

    private String value;

    public ListGraphsRespTags withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 标签key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ListGraphsRespTags withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 标签value
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
        ListGraphsRespTags listGraphsRespTags = (ListGraphsRespTags) o;
        return Objects.equals(this.key, listGraphsRespTags.key) &&
            Objects.equals(this.value, listGraphsRespTags.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphsRespTags {\n");
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

