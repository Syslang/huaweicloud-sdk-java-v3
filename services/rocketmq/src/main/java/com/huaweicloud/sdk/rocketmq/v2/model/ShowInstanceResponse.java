package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 实例类型：集群，cluster。
     */
    public static final class TypeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        /**
         * Enum CLUSTER for value: "cluster"
         */
        public static final TypeEnum CLUSTER = new TypeEnum("cluster");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("cluster", CLUSTER);
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
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_name")

    private String vpcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_name")

    private String securityGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_begin")

    private String maintainBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_end")

    private String maintainEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_log_collection")

    private Boolean enableLogCollection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_space")

    private Integer storageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_storage_space")

    private Integer usedStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_publicip")

    private Boolean enablePublicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_id")

    private String publicipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_address")

    private String publicipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_vpc_info")

    private String crossVpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_resource_id")

    private String storageResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_spec_code")

    private String storageSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_times")

    private Long extendTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_features")

    private String supportFeatures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_encrypted")

    private Boolean diskEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ces_version")

    private String cesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_spec_billing_enable")

    private Boolean newSpecBillingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acl")

    private Boolean enableAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private Integer brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namesrv_address")

    private String namesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_address")

    private String brokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_namesrv_address")

    private String publicNamesrvAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_broker_address")

    private String publicBrokerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagEntity> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_storage_space")

    private Integer totalStorageSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    public ShowInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceResponse withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ShowInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 消息描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型：集群，cluster。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowInstanceResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 实例规格。
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ShowInstanceResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceResponse withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * [付费模式，1表示按需计费。](tag:hws_eu,hws_hk,)[付费模式，1表示按需计费，0表示包年/包月计费。](tag:hws,ctc) [计费模式，参数暂未使用。](tag:ocb,hws_ocb)
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ShowInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowInstanceResponse withVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * 私有云名称。
     * @return vpcName
     */
    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public ShowInstanceResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 完成创建时间。 格式为时间戳，指从格林威治时间1970年01月01日00时00分00秒起至指定时间的偏差总毫秒数。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowInstanceResponse withSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * 租户安全组名称。
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    public ShowInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowInstanceResponse withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public ShowInstanceResponse withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 子网路由。
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public ShowInstanceResponse withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShowInstanceResponse addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowInstanceResponse withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * IO未售罄的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ShowInstanceResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowInstanceResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowInstanceResponse withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    /**
     * 维护时间窗开始时间，格式为HH:mm:ss。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public ShowInstanceResponse withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    /**
     * 维护时间窗结束时间，格式为HH:mm:ss。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public ShowInstanceResponse withEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
        return this;
    }

    /**
     * 是否开启消息收集功能。
     * @return enableLogCollection
     */
    public Boolean getEnableLogCollection() {
        return enableLogCollection;
    }

    public void setEnableLogCollection(Boolean enableLogCollection) {
        this.enableLogCollection = enableLogCollection;
    }

    public ShowInstanceResponse withStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }

    /**
     * 存储空间，单位：GB。
     * @return storageSpace
     */
    public Integer getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
    }

    public ShowInstanceResponse withUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
        return this;
    }

    /**
     * 已用消息存储空间，单位：GB。
     * @return usedStorageSpace
     */
    public Integer getUsedStorageSpace() {
        return usedStorageSpace;
    }

    public void setUsedStorageSpace(Integer usedStorageSpace) {
        this.usedStorageSpace = usedStorageSpace;
    }

    public ShowInstanceResponse withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    /**
     * 是否开启公网。
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public ShowInstanceResponse withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    /**
     * 实例绑定的弹性IP地址的ID。 以英文逗号隔开多个弹性IP地址的ID。 如果开启了公网访问功能（即enable_publicip为true），该字段为必选。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public ShowInstanceResponse withPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
        return this;
    }

    /**
     * 公网IP地址。
     * @return publicipAddress
     */
    public String getPublicipAddress() {
        return publicipAddress;
    }

    public void setPublicipAddress(String publicipAddress) {
        this.publicipAddress = publicipAddress;
    }

    public ShowInstanceResponse withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * 是否开启SSL。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public ShowInstanceResponse withCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
        return this;
    }

    /**
     * 跨VPC访问信息。
     * @return crossVpcInfo
     */
    public String getCrossVpcInfo() {
        return crossVpcInfo;
    }

    public void setCrossVpcInfo(String crossVpcInfo) {
        this.crossVpcInfo = crossVpcInfo;
    }

    public ShowInstanceResponse withStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
        return this;
    }

    /**
     * 存储资源ID。
     * @return storageResourceId
     */
    public String getStorageResourceId() {
        return storageResourceId;
    }

    public void setStorageResourceId(String storageResourceId) {
        this.storageResourceId = storageResourceId;
    }

    public ShowInstanceResponse withStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
        return this;
    }

    /**
     * 存储规格代码。
     * @return storageSpecCode
     */
    public String getStorageSpecCode() {
        return storageSpecCode;
    }

    public void setStorageSpecCode(String storageSpecCode) {
        this.storageSpecCode = storageSpecCode;
    }

    public ShowInstanceResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowInstanceResponse withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public ShowInstanceResponse withExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
        return this;
    }

    /**
     * 扩展时间。
     * @return extendTimes
     */
    public Long getExtendTimes() {
        return extendTimes;
    }

    public void setExtendTimes(Long extendTimes) {
        this.extendTimes = extendTimes;
    }

    public ShowInstanceResponse withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否开启IPv6。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ShowInstanceResponse withSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
        return this;
    }

    /**
     * 实例支持的特性功能。
     * @return supportFeatures
     */
    public String getSupportFeatures() {
        return supportFeatures;
    }

    public void setSupportFeatures(String supportFeatures) {
        this.supportFeatures = supportFeatures;
    }

    public ShowInstanceResponse withDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
        return this;
    }

    /**
     * 是否开启磁盘加密。
     * @return diskEncrypted
     */
    public Boolean getDiskEncrypted() {
        return diskEncrypted;
    }

    public void setDiskEncrypted(Boolean diskEncrypted) {
        this.diskEncrypted = diskEncrypted;
    }

    public ShowInstanceResponse withCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
        return this;
    }

    /**
     * 云监控版本。
     * @return cesVersion
     */
    public String getCesVersion() {
        return cesVersion;
    }

    public void setCesVersion(String cesVersion) {
        this.cesVersion = cesVersion;
    }

    public ShowInstanceResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowInstanceResponse withNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
        return this;
    }

    /**
     * 是否启用新规格计费。
     * @return newSpecBillingEnable
     */
    public Boolean getNewSpecBillingEnable() {
        return newSpecBillingEnable;
    }

    public void setNewSpecBillingEnable(Boolean newSpecBillingEnable) {
        this.newSpecBillingEnable = newSpecBillingEnable;
    }

    public ShowInstanceResponse withEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
        return this;
    }

    /**
     * 是否开启访问控制列表。
     * @return enableAcl
     */
    public Boolean getEnableAcl() {
        return enableAcl;
    }

    public void setEnableAcl(Boolean enableAcl) {
        this.enableAcl = enableAcl;
    }

    public ShowInstanceResponse withBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * 节点数。
     * @return brokerNum
     */
    public Integer getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(Integer brokerNum) {
        this.brokerNum = brokerNum;
    }

    public ShowInstanceResponse withNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
        return this;
    }

    /**
     * 元数据地址。
     * @return namesrvAddress
     */
    public String getNamesrvAddress() {
        return namesrvAddress;
    }

    public void setNamesrvAddress(String namesrvAddress) {
        this.namesrvAddress = namesrvAddress;
    }

    public ShowInstanceResponse withBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
        return this;
    }

    /**
     * 业务数据地址。
     * @return brokerAddress
     */
    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public ShowInstanceResponse withPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
        return this;
    }

    /**
     * 公网元数据地址。
     * @return publicNamesrvAddress
     */
    public String getPublicNamesrvAddress() {
        return publicNamesrvAddress;
    }

    public void setPublicNamesrvAddress(String publicNamesrvAddress) {
        this.publicNamesrvAddress = publicNamesrvAddress;
    }

    public ShowInstanceResponse withPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
        return this;
    }

    /**
     * 公网业务数据地址。
     * @return publicBrokerAddress
     */
    public String getPublicBrokerAddress() {
        return publicBrokerAddress;
    }

    public void setPublicBrokerAddress(String publicBrokerAddress) {
        this.publicBrokerAddress = publicBrokerAddress;
    }

    public ShowInstanceResponse withTags(List<TagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public ShowInstanceResponse addTagsItem(TagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowInstanceResponse withTags(Consumer<List<TagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<TagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TagEntity> tags) {
        this.tags = tags;
    }

    public ShowInstanceResponse withTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
        return this;
    }

    /**
     * 总存储空间。
     * @return totalStorageSpace
     */
    public Integer getTotalStorageSpace() {
        return totalStorageSpace;
    }

    public void setTotalStorageSpace(Integer totalStorageSpace) {
        this.totalStorageSpace = totalStorageSpace;
    }

    public ShowInstanceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceResponse showInstanceResponse = (ShowInstanceResponse) o;
        return Objects.equals(this.name, showInstanceResponse.name)
            && Objects.equals(this.engine, showInstanceResponse.engine)
            && Objects.equals(this.status, showInstanceResponse.status)
            && Objects.equals(this.description, showInstanceResponse.description)
            && Objects.equals(this.type, showInstanceResponse.type)
            && Objects.equals(this.specification, showInstanceResponse.specification)
            && Objects.equals(this.engineVersion, showInstanceResponse.engineVersion)
            && Objects.equals(this.instanceId, showInstanceResponse.instanceId)
            && Objects.equals(this.chargingMode, showInstanceResponse.chargingMode)
            && Objects.equals(this.vpcId, showInstanceResponse.vpcId)
            && Objects.equals(this.vpcName, showInstanceResponse.vpcName)
            && Objects.equals(this.createdAt, showInstanceResponse.createdAt)
            && Objects.equals(this.productId, showInstanceResponse.productId)
            && Objects.equals(this.securityGroupId, showInstanceResponse.securityGroupId)
            && Objects.equals(this.securityGroupName, showInstanceResponse.securityGroupName)
            && Objects.equals(this.subnetId, showInstanceResponse.subnetId)
            && Objects.equals(this.subnetName, showInstanceResponse.subnetName)
            && Objects.equals(this.subnetCidr, showInstanceResponse.subnetCidr)
            && Objects.equals(this.availableZones, showInstanceResponse.availableZones)
            && Objects.equals(this.userId, showInstanceResponse.userId)
            && Objects.equals(this.userName, showInstanceResponse.userName)
            && Objects.equals(this.maintainBegin, showInstanceResponse.maintainBegin)
            && Objects.equals(this.maintainEnd, showInstanceResponse.maintainEnd)
            && Objects.equals(this.enableLogCollection, showInstanceResponse.enableLogCollection)
            && Objects.equals(this.storageSpace, showInstanceResponse.storageSpace)
            && Objects.equals(this.usedStorageSpace, showInstanceResponse.usedStorageSpace)
            && Objects.equals(this.enablePublicip, showInstanceResponse.enablePublicip)
            && Objects.equals(this.publicipId, showInstanceResponse.publicipId)
            && Objects.equals(this.publicipAddress, showInstanceResponse.publicipAddress)
            && Objects.equals(this.sslEnable, showInstanceResponse.sslEnable)
            && Objects.equals(this.crossVpcInfo, showInstanceResponse.crossVpcInfo)
            && Objects.equals(this.storageResourceId, showInstanceResponse.storageResourceId)
            && Objects.equals(this.storageSpecCode, showInstanceResponse.storageSpecCode)
            && Objects.equals(this.serviceType, showInstanceResponse.serviceType)
            && Objects.equals(this.storageType, showInstanceResponse.storageType)
            && Objects.equals(this.extendTimes, showInstanceResponse.extendTimes)
            && Objects.equals(this.ipv6Enable, showInstanceResponse.ipv6Enable)
            && Objects.equals(this.supportFeatures, showInstanceResponse.supportFeatures)
            && Objects.equals(this.diskEncrypted, showInstanceResponse.diskEncrypted)
            && Objects.equals(this.cesVersion, showInstanceResponse.cesVersion)
            && Objects.equals(this.nodeNum, showInstanceResponse.nodeNum)
            && Objects.equals(this.newSpecBillingEnable, showInstanceResponse.newSpecBillingEnable)
            && Objects.equals(this.enableAcl, showInstanceResponse.enableAcl)
            && Objects.equals(this.brokerNum, showInstanceResponse.brokerNum)
            && Objects.equals(this.namesrvAddress, showInstanceResponse.namesrvAddress)
            && Objects.equals(this.brokerAddress, showInstanceResponse.brokerAddress)
            && Objects.equals(this.publicNamesrvAddress, showInstanceResponse.publicNamesrvAddress)
            && Objects.equals(this.publicBrokerAddress, showInstanceResponse.publicBrokerAddress)
            && Objects.equals(this.tags, showInstanceResponse.tags)
            && Objects.equals(this.totalStorageSpace, showInstanceResponse.totalStorageSpace)
            && Objects.equals(this.resourceSpecCode, showInstanceResponse.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            engine,
            status,
            description,
            type,
            specification,
            engineVersion,
            instanceId,
            chargingMode,
            vpcId,
            vpcName,
            createdAt,
            productId,
            securityGroupId,
            securityGroupName,
            subnetId,
            subnetName,
            subnetCidr,
            availableZones,
            userId,
            userName,
            maintainBegin,
            maintainEnd,
            enableLogCollection,
            storageSpace,
            usedStorageSpace,
            enablePublicip,
            publicipId,
            publicipAddress,
            sslEnable,
            crossVpcInfo,
            storageResourceId,
            storageSpecCode,
            serviceType,
            storageType,
            extendTimes,
            ipv6Enable,
            supportFeatures,
            diskEncrypted,
            cesVersion,
            nodeNum,
            newSpecBillingEnable,
            enableAcl,
            brokerNum,
            namesrvAddress,
            brokerAddress,
            publicNamesrvAddress,
            publicBrokerAddress,
            tags,
            totalStorageSpace,
            resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    enableLogCollection: ").append(toIndentedString(enableLogCollection)).append("\n");
        sb.append("    storageSpace: ").append(toIndentedString(storageSpace)).append("\n");
        sb.append("    usedStorageSpace: ").append(toIndentedString(usedStorageSpace)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    publicipAddress: ").append(toIndentedString(publicipAddress)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    crossVpcInfo: ").append(toIndentedString(crossVpcInfo)).append("\n");
        sb.append("    storageResourceId: ").append(toIndentedString(storageResourceId)).append("\n");
        sb.append("    storageSpecCode: ").append(toIndentedString(storageSpecCode)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    extendTimes: ").append(toIndentedString(extendTimes)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    supportFeatures: ").append(toIndentedString(supportFeatures)).append("\n");
        sb.append("    diskEncrypted: ").append(toIndentedString(diskEncrypted)).append("\n");
        sb.append("    cesVersion: ").append(toIndentedString(cesVersion)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    newSpecBillingEnable: ").append(toIndentedString(newSpecBillingEnable)).append("\n");
        sb.append("    enableAcl: ").append(toIndentedString(enableAcl)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    namesrvAddress: ").append(toIndentedString(namesrvAddress)).append("\n");
        sb.append("    brokerAddress: ").append(toIndentedString(brokerAddress)).append("\n");
        sb.append("    publicNamesrvAddress: ").append(toIndentedString(publicNamesrvAddress)).append("\n");
        sb.append("    publicBrokerAddress: ").append(toIndentedString(publicBrokerAddress)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    totalStorageSpace: ").append(toIndentedString(totalStorageSpace)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
