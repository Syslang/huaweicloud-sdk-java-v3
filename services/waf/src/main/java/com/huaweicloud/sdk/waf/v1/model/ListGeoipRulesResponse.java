package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.PolicyGeoIpListInfoItems;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGeoipRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<PolicyGeoIpListInfoItems> items = null;
    
    public ListGeoipRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 该策略下地理位置封禁数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListGeoipRulesResponse withItems(List<PolicyGeoIpListInfoItems> items) {
        this.items = items;
        return this;
    }

    
    public ListGeoipRulesResponse addItemsItem(PolicyGeoIpListInfoItems itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListGeoipRulesResponse withItems(Consumer<List<PolicyGeoIpListInfoItems>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 地理位置封禁列表
     * @return items
     */
    public List<PolicyGeoIpListInfoItems> getItems() {
        return items;
    }

    public void setItems(List<PolicyGeoIpListInfoItems> items) {
        this.items = items;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGeoipRulesResponse listGeoipRulesResponse = (ListGeoipRulesResponse) o;
        return Objects.equals(this.total, listGeoipRulesResponse.total) &&
            Objects.equals(this.items, listGeoipRulesResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGeoipRulesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

