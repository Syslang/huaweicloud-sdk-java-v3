package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBucketRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_id")

    private String bucketId;

    public DeleteBucketRequest withBucketId(String bucketId) {
        this.bucketId = bucketId;
        return this;
    }

    /**
     * 桶ID
     * @return bucketId
     */
    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBucketRequest deleteBucketRequest = (DeleteBucketRequest) o;
        return Objects.equals(this.bucketId, deleteBucketRequest.bucketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBucketRequest {\n");
        sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
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
