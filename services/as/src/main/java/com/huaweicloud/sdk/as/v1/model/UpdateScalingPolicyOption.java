package com.huaweicloud.sdk.as.v1.model;

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
 * 修改伸缩策略
 */
public class UpdateScalingPolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_name")

    private String scalingPolicyName;

    /**
     * 策略类型。告警策略：ALARM（与alarm_id对应）；定时策略：SCHEDULED（与scheduled_policy对应）；周期策略：RECURRENCE（与scheduled_policy对应）
     */
    public static final class ScalingPolicyTypeEnum {

        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final ScalingPolicyTypeEnum ALARM = new ScalingPolicyTypeEnum("ALARM");

        /**
         * Enum SCHEDULED for value: "SCHEDULED"
         */
        public static final ScalingPolicyTypeEnum SCHEDULED = new ScalingPolicyTypeEnum("SCHEDULED");

        /**
         * Enum RECURRENCE for value: "RECURRENCE"
         */
        public static final ScalingPolicyTypeEnum RECURRENCE = new ScalingPolicyTypeEnum("RECURRENCE");

        private static final Map<String, ScalingPolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalingPolicyTypeEnum> createStaticFields() {
            Map<String, ScalingPolicyTypeEnum> map = new HashMap<>();
            map.put("ALARM", ALARM);
            map.put("SCHEDULED", SCHEDULED);
            map.put("RECURRENCE", RECURRENCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalingPolicyTypeEnum(String value) {
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
        public static ScalingPolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ScalingPolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingPolicyTypeEnum(value);
            }
            return result;
        }

        public static ScalingPolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ScalingPolicyTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalingPolicyTypeEnum) {
                return this.value.equals(((ScalingPolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_type")

    private ScalingPolicyTypeEnum scalingPolicyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_policy")

    private ScheduledPolicy scheduledPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_action")

    private ScalingPolicyActionV1 scalingPolicyAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cool_down_time")

    private Integer coolDownTime;

    public UpdateScalingPolicyOption withScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
        return this;
    }

    /**
     * 策略名称(1-64字符)，可以用中文、字母、数字、下划线、中划线的组合。
     * @return scalingPolicyName
     */
    public String getScalingPolicyName() {
        return scalingPolicyName;
    }

    public void setScalingPolicyName(String scalingPolicyName) {
        this.scalingPolicyName = scalingPolicyName;
    }

    public UpdateScalingPolicyOption withScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
        return this;
    }

    /**
     * 策略类型。告警策略：ALARM（与alarm_id对应）；定时策略：SCHEDULED（与scheduled_policy对应）；周期策略：RECURRENCE（与scheduled_policy对应）
     * @return scalingPolicyType
     */
    public ScalingPolicyTypeEnum getScalingPolicyType() {
        return scalingPolicyType;
    }

    public void setScalingPolicyType(ScalingPolicyTypeEnum scalingPolicyType) {
        this.scalingPolicyType = scalingPolicyType;
    }

    public UpdateScalingPolicyOption withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警ID，即告警规则的ID，当scaling_policy_type为ALARM时该项必选，此时scheduled_policy不生效。创建告警策略成功后，会自动为该告警ID对应的告警规则的alarm_actions字段增加类型为autoscaling的告警触发动作。告警ID通过查询云监控告警规则列表获取，详见《云监控API参考》的“查询告警规则列表”。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateScalingPolicyOption withScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public UpdateScalingPolicyOption withScheduledPolicy(Consumer<ScheduledPolicy> scheduledPolicySetter) {
        if (this.scheduledPolicy == null) {
            this.scheduledPolicy = new ScheduledPolicy();
            scheduledPolicySetter.accept(this.scheduledPolicy);
        }

        return this;
    }

    /**
     * Get scheduledPolicy
     * @return scheduledPolicy
     */
    public ScheduledPolicy getScheduledPolicy() {
        return scheduledPolicy;
    }

    public void setScheduledPolicy(ScheduledPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
    }

    public UpdateScalingPolicyOption withScalingPolicyAction(ScalingPolicyActionV1 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
        return this;
    }

    public UpdateScalingPolicyOption withScalingPolicyAction(
        Consumer<ScalingPolicyActionV1> scalingPolicyActionSetter) {
        if (this.scalingPolicyAction == null) {
            this.scalingPolicyAction = new ScalingPolicyActionV1();
            scalingPolicyActionSetter.accept(this.scalingPolicyAction);
        }

        return this;
    }

    /**
     * Get scalingPolicyAction
     * @return scalingPolicyAction
     */
    public ScalingPolicyActionV1 getScalingPolicyAction() {
        return scalingPolicyAction;
    }

    public void setScalingPolicyAction(ScalingPolicyActionV1 scalingPolicyAction) {
        this.scalingPolicyAction = scalingPolicyAction;
    }

    public UpdateScalingPolicyOption withCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
        return this;
    }

    /**
     * 冷却时间，取值范围0-86400，默认为900，单位是秒。
     * maximum: 86400
     * @return coolDownTime
     */
    public Integer getCoolDownTime() {
        return coolDownTime;
    }

    public void setCoolDownTime(Integer coolDownTime) {
        this.coolDownTime = coolDownTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateScalingPolicyOption updateScalingPolicyOption = (UpdateScalingPolicyOption) o;
        return Objects.equals(this.scalingPolicyName, updateScalingPolicyOption.scalingPolicyName)
            && Objects.equals(this.scalingPolicyType, updateScalingPolicyOption.scalingPolicyType)
            && Objects.equals(this.alarmId, updateScalingPolicyOption.alarmId)
            && Objects.equals(this.scheduledPolicy, updateScalingPolicyOption.scheduledPolicy)
            && Objects.equals(this.scalingPolicyAction, updateScalingPolicyOption.scalingPolicyAction)
            && Objects.equals(this.coolDownTime, updateScalingPolicyOption.coolDownTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scalingPolicyName, scalingPolicyType, alarmId, scheduledPolicy, scalingPolicyAction, coolDownTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScalingPolicyOption {\n");
        sb.append("    scalingPolicyName: ").append(toIndentedString(scalingPolicyName)).append("\n");
        sb.append("    scalingPolicyType: ").append(toIndentedString(scalingPolicyType)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    scalingPolicyAction: ").append(toIndentedString(scalingPolicyAction)).append("\n");
        sb.append("    coolDownTime: ").append(toIndentedString(coolDownTime)).append("\n");
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
