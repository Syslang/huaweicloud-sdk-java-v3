package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BatchCreateSubNetworkInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public BatchCreateSubNetworkInterfaceOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 功能说明：虚拟子网ID 取值范围：标准UUID
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public BatchCreateSubNetworkInterfaceOption withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 功能说明：宿主网络接口的ID 取值范围：标注UUID 约束：必须是实际存在的端口ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BatchCreateSubNetworkInterfaceOption withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public BatchCreateSubNetworkInterfaceOption addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public BatchCreateSubNetworkInterfaceOption withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 功能说明：安全组的ID列表；例如：\"security_groups\": [\"a0608cbf-d047-4f54-8b28-cd7b59853fff\"] 取值范围：默认值为系统默认安全组
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public BatchCreateSubNetworkInterfaceOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchCreateSubNetworkInterfaceOption withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡是否启用ipv6地址 取值范围：true（开启)，false（关闭） 默认值：false
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public BatchCreateSubNetworkInterfaceOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属的项目ID 取值范围：标准UUID 约束：只有管理员有权限指定
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateSubNetworkInterfaceOption batchCreateSubNetworkInterfaceOption =
            (BatchCreateSubNetworkInterfaceOption) o;
        return Objects.equals(this.virsubnetId, batchCreateSubNetworkInterfaceOption.virsubnetId)
            && Objects.equals(this.parentId, batchCreateSubNetworkInterfaceOption.parentId)
            && Objects.equals(this.securityGroups, batchCreateSubNetworkInterfaceOption.securityGroups)
            && Objects.equals(this.description, batchCreateSubNetworkInterfaceOption.description)
            && Objects.equals(this.ipv6Enable, batchCreateSubNetworkInterfaceOption.ipv6Enable)
            && Objects.equals(this.projectId, batchCreateSubNetworkInterfaceOption.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetId, parentId, securityGroups, description, ipv6Enable, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSubNetworkInterfaceOption {\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
