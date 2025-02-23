package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网IP字段信息
 */
public class PublicipSingleShowResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 功能说明：IP版本信息 取值范围：4表示公网IP地址为public_ip_address地址;6表示公网IP地址为public_ipv6_address地址\"
     */
    public static final class IpVersionEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final IpVersionEnum NUMBER_4 = new IpVersionEnum(4);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final IpVersionEnum NUMBER_6 = new IpVersionEnum(6);

        private static final Map<Integer, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpVersionEnum> createStaticFields() {
            Map<Integer, IpVersionEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(6, NUMBER_6);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpVersionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IpVersionEnum(value);
            }
            return result;
        }

        public static IpVersionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IpVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private IpVersionEnum ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address")

    private String publicIpv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    /**
     * 功能说明：弹性公网IP的状态  取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE， 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。
     */
    public static final class StatusEnum {

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final StatusEnum FREEZED = new StatusEnum("FREEZED");

        /**
         * Enum BIND_ERROR for value: "BIND_ERROR"
         */
        public static final StatusEnum BIND_ERROR = new StatusEnum("BIND_ERROR");

        /**
         * Enum BINDING for value: "BINDING"
         */
        public static final StatusEnum BINDING = new StatusEnum("BINDING");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");

        /**
         * Enum NOTIFYING for value: "NOTIFYING"
         */
        public static final StatusEnum NOTIFYING = new StatusEnum("NOTIFYING");

        /**
         * Enum NOTIFY_DELETE for value: "NOTIFY_DELETE"
         */
        public static final StatusEnum NOTIFY_DELETE = new StatusEnum("NOTIFY_DELETE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final StatusEnum ELB = new StatusEnum("ELB");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final StatusEnum VPN = new StatusEnum("VPN");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("BIND_ERROR", BIND_ERROR);
            map.put("BINDING", BINDING);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("NOTIFYING", NOTIFYING);
            map.put("NOTIFY_DELETE", NOTIFY_DELETE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("DOWN", DOWN);
            map.put("ACTIVE", ACTIVE);
            map.put("ELB", ELB);
            map.put("ERROR", ERROR);
            map.put("VPN", VPN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    /**
     * 功能说明：弹性公网IP类型
     */
    public static final class TypeEnum {

        /**
         * Enum EIP for value: "EIP"
         */
        public static final TypeEnum EIP = new TypeEnum("EIP");

        /**
         * Enum DUALSTACK for value: "DUALSTACK"
         */
        public static final TypeEnum DUALSTACK = new TypeEnum("DUALSTACK");

        /**
         * Enum DUALSTACK_SUBNET for value: "DUALSTACK_SUBNET"
         */
        public static final TypeEnum DUALSTACK_SUBNET = new TypeEnum("DUALSTACK_SUBNET");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EIP", EIP);
            map.put("DUALSTACK", DUALSTACK);
            map.put("DUALSTACK_SUBNET", DUALSTACK_SUBNET);
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
    @JsonProperty(value = "vnic")

    private VnicInfo vnic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private PublicipBandwidthInfo bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_info")

    private String billingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    /**
     * 功能说明：公网IP绑定的实例类型 取值范围：PORT、NATGW、ELB、ELBV1、VPN、null
     */
    public static final class AssociateInstanceTypeEnum {

        /**
         * Enum PORT for value: "PORT"
         */
        public static final AssociateInstanceTypeEnum PORT = new AssociateInstanceTypeEnum("PORT");

        /**
         * Enum NATGW for value: "NATGW"
         */
        public static final AssociateInstanceTypeEnum NATGW = new AssociateInstanceTypeEnum("NATGW");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final AssociateInstanceTypeEnum ELB = new AssociateInstanceTypeEnum("ELB");

        /**
         * Enum ELBV1 for value: "ELBV1"
         */
        public static final AssociateInstanceTypeEnum ELBV1 = new AssociateInstanceTypeEnum("ELBV1");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final AssociateInstanceTypeEnum VPN = new AssociateInstanceTypeEnum("VPN");

        /**
         * Enum NULL for value: "null"
         */
        public static final AssociateInstanceTypeEnum NULL = new AssociateInstanceTypeEnum("null");

        private static final Map<String, AssociateInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociateInstanceTypeEnum> createStaticFields() {
            Map<String, AssociateInstanceTypeEnum> map = new HashMap<>();
            map.put("PORT", PORT);
            map.put("NATGW", NATGW);
            map.put("ELB", ELB);
            map.put("ELBV1", ELBV1);
            map.put("VPN", VPN);
            map.put("null", NULL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociateInstanceTypeEnum(String value) {
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
        public static AssociateInstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AssociateInstanceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AssociateInstanceTypeEnum(value);
            }
            return result;
        }

        public static AssociateInstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AssociateInstanceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociateInstanceTypeEnum) {
                return this.value.equals(((AssociateInstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private AssociateInstanceTypeEnum associateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_id")

    private String associateInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_id")

    private String publicipPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_name")

    private String publicipPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile")

    private ProfileInfo profile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fake_network_type")

    private Boolean fakeNetworkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_metadata")

    private String associateInstanceMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_mode")

    private String associateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_share_bandwidth_types")

    private List<String> allowShareBandwidthTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade_delete_by_instance")

    private Boolean cascadeDeleteByInstance;

    public PublicipSingleShowResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：弹性公网IP唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicipSingleShowResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PublicipSingleShowResp withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 功能说明：IP版本信息 取值范围：4表示公网IP地址为public_ip_address地址;6表示公网IP地址为public_ipv6_address地址\"
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    public PublicipSingleShowResp withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 功能说明：弹性公网IP或者IPv6端口的地址
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public PublicipSingleShowResp withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    /**
     * 功能说明：IPv4时无此字段，IPv6时为申请到的弹性公网IP地址
     * @return publicIpv6Address
     */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public PublicipSingleShowResp withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 废弃，功能由publicip_pool_name继承，默认不显示。功能说明：弹性公网IP的网络类型
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public PublicipSingleShowResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 功能说明：弹性公网IP的状态  取值范围：冻结FREEZED，绑定失败BIND_ERROR，绑定中BINDING，释放中PENDING_DELETE， 创建中PENDING_CREATE，创建中NOTIFYING，释放中NOTIFY_DELETE，更新中PENDING_UPDATE， 未绑定DOWN ，绑定ACTIVE，绑定ELB，绑定VPN，失败ERROR。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PublicipSingleShowResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：弹性公网IP描述信息 约束：用户以自定义方式标识资源，系统不感知
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublicipSingleShowResp withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 功能说明：表示中心站点资源或者边缘站点资源 取值范围： center、边缘站点名称 约束：publicip只能绑定该字段相同的资源
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public PublicipSingleShowResp withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：资源创建UTC时间 格式:yyyy-MM-ddTHH:mm:ssZ
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PublicipSingleShowResp withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 功能说明：资源更新UTC时间 格式:yyyy-MM-ddTHH:mm:ssZ
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PublicipSingleShowResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 功能说明：弹性公网IP类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PublicipSingleShowResp withVnic(VnicInfo vnic) {
        this.vnic = vnic;
        return this;
    }

    public PublicipSingleShowResp withVnic(Consumer<VnicInfo> vnicSetter) {
        if (this.vnic == null) {
            this.vnic = new VnicInfo();
            vnicSetter.accept(this.vnic);
        }

        return this;
    }

    /**
     * Get vnic
     * @return vnic
     */
    public VnicInfo getVnic() {
        return vnic;
    }

    public void setVnic(VnicInfo vnic) {
        this.vnic = vnic;
    }

    public PublicipSingleShowResp withBandwidth(PublicipBandwidthInfo bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public PublicipSingleShowResp withBandwidth(Consumer<PublicipBandwidthInfo> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new PublicipBandwidthInfo();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public PublicipBandwidthInfo getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(PublicipBandwidthInfo bandwidth) {
        this.bandwidth = bandwidth;
    }

    public PublicipSingleShowResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 功能说明：企业项目ID。最大长度36字节,带“-”连字符的UUID格式,或者是字符串“0”。创建弹性公网IP时,给弹性公网IP绑定企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PublicipSingleShowResp withBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
        return this;
    }

    /**
     * 功能说明：公网IP的订单信息 约束：包周期才会有订单信息，按需资源此字段为空
     * @return billingInfo
     */
    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public PublicipSingleShowResp withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 功能说明：记录公网IP当前的冻结状态 约束：metadata类型，标识欠费冻结、公安冻结 取值范围：police，locked
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public PublicipSingleShowResp withAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    /**
     * 功能说明：公网IP绑定的实例类型 取值范围：PORT、NATGW、ELB、ELBV1、VPN、null
     * @return associateInstanceType
     */
    public AssociateInstanceTypeEnum getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public PublicipSingleShowResp withAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
        return this;
    }

    /**
     * 功能说明：公网IP绑定的实例ID
     * @return associateInstanceId
     */
    public String getAssociateInstanceId() {
        return associateInstanceId;
    }

    public void setAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
    }

    public PublicipSingleShowResp withPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
        return this;
    }

    /**
     * 功能说明：公网IP所属网络的ID。publicip_pool_name对应的网络ID
     * @return publicipPoolId
     */
    public String getPublicipPoolId() {
        return publicipPoolId;
    }

    public void setPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
    }

    public PublicipSingleShowResp withPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
        return this;
    }

    /**
     * 功能说明：弹性公网IP的网络类型, 包括公共池类型，如5_bgp/5_sbgp...，和用户购买的专属池。 专属池见publcip_pool相关接口
     * @return publicipPoolName
     */
    public String getPublicipPoolName() {
        return publicipPoolName;
    }

    public void setPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
    }

    public PublicipSingleShowResp withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 功能说明：弹性公网IP名称
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public PublicipSingleShowResp withProfile(ProfileInfo profile) {
        this.profile = profile;
        return this;
    }

    public PublicipSingleShowResp withProfile(Consumer<ProfileInfo> profileSetter) {
        if (this.profile == null) {
            this.profile = new ProfileInfo();
            profileSetter.accept(this.profile);
        }

        return this;
    }

    /**
     * Get profile
     * @return profile
     */
    public ProfileInfo getProfile() {
        return profile;
    }

    public void setProfile(ProfileInfo profile) {
        this.profile = profile;
    }

    public PublicipSingleShowResp withFakeNetworkType(Boolean fakeNetworkType) {
        this.fakeNetworkType = fakeNetworkType;
        return this;
    }

    /**
     * 默认不显示。该字段仅仅用于表示eip的bgp类型是否是真实的静态sbgp * 1. 如果为true，则该eip可以切换bgp类型 * 2. 如果为false，则该eip不可以切换bgp类型
     * @return fakeNetworkType
     */
    public Boolean getFakeNetworkType() {
        return fakeNetworkType;
    }

    public void setFakeNetworkType(Boolean fakeNetworkType) {
        this.fakeNetworkType = fakeNetworkType;
    }

    public PublicipSingleShowResp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PublicipSingleShowResp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PublicipSingleShowResp withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 默认不显示。用户标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PublicipSingleShowResp withAssociateInstanceMetadata(String associateInstanceMetadata) {
        this.associateInstanceMetadata = associateInstanceMetadata;
        return this;
    }

    /**
     * 默认不显示。记录实例的更上一层归属。例如associate_instance_type为PORT，此字段记录PORT的device_id和device_owner信息。仅有限场景记录。
     * @return associateInstanceMetadata
     */
    public String getAssociateInstanceMetadata() {
        return associateInstanceMetadata;
    }

    public void setAssociateInstanceMetadata(String associateInstanceMetadata) {
        this.associateInstanceMetadata = associateInstanceMetadata;
    }

    public PublicipSingleShowResp withAssociateMode(String associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     * 默认不显示。开启支持直通模式后展示，表示直通模式的标识。
     * @return associateMode
     */
    public String getAssociateMode() {
        return associateMode;
    }

    public void setAssociateMode(String associateMode) {
        this.associateMode = associateMode;
    }

    public PublicipSingleShowResp withAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
        return this;
    }

    public PublicipSingleShowResp addAllowShareBandwidthTypesItem(String allowShareBandwidthTypesItem) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        this.allowShareBandwidthTypes.add(allowShareBandwidthTypesItem);
        return this;
    }

    public PublicipSingleShowResp withAllowShareBandwidthTypes(Consumer<List<String>> allowShareBandwidthTypesSetter) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        allowShareBandwidthTypesSetter.accept(this.allowShareBandwidthTypes);
        return this;
    }

    /**
     * 功能说明：表示此publicip可以加入的共享带宽类型列表，如果为空列表，则表示该           publicip不能加入任何共享带宽 约束：publicip只能加入到有该带宽类型的共享带宽中
     * @return allowShareBandwidthTypes
     */
    public List<String> getAllowShareBandwidthTypes() {
        return allowShareBandwidthTypes;
    }

    public void setAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
    }

    public PublicipSingleShowResp withCascadeDeleteByInstance(Boolean cascadeDeleteByInstance) {
        this.cascadeDeleteByInstance = cascadeDeleteByInstance;
        return this;
    }

    /**
     * 默认不显示。表示该eip是否支持与实例同步删除。
     * @return cascadeDeleteByInstance
     */
    public Boolean getCascadeDeleteByInstance() {
        return cascadeDeleteByInstance;
    }

    public void setCascadeDeleteByInstance(Boolean cascadeDeleteByInstance) {
        this.cascadeDeleteByInstance = cascadeDeleteByInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicipSingleShowResp publicipSingleShowResp = (PublicipSingleShowResp) o;
        return Objects.equals(this.id, publicipSingleShowResp.id)
            && Objects.equals(this.projectId, publicipSingleShowResp.projectId)
            && Objects.equals(this.ipVersion, publicipSingleShowResp.ipVersion)
            && Objects.equals(this.publicIpAddress, publicipSingleShowResp.publicIpAddress)
            && Objects.equals(this.publicIpv6Address, publicipSingleShowResp.publicIpv6Address)
            && Objects.equals(this.networkType, publicipSingleShowResp.networkType)
            && Objects.equals(this.status, publicipSingleShowResp.status)
            && Objects.equals(this.description, publicipSingleShowResp.description)
            && Objects.equals(this.publicBorderGroup, publicipSingleShowResp.publicBorderGroup)
            && Objects.equals(this.createdAt, publicipSingleShowResp.createdAt)
            && Objects.equals(this.updatedAt, publicipSingleShowResp.updatedAt)
            && Objects.equals(this.type, publicipSingleShowResp.type)
            && Objects.equals(this.vnic, publicipSingleShowResp.vnic)
            && Objects.equals(this.bandwidth, publicipSingleShowResp.bandwidth)
            && Objects.equals(this.enterpriseProjectId, publicipSingleShowResp.enterpriseProjectId)
            && Objects.equals(this.billingInfo, publicipSingleShowResp.billingInfo)
            && Objects.equals(this.lockStatus, publicipSingleShowResp.lockStatus)
            && Objects.equals(this.associateInstanceType, publicipSingleShowResp.associateInstanceType)
            && Objects.equals(this.associateInstanceId, publicipSingleShowResp.associateInstanceId)
            && Objects.equals(this.publicipPoolId, publicipSingleShowResp.publicipPoolId)
            && Objects.equals(this.publicipPoolName, publicipSingleShowResp.publicipPoolName)
            && Objects.equals(this.alias, publicipSingleShowResp.alias)
            && Objects.equals(this.profile, publicipSingleShowResp.profile)
            && Objects.equals(this.fakeNetworkType, publicipSingleShowResp.fakeNetworkType)
            && Objects.equals(this.tags, publicipSingleShowResp.tags)
            && Objects.equals(this.associateInstanceMetadata, publicipSingleShowResp.associateInstanceMetadata)
            && Objects.equals(this.associateMode, publicipSingleShowResp.associateMode)
            && Objects.equals(this.allowShareBandwidthTypes, publicipSingleShowResp.allowShareBandwidthTypes)
            && Objects.equals(this.cascadeDeleteByInstance, publicipSingleShowResp.cascadeDeleteByInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            ipVersion,
            publicIpAddress,
            publicIpv6Address,
            networkType,
            status,
            description,
            publicBorderGroup,
            createdAt,
            updatedAt,
            type,
            vnic,
            bandwidth,
            enterpriseProjectId,
            billingInfo,
            lockStatus,
            associateInstanceType,
            associateInstanceId,
            publicipPoolId,
            publicipPoolName,
            alias,
            profile,
            fakeNetworkType,
            tags,
            associateInstanceMetadata,
            associateMode,
            allowShareBandwidthTypes,
            cascadeDeleteByInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicipSingleShowResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    billingInfo: ").append(toIndentedString(billingInfo)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    associateInstanceId: ").append(toIndentedString(associateInstanceId)).append("\n");
        sb.append("    publicipPoolId: ").append(toIndentedString(publicipPoolId)).append("\n");
        sb.append("    publicipPoolName: ").append(toIndentedString(publicipPoolName)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
        sb.append("    fakeNetworkType: ").append(toIndentedString(fakeNetworkType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    associateInstanceMetadata: ").append(toIndentedString(associateInstanceMetadata)).append("\n");
        sb.append("    associateMode: ").append(toIndentedString(associateMode)).append("\n");
        sb.append("    allowShareBandwidthTypes: ").append(toIndentedString(allowShareBandwidthTypes)).append("\n");
        sb.append("    cascadeDeleteByInstance: ").append(toIndentedString(cascadeDeleteByInstance)).append("\n");
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
