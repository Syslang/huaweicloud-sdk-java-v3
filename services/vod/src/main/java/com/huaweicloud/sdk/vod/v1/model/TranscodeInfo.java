package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.Output;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转码生成文件信息。仅当转码成功后才能查询到此信息，未转码、正在转码以及转码失败时，此字段为空。
 */
public class TranscodeInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_group_name")
    
    private String templateGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private List<Output> output = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exec_desc")
    
    private String execDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transcode_status")
    
    private String transcodeStatus;

    public TranscodeInfo withTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }

    


    /**
     * 转码模板组名称
     * @return templateGroupName
     */
    public String getTemplateGroupName() {
        return templateGroupName;
    }

    public void setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
    }

    

    public TranscodeInfo withOutput(List<Output> output) {
        this.output = output;
        return this;
    }

    
    public TranscodeInfo addOutputItem(Output outputItem) {
        if(this.output == null) {
            this.output = new ArrayList<>();
        }
        this.output.add(outputItem);
        return this;
    }

    public TranscodeInfo withOutput(Consumer<List<Output>> outputSetter) {
        if(this.output == null) {
            this.output = new ArrayList<>();
        }
        outputSetter.accept(this.output);
        return this;
    }

    /**
     * Get output
     * @return output
     */
    public List<Output> getOutput() {
        return output;
    }

    public void setOutput(List<Output> output) {
        this.output = output;
    }

    

    public TranscodeInfo withExecDesc(String execDesc) {
        this.execDesc = execDesc;
        return this;
    }

    


    /**
     * Get execDesc
     * @return execDesc
     */
    public String getExecDesc() {
        return execDesc;
    }

    public void setExecDesc(String execDesc) {
        this.execDesc = execDesc;
    }

    

    public TranscodeInfo withTranscodeStatus(String transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
        return this;
    }

    


    /**
     * Get transcodeStatus
     * @return transcodeStatus
     */
    public String getTranscodeStatus() {
        return transcodeStatus;
    }

    public void setTranscodeStatus(String transcodeStatus) {
        this.transcodeStatus = transcodeStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscodeInfo transcodeInfo = (TranscodeInfo) o;
        return Objects.equals(this.templateGroupName, transcodeInfo.templateGroupName) &&
            Objects.equals(this.output, transcodeInfo.output) &&
            Objects.equals(this.execDesc, transcodeInfo.execDesc) &&
            Objects.equals(this.transcodeStatus, transcodeInfo.transcodeStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateGroupName, output, execDesc, transcodeStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeInfo {\n");
        sb.append("    templateGroupName: ").append(toIndentedString(templateGroupName)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    execDesc: ").append(toIndentedString(execDesc)).append("\n");
        sb.append("    transcodeStatus: ").append(toIndentedString(transcodeStatus)).append("\n");
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

