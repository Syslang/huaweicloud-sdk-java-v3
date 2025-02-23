package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CmTagVO
 */
public class CmTagVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public CmTagVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 标签标识
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CmTagVO withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public CmTagVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 标签状态，0未使用，1使用中。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CmTagVO cmTagVO = (CmTagVO) o;
        return Objects.equals(this.id, cmTagVO.id) && Objects.equals(this.tagName, cmTagVO.tagName)
            && Objects.equals(this.status, cmTagVO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tagName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CmTagVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
