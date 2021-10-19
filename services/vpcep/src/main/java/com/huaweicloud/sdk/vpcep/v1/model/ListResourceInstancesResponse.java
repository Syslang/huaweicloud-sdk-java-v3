package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListResourceInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private ResourceInstance resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListResourceInstancesResponse withResources(ResourceInstance resources) {
        this.resources = resources;
        return this;
    }

    public ListResourceInstancesResponse withResources(Consumer<ResourceInstance> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ResourceInstance();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /** Get resources
     * 
     * @return resources */
    public ResourceInstance getResources() {
        return resources;
    }

    public void setResources(ResourceInstance resources) {
        this.resources = resources;
    }

    public ListResourceInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 总记录数。 minimum: 1
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceInstancesResponse listResourceInstancesResponse = (ListResourceInstancesResponse) o;
        return Objects.equals(this.resources, listResourceInstancesResponse.resources)
            && Objects.equals(this.totalCount, listResourceInstancesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstancesResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
