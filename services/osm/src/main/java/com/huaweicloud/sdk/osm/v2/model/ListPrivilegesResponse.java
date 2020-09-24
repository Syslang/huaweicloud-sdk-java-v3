package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPrivilegesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="has_privilege")
    
    private Integer hasPrivilege;

    public ListPrivilegesResponse withHasPrivilege(Integer hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
        return this;
    }

    


    /**
     * 是否有权限
     * minimum: 0
     * maximum: 1
     * @return hasPrivilege
     */
    public Integer getHasPrivilege() {
        return hasPrivilege;
    }

    public void setHasPrivilege(Integer hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPrivilegesResponse listPrivilegesResponse = (ListPrivilegesResponse) o;
        return Objects.equals(this.hasPrivilege, listPrivilegesResponse.hasPrivilege);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hasPrivilege);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivilegesResponse {\n");
        sb.append("    hasPrivilege: ").append(toIndentedString(hasPrivilege)).append("\n");
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

