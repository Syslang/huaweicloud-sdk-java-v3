package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteIpListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteIpListRequestBody body;

    public BatchDeleteIpListRequest withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /**
     * IP地址组ID。
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    public BatchDeleteIpListRequest withBody(BatchDeleteIpListRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteIpListRequest withBody(Consumer<BatchDeleteIpListRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteIpListRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteIpListRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteIpListRequestBody body) {
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
        BatchDeleteIpListRequest batchDeleteIpListRequest = (BatchDeleteIpListRequest) o;
        return Objects.equals(this.ipgroupId, batchDeleteIpListRequest.ipgroupId)
            && Objects.equals(this.body, batchDeleteIpListRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpListRequest {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
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
