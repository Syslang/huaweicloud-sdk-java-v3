package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigurationForCreation
 */
public class ConfigurationForCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private ParaGroupDatastore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, String> values = null;

    public ConfigurationForCreation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数模板名称。最长64个字符，只允许大写字母、小写字母、数字、和“-_.”特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationForCreation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数模板描述。最长256个字符，不支持>!<\"&'=特殊字符。默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationForCreation withDatastore(ParaGroupDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ConfigurationForCreation withDatastore(Consumer<ParaGroupDatastore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new ParaGroupDatastore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public ParaGroupDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ParaGroupDatastore datastore) {
        this.datastore = datastore;
    }

    public ConfigurationForCreation withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    public ConfigurationForCreation putValuesItem(String key, String valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public ConfigurationForCreation withValues(Consumer<Map<String, String>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 参数值对象，用户基于默认参数模板自定义的参数值。为空时不修改参数值。  - key：参数名称，\"max_connections\":\"10\"。为空时不修改参数值，key不为空时value也不可为空。 - value：参数值，\"max_connections\":\"10\"。
     * @return values
     */
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
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
        ConfigurationForCreation configurationForCreation = (ConfigurationForCreation) o;
        return Objects.equals(this.name, configurationForCreation.name)
            && Objects.equals(this.description, configurationForCreation.description)
            && Objects.equals(this.datastore, configurationForCreation.datastore)
            && Objects.equals(this.values, configurationForCreation.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, datastore, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationForCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
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
