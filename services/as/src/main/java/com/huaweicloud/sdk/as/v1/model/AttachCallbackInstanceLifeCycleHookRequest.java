package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AttachCallbackInstanceLifeCycleHookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CallbackLifeCycleHookOption body;

    public AttachCallbackInstanceLifeCycleHookRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 伸缩组标识。
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public AttachCallbackInstanceLifeCycleHookRequest withBody(CallbackLifeCycleHookOption body) {
        this.body = body;
        return this;
    }

    public AttachCallbackInstanceLifeCycleHookRequest withBody(Consumer<CallbackLifeCycleHookOption> bodySetter) {
        if (this.body == null) {
            this.body = new CallbackLifeCycleHookOption();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CallbackLifeCycleHookOption getBody() {
        return body;
    }

    public void setBody(CallbackLifeCycleHookOption body) {
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
        AttachCallbackInstanceLifeCycleHookRequest attachCallbackInstanceLifeCycleHookRequest =
            (AttachCallbackInstanceLifeCycleHookRequest) o;
        return Objects.equals(this.scalingGroupId, attachCallbackInstanceLifeCycleHookRequest.scalingGroupId)
            && Objects.equals(this.body, attachCallbackInstanceLifeCycleHookRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachCallbackInstanceLifeCycleHookRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
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
