package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备升级包信息
 */
public class OtaPackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_source_versions")

    private List<String> supportSourceVersions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_info")

    private String customInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public OtaPackageInfo withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * **参数说明**：升级包ID，用于唯一标识一个升级包。由物联网平台分配获得。 **取值范围**：长度不超过36，只允许字母、数字、连接符（-）的组合。
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public OtaPackageInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public OtaPackageInfo withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * **参数说明**：升级包类型。 **取值范围**：软件包必须设置为：softwarePackage，固件包必须设置为：firmwarePackage。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public OtaPackageInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数说明**：设备关联的产品ID，用于唯一标识一个产品模型，创建产品后获得。方法请参见 [[创建产品](https://support.huaweicloud.com/api-iothub/iot_06_v5_0050.html)](tag:hws)[[创建产品](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0050.html)](tag:hws_hk)。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OtaPackageInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数说明**：升级包版本号。 **取值范围**：长度不超过256，只允许字母、数字、下划线（_）、连接符（-）、英文点（.）的组合。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OtaPackageInfo withSupportSourceVersions(List<String> supportSourceVersions) {
        this.supportSourceVersions = supportSourceVersions;
        return this;
    }

    public OtaPackageInfo addSupportSourceVersionsItem(String supportSourceVersionsItem) {
        if (this.supportSourceVersions == null) {
            this.supportSourceVersions = new ArrayList<>();
        }
        this.supportSourceVersions.add(supportSourceVersionsItem);
        return this;
    }

    public OtaPackageInfo withSupportSourceVersions(Consumer<List<String>> supportSourceVersionsSetter) {
        if (this.supportSourceVersions == null) {
            this.supportSourceVersions = new ArrayList<>();
        }
        supportSourceVersionsSetter.accept(this.supportSourceVersions);
        return this;
    }

    /**
     * **参数说明**：支持用于升级此版本包的设备源版本号列表。最多支持20个源版本号。 **取值范围**：源版本号列表，源版本号只允许字母、数字、下划线（_）、连接符（-）、英文点（.）的组合。
     * @return supportSourceVersions
     */
    public List<String> getSupportSourceVersions() {
        return supportSourceVersions;
    }

    public void setSupportSourceVersions(List<String> supportSourceVersions) {
        this.supportSourceVersions = supportSourceVersions;
    }

    public OtaPackageInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：用于描述升级包的功能等信息。 **取值范围**：长度不超过1024。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OtaPackageInfo withCustomInfo(String customInfo) {
        this.customInfo = customInfo;
        return this;
    }

    /**
     * **参数说明**：推送给设备的自定义信息。添加该升级包完成，并创建升级任务后，物联网平台向设备下发升级通知时，会下发该自定义信息给设备。 **取值范围**：长度不超过4096。
     * @return customInfo
     */
    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    public OtaPackageInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 软固件包上传到物联网平台的时间，格式：\"yyyyMMdd'T'HHmmss'Z'\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtaPackageInfo otaPackageInfo = (OtaPackageInfo) o;
        return Objects.equals(this.packageId, otaPackageInfo.packageId)
            && Objects.equals(this.appId, otaPackageInfo.appId)
            && Objects.equals(this.packageType, otaPackageInfo.packageType)
            && Objects.equals(this.productId, otaPackageInfo.productId)
            && Objects.equals(this.version, otaPackageInfo.version)
            && Objects.equals(this.supportSourceVersions, otaPackageInfo.supportSourceVersions)
            && Objects.equals(this.description, otaPackageInfo.description)
            && Objects.equals(this.customInfo, otaPackageInfo.customInfo)
            && Objects.equals(this.createTime, otaPackageInfo.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId,
            appId,
            packageType,
            productId,
            version,
            supportSourceVersions,
            description,
            customInfo,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtaPackageInfo {\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    supportSourceVersions: ").append(toIndentedString(supportSourceVersions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customInfo: ").append(toIndentedString(customInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
