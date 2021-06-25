package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowQuotaResponseBodyQuotas
 */
public class ShowQuotaResponseBodyQuotas  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_limit")
    
    private Integer quotaLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Integer used;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_domain_id")
    
    private String userDomainId;

    public ShowQuotaResponseBodyQuotas withQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
        return this;
    }

    


    /**
     * 配额上限
     * @return quotaLimit
     */
    public Integer getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(Integer quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    

    public ShowQuotaResponseBodyQuotas withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 配额类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ShowQuotaResponseBodyQuotas withUsed(Integer used) {
        this.used = used;
        return this;
    }

    


    /**
     * 已使用配额数
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    

    public ShowQuotaResponseBodyQuotas withUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
        return this;
    }

    


    /**
     * 域名所属用户的domain_id。
     * @return userDomainId
     */
    public String getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(String userDomainId) {
        this.userDomainId = userDomainId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQuotaResponseBodyQuotas showQuotaResponseBodyQuotas = (ShowQuotaResponseBodyQuotas) o;
        return Objects.equals(this.quotaLimit, showQuotaResponseBodyQuotas.quotaLimit) &&
            Objects.equals(this.type, showQuotaResponseBodyQuotas.type) &&
            Objects.equals(this.used, showQuotaResponseBodyQuotas.used) &&
            Objects.equals(this.userDomainId, showQuotaResponseBodyQuotas.userDomainId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaLimit, type, used, userDomainId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaResponseBodyQuotas {\n");
        sb.append("    quotaLimit: ").append(toIndentedString(quotaLimit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    userDomainId: ").append(toIndentedString(userDomainId)).append("\n");
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

