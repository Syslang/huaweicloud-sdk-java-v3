package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAppCodeV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_code_id")

    private String appCodeId;

    public DeleteAppCodeV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteAppCodeV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeleteAppCodeV2Request withAppCodeId(String appCodeId) {
        this.appCodeId = appCodeId;
        return this;
    }

    /**
     * APP Code编号
     * @return appCodeId
     */
    public String getAppCodeId() {
        return appCodeId;
    }

    public void setAppCodeId(String appCodeId) {
        this.appCodeId = appCodeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAppCodeV2Request deleteAppCodeV2Request = (DeleteAppCodeV2Request) o;
        return Objects.equals(this.instanceId, deleteAppCodeV2Request.instanceId)
            && Objects.equals(this.appId, deleteAppCodeV2Request.appId)
            && Objects.equals(this.appCodeId, deleteAppCodeV2Request.appCodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, appCodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAppCodeV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appCodeId: ").append(toIndentedString(appCodeId)).append("\n");
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
