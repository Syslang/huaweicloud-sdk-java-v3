package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDownloadResourceStatDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchQueryStatReq body;

    public BatchDownloadResourceStatDataRequest withBody(BatchQueryStatReq body) {
        this.body = body;
        return this;
    }

    public BatchDownloadResourceStatDataRequest withBody(Consumer<BatchQueryStatReq> bodySetter) {
        if (this.body == null) {
            this.body = new BatchQueryStatReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchQueryStatReq getBody() {
        return body;
    }

    public void setBody(BatchQueryStatReq body) {
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
        BatchDownloadResourceStatDataRequest batchDownloadResourceStatDataRequest =
            (BatchDownloadResourceStatDataRequest) o;
        return Objects.equals(this.body, batchDownloadResourceStatDataRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDownloadResourceStatDataRequest {\n");
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
