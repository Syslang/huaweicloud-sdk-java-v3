package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListClassroomsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    public ListClassroomsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 信息记录的起始编号
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListClassroomsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页包含的信息记录数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListClassroomsRequest withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询的课堂类别，默认查询所有的课堂。 取值范围： create：只查询当前用户创建的课堂。 attend：只查询当前用户加入的课堂。 all：查询当前用户所有的课堂。
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClassroomsRequest listClassroomsRequest = (ListClassroomsRequest) o;
        return Objects.equals(this.offset, listClassroomsRequest.offset)
            && Objects.equals(this.limit, listClassroomsRequest.limit)
            && Objects.equals(this.queryType, listClassroomsRequest.queryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, queryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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
