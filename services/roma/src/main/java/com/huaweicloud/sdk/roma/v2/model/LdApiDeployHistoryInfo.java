package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LdApiDeployHistoryInfo
 */
public class LdApiDeployHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ld_api_id")

    private String ldApiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_time")

    private OffsetDateTime deployTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_definition")

    private LdApiInfo apiDefinition;

    public LdApiDeployHistoryInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 部署的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LdApiDeployHistoryInfo withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    /**
     * 部署的后端API编号
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    public LdApiDeployHistoryInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 部署的前端API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public LdApiDeployHistoryInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 部署的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public LdApiDeployHistoryInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * 部署的前端API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public LdApiDeployHistoryInfo withDeployTime(OffsetDateTime deployTime) {
        this.deployTime = deployTime;
        return this;
    }

    /**
     * 部署时间
     * @return deployTime
     */
    public OffsetDateTime getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(OffsetDateTime deployTime) {
        this.deployTime = deployTime;
    }

    public LdApiDeployHistoryInfo withApiDefinition(LdApiInfo apiDefinition) {
        this.apiDefinition = apiDefinition;
        return this;
    }

    public LdApiDeployHistoryInfo withApiDefinition(Consumer<LdApiInfo> apiDefinitionSetter) {
        if (this.apiDefinition == null) {
            this.apiDefinition = new LdApiInfo();
            apiDefinitionSetter.accept(this.apiDefinition);
        }

        return this;
    }

    /**
     * Get apiDefinition
     * @return apiDefinition
     */
    public LdApiInfo getApiDefinition() {
        return apiDefinition;
    }

    public void setApiDefinition(LdApiInfo apiDefinition) {
        this.apiDefinition = apiDefinition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LdApiDeployHistoryInfo ldApiDeployHistoryInfo = (LdApiDeployHistoryInfo) o;
        return Objects.equals(this.id, ldApiDeployHistoryInfo.id)
            && Objects.equals(this.ldApiId, ldApiDeployHistoryInfo.ldApiId)
            && Objects.equals(this.groupId, ldApiDeployHistoryInfo.groupId)
            && Objects.equals(this.envId, ldApiDeployHistoryInfo.envId)
            && Objects.equals(this.apiId, ldApiDeployHistoryInfo.apiId)
            && Objects.equals(this.deployTime, ldApiDeployHistoryInfo.deployTime)
            && Objects.equals(this.apiDefinition, ldApiDeployHistoryInfo.apiDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ldApiId, groupId, envId, apiId, deployTime, apiDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdApiDeployHistoryInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    deployTime: ").append(toIndentedString(deployTime)).append("\n");
        sb.append("    apiDefinition: ").append(toIndentedString(apiDefinition)).append("\n");
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
