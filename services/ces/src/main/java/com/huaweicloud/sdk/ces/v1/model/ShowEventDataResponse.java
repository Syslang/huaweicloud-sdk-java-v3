package com.huaweicloud.sdk.ces.v1.model;

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
public class ShowEventDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<EventDataInfo> datapoints = null;

    public ShowEventDataResponse withDatapoints(List<EventDataInfo> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ShowEventDataResponse addDatapointsItem(EventDataInfo datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ShowEventDataResponse withDatapoints(Consumer<List<EventDataInfo>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 配置信息列表。如果不存在对应的配置信息，则datapoints为空数组[]。
     * @return datapoints
     */
    public List<EventDataInfo> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<EventDataInfo> datapoints) {
        this.datapoints = datapoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventDataResponse showEventDataResponse = (ShowEventDataResponse) o;
        return Objects.equals(this.datapoints, showEventDataResponse.datapoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datapoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDataResponse {\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
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
