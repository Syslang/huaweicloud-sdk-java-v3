package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ErInstance
 */
public class ErInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipv6")

    private String enableIpv6;

    public ErInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Er实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ErInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Er名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ErInstance withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Er状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ErInstance withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业租户id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ErInstance withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ErInstance withEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    /**
     * 是否开启ipv6
     * @return enableIpv6
     */
    public String getEnableIpv6() {
        return enableIpv6;
    }

    public void setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErInstance erInstance = (ErInstance) o;
        return Objects.equals(this.id, erInstance.id) && Objects.equals(this.name, erInstance.name)
            && Objects.equals(this.state, erInstance.state)
            && Objects.equals(this.enterpriseProjectId, erInstance.enterpriseProjectId)
            && Objects.equals(this.projectId, erInstance.projectId)
            && Objects.equals(this.enableIpv6, erInstance.enableIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, state, enterpriseProjectId, projectId, enableIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enableIpv6: ").append(toIndentedString(enableIpv6)).append("\n");
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
