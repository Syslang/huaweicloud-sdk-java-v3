package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class KeystoneUpdateUserPasswordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private KeystoneUpdateUserPasswordRequestBody body;

    public KeystoneUpdateUserPasswordRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 待修改密码的IAM用户ID，获取方式请参见：[获取用户ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public KeystoneUpdateUserPasswordRequest withBody(KeystoneUpdateUserPasswordRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateUserPasswordRequest withBody(Consumer<KeystoneUpdateUserPasswordRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneUpdateUserPasswordRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateUserPasswordRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateUserPasswordRequestBody body) {
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
        KeystoneUpdateUserPasswordRequest keystoneUpdateUserPasswordRequest = (KeystoneUpdateUserPasswordRequest) o;
        return Objects.equals(this.userId, keystoneUpdateUserPasswordRequest.userId)
            && Objects.equals(this.body, keystoneUpdateUserPasswordRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateUserPasswordRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
