package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件实例详细信息-response结构体
 */
public class AddonInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private InstanceSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AddonInstanceStatus status;

    public AddonInstance withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“Addon”，该值不可修改。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public AddonInstance withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”，该值不可修改。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AddonInstance withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public AddonInstance withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public AddonInstance withSpec(InstanceSpec spec) {
        this.spec = spec;
        return this;
    }

    public AddonInstance withSpec(Consumer<InstanceSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new InstanceSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public InstanceSpec getSpec() {
        return spec;
    }

    public void setSpec(InstanceSpec spec) {
        this.spec = spec;
    }

    public AddonInstance withStatus(AddonInstanceStatus status) {
        this.status = status;
        return this;
    }

    public AddonInstance withStatus(Consumer<AddonInstanceStatus> statusSetter) {
        if (this.status == null) {
            this.status = new AddonInstanceStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AddonInstanceStatus getStatus() {
        return status;
    }

    public void setStatus(AddonInstanceStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddonInstance addonInstance = (AddonInstance) o;
        return Objects.equals(this.kind, addonInstance.kind)
            && Objects.equals(this.apiVersion, addonInstance.apiVersion)
            && Objects.equals(this.metadata, addonInstance.metadata) && Objects.equals(this.spec, addonInstance.spec)
            && Objects.equals(this.status, addonInstance.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonInstance {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
