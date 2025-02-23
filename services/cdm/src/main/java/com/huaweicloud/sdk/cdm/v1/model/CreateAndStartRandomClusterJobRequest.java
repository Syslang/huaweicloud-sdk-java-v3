package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAndStartRandomClusterJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CdmRandomCreateAndStartJobJsonReq body;

    public CreateAndStartRandomClusterJobRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CreateAndStartRandomClusterJobRequest withBody(CdmRandomCreateAndStartJobJsonReq body) {
        this.body = body;
        return this;
    }

    public CreateAndStartRandomClusterJobRequest withBody(Consumer<CdmRandomCreateAndStartJobJsonReq> bodySetter) {
        if (this.body == null) {
            this.body = new CdmRandomCreateAndStartJobJsonReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CdmRandomCreateAndStartJobJsonReq getBody() {
        return body;
    }

    public void setBody(CdmRandomCreateAndStartJobJsonReq body) {
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
        CreateAndStartRandomClusterJobRequest createAndStartRandomClusterJobRequest =
            (CreateAndStartRandomClusterJobRequest) o;
        return Objects.equals(this.xLanguage, createAndStartRandomClusterJobRequest.xLanguage)
            && Objects.equals(this.body, createAndStartRandomClusterJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAndStartRandomClusterJobRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
