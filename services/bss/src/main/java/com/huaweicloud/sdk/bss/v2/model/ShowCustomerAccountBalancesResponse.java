package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCustomerAccountBalancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_balances")

    private List<AccountBalanceV3> accountBalances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private Double debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ShowCustomerAccountBalancesResponse withAccountBalances(List<AccountBalanceV3> accountBalances) {
        this.accountBalances = accountBalances;
        return this;
    }

    public ShowCustomerAccountBalancesResponse addAccountBalancesItem(AccountBalanceV3 accountBalancesItem) {
        if (this.accountBalances == null) {
            this.accountBalances = new ArrayList<>();
        }
        this.accountBalances.add(accountBalancesItem);
        return this;
    }

    public ShowCustomerAccountBalancesResponse withAccountBalances(
        Consumer<List<AccountBalanceV3>> accountBalancesSetter) {
        if (this.accountBalances == null) {
            this.accountBalances = new ArrayList<>();
        }
        accountBalancesSetter.accept(this.accountBalances);
        return this;
    }

    /**
     * 账户余额列表。 具体请参见表1。
     * @return accountBalances
     */
    public List<AccountBalanceV3> getAccountBalances() {
        return accountBalances;
    }

    public void setAccountBalances(List<AccountBalanceV3> accountBalances) {
        this.accountBalances = accountBalances;
    }

    public ShowCustomerAccountBalancesResponse withDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    /**
     * 欠款总金额。
     * @return debtAmount
     */
    public Double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public ShowCustomerAccountBalancesResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowCustomerAccountBalancesResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 CNY：人民币。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomerAccountBalancesResponse showCustomerAccountBalancesResponse =
            (ShowCustomerAccountBalancesResponse) o;
        return Objects.equals(this.accountBalances, showCustomerAccountBalancesResponse.accountBalances)
            && Objects.equals(this.debtAmount, showCustomerAccountBalancesResponse.debtAmount)
            && Objects.equals(this.measureId, showCustomerAccountBalancesResponse.measureId)
            && Objects.equals(this.currency, showCustomerAccountBalancesResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountBalances, debtAmount, measureId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerAccountBalancesResponse {\n");
        sb.append("    accountBalances: ").append(toIndentedString(accountBalances)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
