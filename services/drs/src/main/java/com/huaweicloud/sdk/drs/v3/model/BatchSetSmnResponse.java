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
public class BatchSetSmnResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<ImportSmnResp> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public BatchSetSmnResponse withResults(List<ImportSmnResp> results) {
        this.results = results;
        return this;
    }

    public BatchSetSmnResponse addResultsItem(ImportSmnResp resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchSetSmnResponse withResults(Consumer<List<ImportSmnResp>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * Get results
     * @return results
     */
    public List<ImportSmnResp> getResults() {
        return results;
    }

    public void setResults(List<ImportSmnResp> results) {
        this.results = results;
    }

    public BatchSetSmnResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
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
        BatchSetSmnResponse batchSetSmnResponse = (BatchSetSmnResponse) o;
        return Objects.equals(this.results, batchSetSmnResponse.results)
            && Objects.equals(this.count, batchSetSmnResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetSmnResponse {\n");
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
