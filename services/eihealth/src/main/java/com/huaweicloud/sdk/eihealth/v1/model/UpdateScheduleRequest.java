package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateScheduleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateScheduleReq body;

    public UpdateScheduleRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 计算资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateScheduleRequest withBody(UpdateScheduleReq body) {
        this.body = body;
        return this;
    }

    public UpdateScheduleRequest withBody(Consumer<UpdateScheduleReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateScheduleReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateScheduleReq getBody() {
        return body;
    }

    public void setBody(UpdateScheduleReq body) {
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
        UpdateScheduleRequest updateScheduleRequest = (UpdateScheduleRequest) o;
        return Objects.equals(this.id, updateScheduleRequest.id)
            && Objects.equals(this.body, updateScheduleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
