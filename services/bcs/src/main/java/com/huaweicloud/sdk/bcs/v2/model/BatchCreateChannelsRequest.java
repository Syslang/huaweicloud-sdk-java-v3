package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateChannelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateChannelsRequestBody body;

    public BatchCreateChannelsRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * bcs 服务id
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public BatchCreateChannelsRequest withBody(BatchCreateChannelsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateChannelsRequest withBody(Consumer<BatchCreateChannelsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateChannelsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateChannelsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateChannelsRequestBody body) {
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
        BatchCreateChannelsRequest batchCreateChannelsRequest = (BatchCreateChannelsRequest) o;
        return Objects.equals(this.blockchainId, batchCreateChannelsRequest.blockchainId)
            && Objects.equals(this.body, batchCreateChannelsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateChannelsRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
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
