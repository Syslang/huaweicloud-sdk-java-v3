package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * - instance: 企业路由器实例 - route-table: 路由表 - vpc-attachment: VPC连接 - vgw-attachment: 虚拟网关连接 - peering-attachment: 对等连接（Peering）连接 - vpn-attachment: VPN网关连接 - attachments: 所有连接类型
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum INSTANCE for value: "instance"
         */
        public static final ResourceTypeEnum INSTANCE = new ResourceTypeEnum("instance");

        /**
         * Enum ROUTE_TABLE for value: "route-table"
         */
        public static final ResourceTypeEnum ROUTE_TABLE = new ResourceTypeEnum("route-table");

        /**
         * Enum VPC_ATTACHMENT for value: "vpc-attachment"
         */
        public static final ResourceTypeEnum VPC_ATTACHMENT = new ResourceTypeEnum("vpc-attachment");

        /**
         * Enum DGW_ATTACHMENT for value: "dgw-attachment"
         */
        public static final ResourceTypeEnum DGW_ATTACHMENT = new ResourceTypeEnum("dgw-attachment");

        /**
         * Enum VGW_ATTACHMENT for value: "vgw-attachment"
         */
        public static final ResourceTypeEnum VGW_ATTACHMENT = new ResourceTypeEnum("vgw-attachment");

        /**
         * Enum PEERING_ATTACHMENT for value: "peering-attachment"
         */
        public static final ResourceTypeEnum PEERING_ATTACHMENT = new ResourceTypeEnum("peering-attachment");

        /**
         * Enum VPN_ATTACHMENT for value: "vpn-attachment"
         */
        public static final ResourceTypeEnum VPN_ATTACHMENT = new ResourceTypeEnum("vpn-attachment");

        /**
         * Enum CAN_ATTACHMENT for value: "can-attachment"
         */
        public static final ResourceTypeEnum CAN_ATTACHMENT = new ResourceTypeEnum("can-attachment");

        /**
         * Enum GDGW_ATTACHMENT for value: "gdgw-attachment"
         */
        public static final ResourceTypeEnum GDGW_ATTACHMENT = new ResourceTypeEnum("gdgw-attachment");

        /**
         * Enum ATTACHMENTS for value: "attachments"
         */
        public static final ResourceTypeEnum ATTACHMENTS = new ResourceTypeEnum("attachments");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("instance", INSTANCE);
            map.put("route-table", ROUTE_TABLE);
            map.put("vpc-attachment", VPC_ATTACHMENT);
            map.put("dgw-attachment", DGW_ATTACHMENT);
            map.put("vgw-attachment", VGW_ATTACHMENT);
            map.put("peering-attachment", PEERING_ATTACHMENT);
            map.put("vpn-attachment", VPN_ATTACHMENT);
            map.put("can-attachment", CAN_ATTACHMENT);
            map.put("gdgw-attachment", GDGW_ATTACHMENT);
            map.put("attachments", ATTACHMENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    public ShowResourceTagRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowResourceTagRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * - instance: 企业路由器实例 - route-table: 路由表 - vpc-attachment: VPC连接 - vgw-attachment: 虚拟网关连接 - peering-attachment: 对等连接（Peering）连接 - vpn-attachment: VPN网关连接 - attachments: 所有连接类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceTagRequest showResourceTagRequest = (ShowResourceTagRequest) o;
        return Objects.equals(this.resourceId, showResourceTagRequest.resourceId)
            && Objects.equals(this.resourceType, showResourceTagRequest.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceTagRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
