package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.ContactV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListHasVerifiedContactResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contact_list")
    
    private List<ContactV2> contactList = null;
    
    public ListHasVerifiedContactResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListHasVerifiedContactResponse withContactList(List<ContactV2> contactList) {
        this.contactList = contactList;
        return this;
    }

    
    public ListHasVerifiedContactResponse addContactListItem(ContactV2 contactListItem) {
        if (this.contactList == null) {
            this.contactList = new ArrayList<>();
        }
        this.contactList.add(contactListItem);
        return this;
    }

    public ListHasVerifiedContactResponse withContactList(Consumer<List<ContactV2>> contactListSetter) {
        if(this.contactList == null ){
            this.contactList = new ArrayList<>();
        }
        contactListSetter.accept(this.contactList);
        return this;
    }

    /**
     * 联系方式列表
     * @return contactList
     */
    public List<ContactV2> getContactList() {
        return contactList;
    }

    public void setContactList(List<ContactV2> contactList) {
        this.contactList = contactList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHasVerifiedContactResponse listHasVerifiedContactResponse = (ListHasVerifiedContactResponse) o;
        return Objects.equals(this.totalCount, listHasVerifiedContactResponse.totalCount) &&
            Objects.equals(this.contactList, listHasVerifiedContactResponse.contactList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, contactList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHasVerifiedContactResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
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

