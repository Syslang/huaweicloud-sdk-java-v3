package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对比列表信息体。
 */
public class CompareJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 对比任务的状态。取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。 - TIMEOUT_INTERRUPT：超时中断。 - FULL_DOING：全量校验中。 - INCRE_DOING：增量校验中。
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum WAITING_FOR_RUNNING for value: "WAITING_FOR_RUNNING"
         */
        public static final StatusEnum WAITING_FOR_RUNNING = new StatusEnum("WAITING_FOR_RUNNING");

        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final StatusEnum SUCCESSFUL = new StatusEnum("SUCCESSFUL");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final StatusEnum CANCELLED = new StatusEnum("CANCELLED");

        /**
         * Enum TIMEOUT_INTERRUPT for value: "TIMEOUT_INTERRUPT"
         */
        public static final StatusEnum TIMEOUT_INTERRUPT = new StatusEnum("TIMEOUT_INTERRUPT");

        /**
         * Enum FULL_DOING for value: "FULL_DOING"
         */
        public static final StatusEnum FULL_DOING = new StatusEnum("FULL_DOING");

        /**
         * Enum INCRE_DOING for value: "INCRE_DOING"
         */
        public static final StatusEnum INCRE_DOING = new StatusEnum("INCRE_DOING");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("WAITING_FOR_RUNNING", WAITING_FOR_RUNNING);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            map.put("TIMEOUT_INTERRUPT", TIMEOUT_INTERRUPT);
            map.put("FULL_DOING", FULL_DOING);
            map.put("INCRE_DOING", INCRE_DOING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_type")

    private String computeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_status")

    private String exportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_remain_seconds")

    private String reportRemainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_tag")

    private Map<String, String> compareJobTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public CompareJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对比任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompareJobInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对比类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CompareJobInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CompareJobInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CompareJobInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比任务的状态。取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。 - TIMEOUT_INTERRUPT：超时中断。 - FULL_DOING：全量校验中。 - INCRE_DOING：增量校验中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CompareJobInfo withComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * 对比计算资源。
     * @return computeType
     */
    public String getComputeType() {
        return computeType;
    }

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    public CompareJobInfo withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 导出比对结果状态。
     * @return exportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public CompareJobInfo withReportRemainSeconds(String reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
        return this;
    }

    /**
     * 导出比对结果有效期剩余时间。
     * @return reportRemainSeconds
     */
    public String getReportRemainSeconds() {
        return reportRemainSeconds;
    }

    public void setReportRemainSeconds(String reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
    }

    public CompareJobInfo withCompareJobTag(Map<String, String> compareJobTag) {
        this.compareJobTag = compareJobTag;
        return this;
    }

    public CompareJobInfo putCompareJobTagItem(String key, String compareJobTagItem) {
        if (this.compareJobTag == null) {
            this.compareJobTag = new HashMap<>();
        }
        this.compareJobTag.put(key, compareJobTagItem);
        return this;
    }

    public CompareJobInfo withCompareJobTag(Consumer<Map<String, String>> compareJobTagSetter) {
        if (this.compareJobTag == null) {
            this.compareJobTag = new HashMap<>();
        }
        compareJobTagSetter.accept(this.compareJobTag);
        return this;
    }

    /**
     * 对比任务的标签。
     * @return compareJobTag
     */
    public Map<String, String> getCompareJobTag() {
        return compareJobTag;
    }

    public void setCompareJobTag(Map<String, String> compareJobTag) {
        this.compareJobTag = compareJobTag;
    }

    public CompareJobInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 失败原因。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareJobInfo compareJobInfo = (CompareJobInfo) o;
        return Objects.equals(this.id, compareJobInfo.id) && Objects.equals(this.type, compareJobInfo.type)
            && Objects.equals(this.startTime, compareJobInfo.startTime)
            && Objects.equals(this.endTime, compareJobInfo.endTime)
            && Objects.equals(this.status, compareJobInfo.status)
            && Objects.equals(this.computeType, compareJobInfo.computeType)
            && Objects.equals(this.exportStatus, compareJobInfo.exportStatus)
            && Objects.equals(this.reportRemainSeconds, compareJobInfo.reportRemainSeconds)
            && Objects.equals(this.compareJobTag, compareJobInfo.compareJobTag)
            && Objects.equals(this.errorMsg, compareJobInfo.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            startTime,
            endTime,
            status,
            computeType,
            exportStatus,
            reportRemainSeconds,
            compareJobTag,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareJobInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
        sb.append("    reportRemainSeconds: ").append(toIndentedString(reportRemainSeconds)).append("\n");
        sb.append("    compareJobTag: ").append(toIndentedString(compareJobTag)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
