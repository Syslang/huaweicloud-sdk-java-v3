package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangeBaremetalServerNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private ChangeBaremetalNameResponsesServers server;

    public ChangeBaremetalServerNameResponse withServer(ChangeBaremetalNameResponsesServers server) {
        this.server = server;
        return this;
    }

    public ChangeBaremetalServerNameResponse withServer(Consumer<ChangeBaremetalNameResponsesServers> serverSetter) {
        if (this.server == null) {
            this.server = new ChangeBaremetalNameResponsesServers();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public ChangeBaremetalNameResponsesServers getServer() {
        return server;
    }

    public void setServer(ChangeBaremetalNameResponsesServers server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeBaremetalServerNameResponse changeBaremetalServerNameResponse = (ChangeBaremetalServerNameResponse) o;
        return Objects.equals(this.server, changeBaremetalServerNameResponse.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBaremetalServerNameResponse {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
