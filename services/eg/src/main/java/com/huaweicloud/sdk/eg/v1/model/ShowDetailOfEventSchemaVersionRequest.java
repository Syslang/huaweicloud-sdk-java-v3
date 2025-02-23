package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDetailOfEventSchemaVersionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_id")

    private String schemaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    public ShowDetailOfEventSchemaVersionRequest withSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * 指定查询的事件模型ID
     * @return schemaId
     */
    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public ShowDetailOfEventSchemaVersionRequest withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 指定查询的事件模型版本号
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailOfEventSchemaVersionRequest showDetailOfEventSchemaVersionRequest =
            (ShowDetailOfEventSchemaVersionRequest) o;
        return Objects.equals(this.schemaId, showDetailOfEventSchemaVersionRequest.schemaId)
            && Objects.equals(this.version, showDetailOfEventSchemaVersionRequest.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfEventSchemaVersionRequest {\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
