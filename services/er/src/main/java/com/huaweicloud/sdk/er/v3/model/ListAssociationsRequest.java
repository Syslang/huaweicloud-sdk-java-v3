package com.huaweicloud.sdk.er.v3.model;

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
 * Request Object
 */
public class ListAssociationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private List<String> attachmentId = null;

    /**
    * Gets or Sets resourceType
    */
    public static final class ResourceTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final ResourceTypeEnum VPC = new ResourceTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final ResourceTypeEnum VPN = new ResourceTypeEnum("vpn");

        /**
         * Enum DGW for value: "dgw"
         */
        public static final ResourceTypeEnum DGW = new ResourceTypeEnum("dgw");

        /**
         * Enum VGW for value: "vgw"
         */
        public static final ResourceTypeEnum VGW = new ResourceTypeEnum("vgw");

        /**
         * Enum PEERING for value: "peering"
         */
        public static final ResourceTypeEnum PEERING = new ResourceTypeEnum("peering");

        /**
         * Enum CAN for value: "can"
         */
        public static final ResourceTypeEnum CAN = new ResourceTypeEnum("can");

        /**
         * Enum GDGW for value: "gdgw"
         */
        public static final ResourceTypeEnum GDGW = new ResourceTypeEnum("gdgw");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            map.put("dgw", DGW);
            map.put("vgw", VGW);
            map.put("peering", PEERING);
            map.put("can", CAN);
            map.put("gdgw", GDGW);
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

    private List<ResourceTypeEnum> resourceType = null;

    /**
    * Gets or Sets state
    */
    public static final class StateEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StateEnum PENDING = new StateEnum("pending");

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StateEnum AVAILABLE = new StateEnum("available");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StateEnum DELETING = new StateEnum("deleting");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StateEnum DELETED = new StateEnum("deleted");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StateEnum FAILED = new StateEnum("failed");

        /**
         * Enum MODIFYING for value: "modifying"
         */
        public static final StateEnum MODIFYING = new StateEnum("modifying");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("available", AVAILABLE);
            map.put("deleting", DELETING);
            map.put("deleted", DELETED);
            map.put("failed", FAILED);
            map.put("modifying", MODIFYING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<StateEnum> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<String> sortKey = null;

    /**
    * Gets or Sets sortDir
    */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    public ListAssociationsRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ListAssociationsRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * 路由表ID
     * @return routeTableId
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public ListAssociationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：0~2000。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAssociationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的企业路由器实例的id，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAssociationsRequest withAttachmentId(List<String> attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    public ListAssociationsRequest addAttachmentIdItem(String attachmentIdItem) {
        if (this.attachmentId == null) {
            this.attachmentId = new ArrayList<>();
        }
        this.attachmentId.add(attachmentIdItem);
        return this;
    }

    public ListAssociationsRequest withAttachmentId(Consumer<List<String>> attachmentIdSetter) {
        if (this.attachmentId == null) {
            this.attachmentId = new ArrayList<>();
        }
        attachmentIdSetter.accept(this.attachmentId);
        return this;
    }

    /**
     * 连接ID
     * @return attachmentId
     */
    public List<String> getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(List<String> attachmentId) {
        this.attachmentId = attachmentId;
    }

    public ListAssociationsRequest withResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ListAssociationsRequest addResourceTypeItem(ResourceTypeEnum resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ListAssociationsRequest withResourceType(Consumer<List<ResourceTypeEnum>> resourceTypeSetter) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        resourceTypeSetter.accept(this.resourceType);
        return this;
    }

    /**
     * 连接资源类型:vpc|vpn|vgw|peering
     * @return resourceType
     */
    public List<ResourceTypeEnum> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
    }

    public ListAssociationsRequest withState(List<StateEnum> state) {
        this.state = state;
        return this;
    }

    public ListAssociationsRequest addStateItem(StateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListAssociationsRequest withState(Consumer<List<StateEnum>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public List<StateEnum> getState() {
        return state;
    }

    public void setState(List<StateEnum> state) {
        this.state = state;
    }

    public ListAssociationsRequest withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListAssociationsRequest addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListAssociationsRequest withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 按关键字排序，默认按照id排序，可选值:id|name|state
     * @return sortKey
     */
    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public ListAssociationsRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListAssociationsRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListAssociationsRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 返回结果按照升序或降序排列，默认为asc,降序为desc
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssociationsRequest listAssociationsRequest = (ListAssociationsRequest) o;
        return Objects.equals(this.erId, listAssociationsRequest.erId)
            && Objects.equals(this.routeTableId, listAssociationsRequest.routeTableId)
            && Objects.equals(this.limit, listAssociationsRequest.limit)
            && Objects.equals(this.marker, listAssociationsRequest.marker)
            && Objects.equals(this.attachmentId, listAssociationsRequest.attachmentId)
            && Objects.equals(this.resourceType, listAssociationsRequest.resourceType)
            && Objects.equals(this.state, listAssociationsRequest.state)
            && Objects.equals(this.sortKey, listAssociationsRequest.sortKey)
            && Objects.equals(this.sortDir, listAssociationsRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, routeTableId, limit, marker, attachmentId, resourceType, state, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssociationsRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
