package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘IO信息。
 */
public class ExtendProductIosEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_spec")

    private String ioSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unavailable_zones")

    private List<String> unavailableZones = null;

    public ExtendProductIosEntity withIoSpec(String ioSpec) {
        this.ioSpec = ioSpec;
        return this;
    }

    /**
     * 存储IO规格。
     * @return ioSpec
     */
    public String getIoSpec() {
        return ioSpec;
    }

    public void setIoSpec(String ioSpec) {
        this.ioSpec = ioSpec;
    }

    public ExtendProductIosEntity withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ExtendProductIosEntity addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ExtendProductIosEntity withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 有可用资源的可用区列表。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public ExtendProductIosEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * IO类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExtendProductIosEntity withUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
        return this;
    }

    public ExtendProductIosEntity addUnavailableZonesItem(String unavailableZonesItem) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        this.unavailableZones.add(unavailableZonesItem);
        return this;
    }

    public ExtendProductIosEntity withUnavailableZones(Consumer<List<String>> unavailableZonesSetter) {
        if (this.unavailableZones == null) {
            this.unavailableZones = new ArrayList<>();
        }
        unavailableZonesSetter.accept(this.unavailableZones);
        return this;
    }

    /**
     * 资源售罄的可用区列表。
     * @return unavailableZones
     */
    public List<String> getUnavailableZones() {
        return unavailableZones;
    }

    public void setUnavailableZones(List<String> unavailableZones) {
        this.unavailableZones = unavailableZones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendProductIosEntity extendProductIosEntity = (ExtendProductIosEntity) o;
        return Objects.equals(this.ioSpec, extendProductIosEntity.ioSpec)
            && Objects.equals(this.availableZones, extendProductIosEntity.availableZones)
            && Objects.equals(this.type, extendProductIosEntity.type)
            && Objects.equals(this.unavailableZones, extendProductIosEntity.unavailableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ioSpec, availableZones, type, unavailableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendProductIosEntity {\n");
        sb.append("    ioSpec: ").append(toIndentedString(ioSpec)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unavailableZones: ").append(toIndentedString(unavailableZones)).append("\n");
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
