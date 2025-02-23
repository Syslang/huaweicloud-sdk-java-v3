package com.huaweicloud.sdk.aos.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateTemplateMetadataRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateTemplateMetadataRequestBody body;

    public UpdateTemplateMetadataRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    


    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    

    public UpdateTemplateMetadataRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 用户希望创建的模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    

    public UpdateTemplateMetadataRequest withBody(UpdateTemplateMetadataRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTemplateMetadataRequest withBody(Consumer<UpdateTemplateMetadataRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateTemplateMetadataRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateTemplateMetadataRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTemplateMetadataRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTemplateMetadataRequest updateTemplateMetadataRequest = (UpdateTemplateMetadataRequest) o;
        return Objects.equals(this.clientRequestId, updateTemplateMetadataRequest.clientRequestId) &&
            Objects.equals(this.templateName, updateTemplateMetadataRequest.templateName) &&
            Objects.equals(this.body, updateTemplateMetadataRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, templateName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplateMetadataRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

