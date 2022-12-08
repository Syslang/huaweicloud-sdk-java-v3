package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UninstallInstanceEipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OperateEipRequestBody body;

    public UninstallInstanceEipRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * server_id
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public UninstallInstanceEipRequest withBody(OperateEipRequestBody body) {
        this.body = body;
        return this;
    }

    public UninstallInstanceEipRequest withBody(Consumer<OperateEipRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new OperateEipRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OperateEipRequestBody getBody() {
        return body;
    }

    public void setBody(OperateEipRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UninstallInstanceEipRequest uninstallInstanceEipRequest = (UninstallInstanceEipRequest) o;
        return Objects.equals(this.serverId, uninstallInstanceEipRequest.serverId)
            && Objects.equals(this.body, uninstallInstanceEipRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UninstallInstanceEipRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
