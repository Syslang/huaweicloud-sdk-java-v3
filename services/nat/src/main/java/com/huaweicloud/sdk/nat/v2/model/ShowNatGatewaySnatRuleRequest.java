package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNatGatewaySnatRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule_id")

    private String snatRuleId;

    public ShowNatGatewaySnatRuleRequest withSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return snatRuleId
     */
    public String getSnatRuleId() {
        return snatRuleId;
    }

    public void setSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNatGatewaySnatRuleRequest showNatGatewaySnatRuleRequest = (ShowNatGatewaySnatRuleRequest) o;
        return Objects.equals(this.snatRuleId, showNatGatewaySnatRuleRequest.snatRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNatGatewaySnatRuleRequest {\n");
        sb.append("    snatRuleId: ").append(toIndentedString(snatRuleId)).append("\n");
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
