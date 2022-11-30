package com.huaweicloud.sdk.aom.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.Template;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTemplateByJobIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_elements")
    
    
    private Long totalElements;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elements")
    
    
    private List<Template> elements = null;
    
    public ListTemplateByJobIdResponse withTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 9999999
     * @return totalElements
     */
    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    

    public ListTemplateByJobIdResponse withElements(List<Template> elements) {
        this.elements = elements;
        return this;
    }

    
    public ListTemplateByJobIdResponse addElementsItem(Template elementsItem) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        this.elements.add(elementsItem);
        return this;
    }

    public ListTemplateByJobIdResponse withElements(Consumer<List<Template>> elementsSetter) {
        if(this.elements == null) {
            this.elements = new ArrayList<>();
        }
        elementsSetter.accept(this.elements);
        return this;
    }

    /**
     * 查询作业信息集合
     * @return elements
     */
    public List<Template> getElements() {
        return elements;
    }

    public void setElements(List<Template> elements) {
        this.elements = elements;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateByJobIdResponse listTemplateByJobIdResponse = (ListTemplateByJobIdResponse) o;
        return Objects.equals(this.totalElements, listTemplateByJobIdResponse.totalElements) &&
            Objects.equals(this.elements, listTemplateByJobIdResponse.elements);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalElements, elements);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateByJobIdResponse {\n");
        sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
        sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

