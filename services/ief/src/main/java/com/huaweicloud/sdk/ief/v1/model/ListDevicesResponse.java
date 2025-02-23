package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDevicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devices")

    private List<Device> devices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDevicesResponse withDevices(List<Device> devices) {
        this.devices = devices;
        return this;
    }

    public ListDevicesResponse addDevicesItem(Device devicesItem) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    public ListDevicesResponse withDevices(Consumer<List<Device>> devicesSetter) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 终端设备属性
     * @return devices
     */
    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public ListDevicesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 满足条件的终端设备个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDevicesResponse listDevicesResponse = (ListDevicesResponse) o;
        return Objects.equals(this.devices, listDevicesResponse.devices)
            && Objects.equals(this.count, listDevicesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDevicesResponse {\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
