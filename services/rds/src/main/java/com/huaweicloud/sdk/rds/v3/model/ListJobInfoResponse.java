package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListJobInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private GetJobInfoResponseBodyJob job;

    public ListJobInfoResponse withJob(GetJobInfoResponseBodyJob job) {
        this.job = job;
        return this;
    }

    public ListJobInfoResponse withJob(Consumer<GetJobInfoResponseBodyJob> jobSetter) {
        if (this.job == null) {
            this.job = new GetJobInfoResponseBodyJob();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public GetJobInfoResponseBodyJob getJob() {
        return job;
    }

    public void setJob(GetJobInfoResponseBodyJob job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobInfoResponse listJobInfoResponse = (ListJobInfoResponse) o;
        return Objects.equals(this.job, listJobInfoResponse.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobInfoResponse {\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
