package com.huaweicloud.sdk.drs.v3.model;

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
public class BatchValidateClustersConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<CheckJobResp> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public BatchValidateClustersConnectionsResponse withResults(List<CheckJobResp> results) {
        this.results = results;
        return this;
    }

    public BatchValidateClustersConnectionsResponse addResultsItem(CheckJobResp resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchValidateClustersConnectionsResponse withResults(Consumer<List<CheckJobResp>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量测试连接响应体集合。
     * @return results
     */
    public List<CheckJobResp> getResults() {
        return results;
    }

    public void setResults(List<CheckJobResp> results) {
        this.results = results;
    }

    public BatchValidateClustersConnectionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数。
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
        BatchValidateClustersConnectionsResponse batchValidateClustersConnectionsResponse =
            (BatchValidateClustersConnectionsResponse) o;
        return Objects.equals(this.results, batchValidateClustersConnectionsResponse.results)
            && Objects.equals(this.count, batchValidateClustersConnectionsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchValidateClustersConnectionsResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
