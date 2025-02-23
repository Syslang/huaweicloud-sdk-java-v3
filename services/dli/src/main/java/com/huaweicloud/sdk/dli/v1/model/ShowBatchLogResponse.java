package com.huaweicloud.sdk.dli.v1.model;

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
public class ShowBatchLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private List<String> log = null;

    public ShowBatchLogResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 批处理作业的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowBatchLogResponse withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 日志起始索引。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ShowBatchLogResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 日志的总记录数。
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ShowBatchLogResponse withLog(List<String> log) {
        this.log = log;
        return this;
    }

    public ShowBatchLogResponse addLogItem(String logItem) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        this.log.add(logItem);
        return this;
    }

    public ShowBatchLogResponse withLog(Consumer<List<String>> logSetter) {
        if (this.log == null) {
            this.log = new ArrayList<>();
        }
        logSetter.accept(this.log);
        return this;
    }

    /**
     * 显示当前批处理作业日志。
     * @return log
     */
    public List<String> getLog() {
        return log;
    }

    public void setLog(List<String> log) {
        this.log = log;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchLogResponse showBatchLogResponse = (ShowBatchLogResponse) o;
        return Objects.equals(this.id, showBatchLogResponse.id) && Objects.equals(this.from, showBatchLogResponse.from)
            && Objects.equals(this.total, showBatchLogResponse.total)
            && Objects.equals(this.log, showBatchLogResponse.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, total, log);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchLogResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
