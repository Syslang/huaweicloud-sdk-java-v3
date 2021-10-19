package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 终端节点列表 */
public class Endpoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker_id")

    private Integer markerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /** 终端节点的连接状态。 ● pendingAcceptance：待接受 ● creating：创建中 ● accepted：已接受 ● rejected：已拒绝 ● failed：失败 ● deleting：删除中 */
    public static final class StatusEnum {

        /** Enum PENDINGACCEPTANCE for value: "pendingAcceptance" */
        public static final StatusEnum PENDINGACCEPTANCE = new StatusEnum("pendingAcceptance");

        /** Enum CREATING for value: "creating" */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /** Enum ACCEPTED for value: "accepted" */
        public static final StatusEnum ACCEPTED = new StatusEnum("accepted");

        /** Enum REJECTED for value: "rejected" */
        public static final StatusEnum REJECTED = new StatusEnum("rejected");

        /** Enum FAILED for value: "failed" */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /** Enum DELETING for value: "deleting" */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("pendingAcceptance", PENDINGACCEPTANCE);
            map.put("creating", CREATING);
            map.put("accepted", ACCEPTED);
            map.put("rejected", REJECTED);
            map.put("failed", FAILED);
            map.put("deleting", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private QueryError error;

    public Endpoints withId(String id) {
        this.id = id;
        return this;
    }

    /** 终端节点的ID，唯一标识。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Endpoints withMarkerId(Integer markerId) {
        this.markerId = markerId;
        return this;
    }

    /** 终端节点的报文标识。
     * 
     * @return markerId */
    public Integer getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    public Endpoints withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 终端节点的创建时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH: MM:SSZ
     * 
     * @return createdAt */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Endpoints withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 终端节点的更新时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH: MM:SSZ
     * 
     * @return updatedAt */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Endpoints withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 用户的Domain ID。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Endpoints withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 终端节点的连接状态。 ● pendingAcceptance：待接受 ● creating：创建中 ● accepted：已接受 ● rejected：已拒绝 ● failed：失败 ● deleting：删除中
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Endpoints withError(QueryError error) {
        this.error = error;
        return this;
    }

    public Endpoints withError(Consumer<QueryError> errorSetter) {
        if (this.error == null) {
            this.error = new QueryError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /** Get error
     * 
     * @return error */
    public QueryError getError() {
        return error;
    }

    public void setError(QueryError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoints endpoints = (Endpoints) o;
        return Objects.equals(this.id, endpoints.id) && Objects.equals(this.markerId, endpoints.markerId)
            && Objects.equals(this.createdAt, endpoints.createdAt)
            && Objects.equals(this.updatedAt, endpoints.updatedAt) && Objects.equals(this.domainId, endpoints.domainId)
            && Objects.equals(this.status, endpoints.status) && Objects.equals(this.error, endpoints.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, markerId, createdAt, updatedAt, domainId, status, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoints {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    markerId: ").append(toIndentedString(markerId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
