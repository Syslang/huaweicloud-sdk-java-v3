package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class KeystoneCreateMappingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private KeystoneCreateMappingRequestBody body;

    public KeystoneCreateMappingRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待注册的映射ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KeystoneCreateMappingRequest withBody(KeystoneCreateMappingRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneCreateMappingRequest withBody(Consumer<KeystoneCreateMappingRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneCreateMappingRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeystoneCreateMappingRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneCreateMappingRequestBody body) {
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
        KeystoneCreateMappingRequest keystoneCreateMappingRequest = (KeystoneCreateMappingRequest) o;
        return Objects.equals(this.id, keystoneCreateMappingRequest.id)
            && Objects.equals(this.body, keystoneCreateMappingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateMappingRequest {\n");
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
