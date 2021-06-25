package com.huaweicloud.sdk.lts.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 返回的日志组信息
 */
public class LogGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="creation_time")
    
    private Double creationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_name")
    
    private String logGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_group_id")
    
    private String logGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ttl_in_days")
    
    private Integer ttlInDays;

    public LogGroup withCreationTime(Double creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    


    /**
     * 创建时间 
     * minimum: 9.46656E+17
     * maximum: 4.102416E+18
     * @return creationTime
     */
    public Double getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Double creationTime) {
        this.creationTime = creationTime;
    }

    

    public LogGroup withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    


    /**
     * 日志组名称 
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    

    public LogGroup withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    


    /**
     * 日志组ID 
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    

    public LogGroup withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    


    /**
     * 日志存储时间 天 
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogGroup logGroup = (LogGroup) o;
        return Objects.equals(this.creationTime, logGroup.creationTime) &&
            Objects.equals(this.logGroupName, logGroup.logGroupName) &&
            Objects.equals(this.logGroupId, logGroup.logGroupId) &&
            Objects.equals(this.ttlInDays, logGroup.ttlInDays);
    }
    @Override
    public int hashCode() {
        return Objects.hash(creationTime, logGroupName, logGroupId, ttlInDays);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogGroup {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
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

