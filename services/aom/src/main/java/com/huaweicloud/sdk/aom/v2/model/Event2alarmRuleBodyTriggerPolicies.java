package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Event2alarmRuleBodyTriggerPolicies
 */
public class Event2alarmRuleBodyTriggerPolicies  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_type")
    
    
    private String triggerType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operator")
    
    
    private String operator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    
    private String level;

    public Event2alarmRuleBodyTriggerPolicies withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 自增编号
     * minimum: 0
     * maximum: 128
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 事件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    


    /**
     * 触发类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * 触发周期
     * minimum: 0
     * maximum: 128
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    


    /**
     * 比较符
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 触发次数
     * minimum: 0
     * maximum: 128
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public Event2alarmRuleBodyTriggerPolicies withLevel(String level) {
        this.level = level;
        return this;
    }

    


    /**
     * 告警等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event2alarmRuleBodyTriggerPolicies event2alarmRuleBodyTriggerPolicies = (Event2alarmRuleBodyTriggerPolicies) o;
        return Objects.equals(this.id, event2alarmRuleBodyTriggerPolicies.id) &&
            Objects.equals(this.name, event2alarmRuleBodyTriggerPolicies.name) &&
            Objects.equals(this.triggerType, event2alarmRuleBodyTriggerPolicies.triggerType) &&
            Objects.equals(this.period, event2alarmRuleBodyTriggerPolicies.period) &&
            Objects.equals(this.operator, event2alarmRuleBodyTriggerPolicies.operator) &&
            Objects.equals(this.count, event2alarmRuleBodyTriggerPolicies.count) &&
            Objects.equals(this.level, event2alarmRuleBodyTriggerPolicies.level);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, triggerType, period, operator, count, level);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event2alarmRuleBodyTriggerPolicies {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

