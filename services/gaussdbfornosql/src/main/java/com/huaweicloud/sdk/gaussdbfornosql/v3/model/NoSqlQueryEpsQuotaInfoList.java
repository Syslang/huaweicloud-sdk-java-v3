package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoSqlQueryEpsQuotaInfoList
 */
public class NoSqlQueryEpsQuotaInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private NoSqlEpsQuota quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private NoSqlQueryEpsQuotaUsed used;

    public NoSqlQueryEpsQuotaInfoList withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NoSqlQueryEpsQuotaInfoList withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public NoSqlQueryEpsQuotaInfoList withQuota(NoSqlEpsQuota quota) {
        this.quota = quota;
        return this;
    }

    public NoSqlQueryEpsQuotaInfoList withQuota(Consumer<NoSqlEpsQuota> quotaSetter) {
        if (this.quota == null) {
            this.quota = new NoSqlEpsQuota();
            quotaSetter.accept(this.quota);
        }

        return this;
    }

    /**
     * Get quota
     * @return quota
     */
    public NoSqlEpsQuota getQuota() {
        return quota;
    }

    public void setQuota(NoSqlEpsQuota quota) {
        this.quota = quota;
    }

    public NoSqlQueryEpsQuotaInfoList withUsed(NoSqlQueryEpsQuotaUsed used) {
        this.used = used;
        return this;
    }

    public NoSqlQueryEpsQuotaInfoList withUsed(Consumer<NoSqlQueryEpsQuotaUsed> usedSetter) {
        if (this.used == null) {
            this.used = new NoSqlQueryEpsQuotaUsed();
            usedSetter.accept(this.used);
        }

        return this;
    }

    /**
     * Get used
     * @return used
     */
    public NoSqlQueryEpsQuotaUsed getUsed() {
        return used;
    }

    public void setUsed(NoSqlQueryEpsQuotaUsed used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoSqlQueryEpsQuotaInfoList noSqlQueryEpsQuotaInfoList = (NoSqlQueryEpsQuotaInfoList) o;
        return Objects.equals(this.enterpriseProjectId, noSqlQueryEpsQuotaInfoList.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, noSqlQueryEpsQuotaInfoList.enterpriseProjectName)
            && Objects.equals(this.quota, noSqlQueryEpsQuotaInfoList.quota)
            && Objects.equals(this.used, noSqlQueryEpsQuotaInfoList.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, enterpriseProjectName, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlQueryEpsQuotaInfoList {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
