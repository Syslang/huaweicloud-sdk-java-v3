package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UnpublishAssetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PublishAssetReq body;

    public UnpublishAssetsRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。 
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public UnpublishAssetsRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。 
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public UnpublishAssetsRequest withBody(PublishAssetReq body) {
        this.body = body;
        return this;
    }

    public UnpublishAssetsRequest withBody(Consumer<PublishAssetReq> bodySetter) {
        if (this.body == null) {
            this.body = new PublishAssetReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PublishAssetReq getBody() {
        return body;
    }

    public void setBody(PublishAssetReq body) {
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
        UnpublishAssetsRequest unpublishAssetsRequest = (UnpublishAssetsRequest) o;
        return Objects.equals(this.authorization, unpublishAssetsRequest.authorization)
            && Objects.equals(this.xSdkDate, unpublishAssetsRequest.xSdkDate)
            && Objects.equals(this.body, unpublishAssetsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnpublishAssetsRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
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
