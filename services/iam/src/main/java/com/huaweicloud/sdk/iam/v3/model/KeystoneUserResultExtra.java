package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class KeystoneUserResultExtra {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_status")

    private Boolean pwdStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_project_id")

    private String lastProjectId;

    public KeystoneUserResultExtra withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * IAM用户描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public KeystoneUserResultExtra withPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
        return this;
    }

    /**
     * IAM用户密码状态。true：需要修改密码，false：正常。
     * @return pwdStatus
     */
    public Boolean getPwdStatus() {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus) {
        this.pwdStatus = pwdStatus;
    }

    public KeystoneUserResultExtra withLastProjectId(String lastProjectId) {
        this.lastProjectId = lastProjectId;
        return this;
    }

    /**
     * IAM用户退出系统前，在控制台最后访问的项目ID。
     * @return lastProjectId
     */
    public String getLastProjectId() {
        return lastProjectId;
    }

    public void setLastProjectId(String lastProjectId) {
        this.lastProjectId = lastProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUserResultExtra keystoneUserResultExtra = (KeystoneUserResultExtra) o;
        return Objects.equals(this.description, keystoneUserResultExtra.description)
            && Objects.equals(this.pwdStatus, keystoneUserResultExtra.pwdStatus)
            && Objects.equals(this.lastProjectId, keystoneUserResultExtra.lastProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, pwdStatus, lastProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUserResultExtra {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    pwdStatus: ").append(toIndentedString(pwdStatus)).append("\n");
        sb.append("    lastProjectId: ").append(toIndentedString(lastProjectId)).append("\n");
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
