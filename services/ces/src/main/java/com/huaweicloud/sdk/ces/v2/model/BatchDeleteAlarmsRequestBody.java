package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteAlarmsRequestBody
 */
public class BatchDeleteAlarmsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private List<String> alarmIds = null;

    public BatchDeleteAlarmsRequestBody withAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    public BatchDeleteAlarmsRequestBody addAlarmIdsItem(String alarmIdsItem) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        this.alarmIds.add(alarmIdsItem);
        return this;
    }

    public BatchDeleteAlarmsRequestBody withAlarmIds(Consumer<List<String>> alarmIdsSetter) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        alarmIdsSetter.accept(this.alarmIds);
        return this;
    }

    /**
     * 需要批量删除的告警规则的ID列表
     * @return alarmIds
     */
    public List<String> getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteAlarmsRequestBody batchDeleteAlarmsRequestBody = (BatchDeleteAlarmsRequestBody) o;
        return Objects.equals(this.alarmIds, batchDeleteAlarmsRequestBody.alarmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAlarmsRequestBody {\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
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
