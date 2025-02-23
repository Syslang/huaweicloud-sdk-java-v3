package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.SensitiveMaskResponseRules;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditSensitiveMasksResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<SensitiveMaskResponseRules> rules = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    public ListAuditSensitiveMasksResponse withRules(List<SensitiveMaskResponseRules> rules) {
        this.rules = rules;
        return this;
    }

    
    public ListAuditSensitiveMasksResponse addRulesItem(SensitiveMaskResponseRules rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ListAuditSensitiveMasksResponse withRules(Consumer<List<SensitiveMaskResponseRules>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则列表
     * @return rules
     */
    public List<SensitiveMaskResponseRules> getRules() {
        return rules;
    }

    public void setRules(List<SensitiveMaskResponseRules> rules) {
        this.rules = rules;
    }

    

    public ListAuditSensitiveMasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuditSensitiveMasksResponse listAuditSensitiveMasksResponse = (ListAuditSensitiveMasksResponse) o;
        return Objects.equals(this.rules, listAuditSensitiveMasksResponse.rules) &&
            Objects.equals(this.total, listAuditSensitiveMasksResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rules, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditSensitiveMasksResponse {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

