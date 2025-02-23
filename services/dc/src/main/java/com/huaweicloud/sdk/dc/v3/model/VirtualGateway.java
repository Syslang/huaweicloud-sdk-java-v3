package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 虚拟网关对象
 */
public class VirtualGateway {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 虚拟网关类型：default
     */
    public static final class TypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final TypeEnum DEFAULT = new TypeEnum("default");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group")

    private List<String> localEpGroup = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_ep_group_ipv6")

    private List<String> localEpGroupIpv6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Integer bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public VirtualGateway withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 虚拟网关的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VirtualGateway withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟网关接入的VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VirtualGateway withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public VirtualGateway withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟网关的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualGateway withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 虚拟网关的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualGateway withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 虚拟网关类型：default
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public VirtualGateway withLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
        return this;
    }

    public VirtualGateway addLocalEpGroupItem(String localEpGroupItem) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        this.localEpGroup.add(localEpGroupItem);
        return this;
    }

    public VirtualGateway withLocalEpGroup(Consumer<List<String>> localEpGroupSetter) {
        if (this.localEpGroup == null) {
            this.localEpGroup = new ArrayList<>();
        }
        localEpGroupSetter.accept(this.localEpGroup);
        return this;
    }

    /**
     * 虚拟网关到访问云上服务IPv4子网列表，通常是vpc的cidrs
     * @return localEpGroup
     */
    public List<String> getLocalEpGroup() {
        return localEpGroup;
    }

    public void setLocalEpGroup(List<String> localEpGroup) {
        this.localEpGroup = localEpGroup;
    }

    public VirtualGateway withLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
        return this;
    }

    public VirtualGateway addLocalEpGroupIpv6Item(String localEpGroupIpv6Item) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        this.localEpGroupIpv6.add(localEpGroupIpv6Item);
        return this;
    }

    public VirtualGateway withLocalEpGroupIpv6(Consumer<List<String>> localEpGroupIpv6Setter) {
        if (this.localEpGroupIpv6 == null) {
            this.localEpGroupIpv6 = new ArrayList<>();
        }
        localEpGroupIpv6Setter.accept(this.localEpGroupIpv6);
        return this;
    }

    /**
     * 预留字段用于虚拟网关到访问云上服务IPv6子网列表，通常是vpc的cidrs
     * @return localEpGroupIpv6
     */
    public List<String> getLocalEpGroupIpv6() {
        return localEpGroupIpv6;
    }

    public void setLocalEpGroupIpv6(List<String> localEpGroupIpv6) {
        this.localEpGroupIpv6 = localEpGroupIpv6;
    }

    public VirtualGateway withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 管理状态：true或false
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public VirtualGateway withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作状态，合法值是：ACTIVE，DOWN，BUILD，ERROR，PENDING_CREATE，PENDING_UPDATE，PENDING_DELETE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VirtualGateway withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * 虚拟网关本地的BGP自冶域号(asn)
     * minimum: 1
     * maximum: 4294967295
     * @return bgpAsn
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public VirtualGateway withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public VirtualGateway withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VirtualGateway addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VirtualGateway withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualGateway virtualGateway = (VirtualGateway) o;
        return Objects.equals(this.id, virtualGateway.id) && Objects.equals(this.vpcId, virtualGateway.vpcId)
            && Objects.equals(this.tenantId, virtualGateway.tenantId) && Objects.equals(this.name, virtualGateway.name)
            && Objects.equals(this.description, virtualGateway.description)
            && Objects.equals(this.type, virtualGateway.type)
            && Objects.equals(this.localEpGroup, virtualGateway.localEpGroup)
            && Objects.equals(this.localEpGroupIpv6, virtualGateway.localEpGroupIpv6)
            && Objects.equals(this.adminStateUp, virtualGateway.adminStateUp)
            && Objects.equals(this.status, virtualGateway.status) && Objects.equals(this.bgpAsn, virtualGateway.bgpAsn)
            && Objects.equals(this.enterpriseProjectId, virtualGateway.enterpriseProjectId)
            && Objects.equals(this.tags, virtualGateway.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vpcId,
            tenantId,
            name,
            description,
            type,
            localEpGroup,
            localEpGroupIpv6,
            adminStateUp,
            status,
            bgpAsn,
            enterpriseProjectId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualGateway {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    localEpGroup: ").append(toIndentedString(localEpGroup)).append("\n");
        sb.append("    localEpGroupIpv6: ").append(toIndentedString(localEpGroupIpv6)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
