package com.huaweicloud.sdk.cloudpipeline.v2.model;

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
public class ListPipelineSimpleInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<PipelineBasicInfo> result = null;

    public ListPipelineSimpleInfoResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,表示从此偏移量开始查询,offset大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPipelineSimpleInfoResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPipelineSimpleInfoResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条目数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListPipelineSimpleInfoResponse withResult(List<PipelineBasicInfo> result) {
        this.result = result;
        return this;
    }

    public ListPipelineSimpleInfoResponse addResultItem(PipelineBasicInfo resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListPipelineSimpleInfoResponse withResult(Consumer<List<PipelineBasicInfo>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 执行状况数据列表
     * @return result
     */
    public List<PipelineBasicInfo> getResult() {
        return result;
    }

    public void setResult(List<PipelineBasicInfo> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineSimpleInfoResponse listPipelineSimpleInfoResponse = (ListPipelineSimpleInfoResponse) o;
        return Objects.equals(this.offset, listPipelineSimpleInfoResponse.offset)
            && Objects.equals(this.limit, listPipelineSimpleInfoResponse.limit)
            && Objects.equals(this.total, listPipelineSimpleInfoResponse.total)
            && Objects.equals(this.result, listPipelineSimpleInfoResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineSimpleInfoResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
