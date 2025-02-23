package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class NovaShowServerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OpenStack-API-Version")

    private String openStackAPIVersion;

    public NovaShowServerRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public NovaShowServerRequest withOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
        return this;
    }

    /**
     * 微版本头
     * @return openStackAPIVersion
     */
    public String getOpenStackAPIVersion() {
        return openStackAPIVersion;
    }

    public void setOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaShowServerRequest novaShowServerRequest = (NovaShowServerRequest) o;
        return Objects.equals(this.serverId, novaShowServerRequest.serverId)
            && Objects.equals(this.openStackAPIVersion, novaShowServerRequest.openStackAPIVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, openStackAPIVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaShowServerRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    openStackAPIVersion: ").append(toIndentedString(openStackAPIVersion)).append("\n");
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
