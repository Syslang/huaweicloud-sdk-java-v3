package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRelationDbRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets_name")

    private String assetsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_start")

    private Integer riskStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_end")

    private Integer riskEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRelationDbRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListRelationDbRequest withAssetsName(String assetsName) {
        this.assetsName = assetsName;
        return this;
    }

    /**
     * 资产名称
     * @return assetsName
     */
    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public ListRelationDbRequest withRiskStart(Integer riskStart) {
        this.riskStart = riskStart;
        return this;
    }

    /**
     * 起始风险等级
     * @return riskStart
     */
    public Integer getRiskStart() {
        return riskStart;
    }

    public void setRiskStart(Integer riskStart) {
        this.riskStart = riskStart;
    }

    public ListRelationDbRequest withRiskEnd(Integer riskEnd) {
        this.riskEnd = riskEnd;
        return this;
    }

    /**
     * 终止风险等级
     * @return riskEnd
     */
    public Integer getRiskEnd() {
        return riskEnd;
    }

    public void setRiskEnd(Integer riskEnd) {
        this.riskEnd = riskEnd;
    }

    public ListRelationDbRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRelationDbRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRelationDbRequest listRelationDbRequest = (ListRelationDbRequest) o;
        return Objects.equals(this.jobId, listRelationDbRequest.jobId)
            && Objects.equals(this.assetsName, listRelationDbRequest.assetsName)
            && Objects.equals(this.riskStart, listRelationDbRequest.riskStart)
            && Objects.equals(this.riskEnd, listRelationDbRequest.riskEnd)
            && Objects.equals(this.offset, listRelationDbRequest.offset)
            && Objects.equals(this.limit, listRelationDbRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, assetsName, riskStart, riskEnd, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationDbRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    assetsName: ").append(toIndentedString(assetsName)).append("\n");
        sb.append("    riskStart: ").append(toIndentedString(riskStart)).append("\n");
        sb.append("    riskEnd: ").append(toIndentedString(riskEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
