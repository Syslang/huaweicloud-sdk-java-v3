package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateAndDeleteVaultTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BulkCreateAndDeleteVaultTagsReq body;

    public BatchCreateAndDeleteVaultTagsRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 资源id
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public BatchCreateAndDeleteVaultTagsRequest withBody(BulkCreateAndDeleteVaultTagsReq body) {
        this.body = body;
        return this;
    }

    public BatchCreateAndDeleteVaultTagsRequest withBody(Consumer<BulkCreateAndDeleteVaultTagsReq> bodySetter) {
        if (this.body == null) {
            this.body = new BulkCreateAndDeleteVaultTagsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BulkCreateAndDeleteVaultTagsReq getBody() {
        return body;
    }

    public void setBody(BulkCreateAndDeleteVaultTagsReq body) {
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
        BatchCreateAndDeleteVaultTagsRequest batchCreateAndDeleteVaultTagsRequest =
            (BatchCreateAndDeleteVaultTagsRequest) o;
        return Objects.equals(this.vaultId, batchCreateAndDeleteVaultTagsRequest.vaultId)
            && Objects.equals(this.body, batchCreateAndDeleteVaultTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateAndDeleteVaultTagsRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
