package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlarmTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAlarmTemplateRequestBody body;

    public UpdateAlarmTemplateRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 告警模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public UpdateAlarmTemplateRequest withBody(UpdateAlarmTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmTemplateRequest withBody(Consumer<UpdateAlarmTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAlarmTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAlarmTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAlarmTemplateRequestBody body) {
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
        UpdateAlarmTemplateRequest updateAlarmTemplateRequest = (UpdateAlarmTemplateRequest) o;
        return Objects.equals(this.templateId, updateAlarmTemplateRequest.templateId)
            && Objects.equals(this.body, updateAlarmTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmTemplateRequest {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
