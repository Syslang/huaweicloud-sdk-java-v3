package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowCeshierarchyRespQueues1
 */
public class ShowCeshierarchyRespQueues1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<ShowCeshierarchyRespPartitions> partitions = null;

    public ShowCeshierarchyRespQueues1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespQueues1 withPartitions(List<ShowCeshierarchyRespPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ShowCeshierarchyRespQueues1 addPartitionsItem(ShowCeshierarchyRespPartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowCeshierarchyRespQueues1 withPartitions(Consumer<List<ShowCeshierarchyRespPartitions>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 分区信息。
     * @return partitions
     */
    public List<ShowCeshierarchyRespPartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<ShowCeshierarchyRespPartitions> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCeshierarchyRespQueues1 showCeshierarchyRespQueues1 = (ShowCeshierarchyRespQueues1) o;
        return Objects.equals(this.name, showCeshierarchyRespQueues1.name)
            && Objects.equals(this.partitions, showCeshierarchyRespQueues1.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespQueues1 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
