package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略时间调度规则
 */
public class BackupTriggerRequestInfo1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private BackupTriggerPropertiesRequestInfo1 properties;

    public BackupTriggerRequestInfo1 withProperties(BackupTriggerPropertiesRequestInfo1 properties) {
        this.properties = properties;
        return this;
    }

    public BackupTriggerRequestInfo1 withProperties(Consumer<BackupTriggerPropertiesRequestInfo1> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new BackupTriggerPropertiesRequestInfo1();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public BackupTriggerPropertiesRequestInfo1 getProperties() {
        return properties;
    }

    public void setProperties(BackupTriggerPropertiesRequestInfo1 properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupTriggerRequestInfo1 backupTriggerRequestInfo1 = (BackupTriggerRequestInfo1) o;
        return Objects.equals(this.properties, backupTriggerRequestInfo1.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTriggerRequestInfo1 {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
