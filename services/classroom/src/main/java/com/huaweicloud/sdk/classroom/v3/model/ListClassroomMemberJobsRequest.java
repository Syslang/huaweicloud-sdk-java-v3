package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListClassroomMemberJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classroom_id")

    private String classroomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListClassroomMemberJobsRequest withClassroomId(String classroomId) {
        this.classroomId = classroomId;
        return this;
    }

    /**
     * 课堂ID
     * @return classroomId
     */
    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public ListClassroomMemberJobsRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 用户ID
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ListClassroomMemberJobsRequest withOffset(Integer offset) {
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

    public ListClassroomMemberJobsRequest withLimit(Integer limit) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClassroomMemberJobsRequest listClassroomMemberJobsRequest = (ListClassroomMemberJobsRequest) o;
        return Objects.equals(this.classroomId, listClassroomMemberJobsRequest.classroomId)
            && Objects.equals(this.memberId, listClassroomMemberJobsRequest.memberId)
            && Objects.equals(this.offset, listClassroomMemberJobsRequest.offset)
            && Objects.equals(this.limit, listClassroomMemberJobsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomId, memberId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClassroomMemberJobsRequest {\n");
        sb.append("    classroomId: ").append(toIndentedString(classroomId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
