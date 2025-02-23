package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * &gt; 说明： &gt;  &gt; 如果是从镜像创建云硬盘，则不支持传入“__system__encrypted”和“__system__cmkid”字段，创建出来的云硬盘与镜像的加密属性一致。
 */
public class PrePaidServerDataVolumeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")

    private String systemEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    public PrePaidServerDataVolumeMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    /**
     * metadata中的表示加密功能的字段，0代表不加密，1代表加密。  该字段不存在时，云硬盘默认为不加密。
     * @return systemEncrypted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public PrePaidServerDataVolumeMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    /**
     * metadata中的加密cmkid字段，与__system__encrypted配合表示需要加密，cmkid长度固定为36个字节。  > 说明：  - 请参考[查询密钥列表](https://support.huaweicloud.com/api-dew/ListKeys.html)，通过HTTPS请求获取密钥ID。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerDataVolumeMetadata prePaidServerDataVolumeMetadata = (PrePaidServerDataVolumeMetadata) o;
        return Objects.equals(this.systemEncrypted, prePaidServerDataVolumeMetadata.systemEncrypted)
            && Objects.equals(this.systemCmkid, prePaidServerDataVolumeMetadata.systemCmkid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemEncrypted, systemCmkid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerDataVolumeMetadata {\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
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
