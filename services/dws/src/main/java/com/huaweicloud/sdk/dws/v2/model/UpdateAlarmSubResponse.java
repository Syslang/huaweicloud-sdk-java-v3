package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateAlarmSubResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_space")

    private String nameSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target")

    private String notificationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_type")

    private String notificationTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public UpdateAlarmSubResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 告警订阅ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateAlarmSubResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警订阅名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAlarmSubResponse withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启订阅
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public UpdateAlarmSubResponse withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public UpdateAlarmSubResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户凭证ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateAlarmSubResponse withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * 所属服务，支持DWS,DLI,DGC,CloudTable,CDM,GES,CSS
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public UpdateAlarmSubResponse withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * 消息主题地址
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public UpdateAlarmSubResponse withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * 消息主题名称
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public UpdateAlarmSubResponse withNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
        return this;
    }

    /**
     * 消息主题类型
     * @return notificationTargetType
     */
    public String getNotificationTargetType() {
        return notificationTargetType;
    }

    public void setNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
    }

    public UpdateAlarmSubResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UpdateAlarmSubResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmSubResponse updateAlarmSubResponse = (UpdateAlarmSubResponse) o;
        return Objects.equals(this.id, updateAlarmSubResponse.id)
            && Objects.equals(this.name, updateAlarmSubResponse.name)
            && Objects.equals(this.enable, updateAlarmSubResponse.enable)
            && Objects.equals(this.alarmLevel, updateAlarmSubResponse.alarmLevel)
            && Objects.equals(this.projectId, updateAlarmSubResponse.projectId)
            && Objects.equals(this.nameSpace, updateAlarmSubResponse.nameSpace)
            && Objects.equals(this.notificationTarget, updateAlarmSubResponse.notificationTarget)
            && Objects.equals(this.notificationTargetName, updateAlarmSubResponse.notificationTargetName)
            && Objects.equals(this.notificationTargetType, updateAlarmSubResponse.notificationTargetType)
            && Objects.equals(this.language, updateAlarmSubResponse.language)
            && Objects.equals(this.timeZone, updateAlarmSubResponse.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            enable,
            alarmLevel,
            projectId,
            nameSpace,
            notificationTarget,
            notificationTargetName,
            notificationTargetType,
            language,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmSubResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    notificationTarget: ").append(toIndentedString(notificationTarget)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetType: ").append(toIndentedString(notificationTargetType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
