package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlErrorLogList
 */
public class MysqlErrorLogList  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    

    private String content;

    public MysqlErrorLogList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public MysqlErrorLogList withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 日期时间UTC时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    public MysqlErrorLogList withLevel(String level) {
        this.level = level;
        return this;
    }

    


    /**
     * 日志级别。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    

    public MysqlErrorLogList withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 错误日志内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlErrorLogList mysqlErrorLogList = (MysqlErrorLogList) o;
        return Objects.equals(this.nodeId, mysqlErrorLogList.nodeId) &&
            Objects.equals(this.time, mysqlErrorLogList.time) &&
            Objects.equals(this.level, mysqlErrorLogList.level) &&
            Objects.equals(this.content, mysqlErrorLogList.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, time, level, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlErrorLogList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

