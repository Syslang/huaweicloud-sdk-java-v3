package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TagKeyValuesBean
 */
public class TagKeyValuesBean  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private List<String> values = null;
    
    public TagKeyValuesBean withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 键。最大长度128个unicode字符。 key不能为空。(搜索时不对此参数做字符集校验)，key不能为空或者空字符串，不能为空格，校验和使用之前先trim 前后半角空格
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public TagKeyValuesBean withValues(List<String> values) {
        this.values = values;
        return this;
    }

    
    public TagKeyValuesBean addValuesItem(String valuesItem) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public TagKeyValuesBean withValues(Consumer<List<String>> valuesSetter) {
        if(this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值列表。每个值最大长度255个unicode字符，校验和使用之前先trim 前后半角空格。 value可为空数组但不可缺省。 如果values为空列表，则表示any_value（查询任意value）。value之间为或的关系
     * @return values
     */
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagKeyValuesBean tagKeyValuesBean = (TagKeyValuesBean) o;
        return Objects.equals(this.key, tagKeyValuesBean.key) &&
            Objects.equals(this.values, tagKeyValuesBean.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagKeyValuesBean {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

