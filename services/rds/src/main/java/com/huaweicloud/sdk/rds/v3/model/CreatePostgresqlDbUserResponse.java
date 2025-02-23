package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatePostgresqlDbUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resp")

    private String resp;

    public CreatePostgresqlDbUserResponse withResp(String resp) {
        this.resp = resp;
        return this;
    }

    /**
     * 操作结果。
     * @return resp
     */
    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePostgresqlDbUserResponse createPostgresqlDbUserResponse = (CreatePostgresqlDbUserResponse) o;
        return Objects.equals(this.resp, createPostgresqlDbUserResponse.resp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePostgresqlDbUserResponse {\n");
        sb.append("    resp: ").append(toIndentedString(resp)).append("\n");
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
