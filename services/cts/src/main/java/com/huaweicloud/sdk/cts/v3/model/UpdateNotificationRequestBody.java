package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改关键操作通知规则的请求体。
 */
public class UpdateNotificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_name")

    private String notificationName;

    /**
     * 标识操作类型。 目前支持的操作类型有完整类型(complete)和自定义类型(customized)。 完整类型下，CTS发送通知的对象为已对接服务的所有事件。 自定义类型下，CTS发送通知的对象是在operations列表中指定的事件。
     */
    public static final class OperationTypeEnum {

        /**
         * Enum CUSTOMIZED for value: "customized"
         */
        public static final OperationTypeEnum CUSTOMIZED = new OperationTypeEnum("customized");

        /**
         * Enum COMPLETE for value: "complete"
         */
        public static final OperationTypeEnum COMPLETE = new OperationTypeEnum("complete");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("customized", CUSTOMIZED);
            map.put("complete", COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<Operations> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_user_list")

    private List<NotificationUsers> notifyUserList = null;

    /**
    * 标识关键操作通知状态，包括正常(enabled)，停止(disabled)两种状态。
    */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
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
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_id")

    private String notificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Filter filter;

    public UpdateNotificationRequestBody withNotificationName(String notificationName) {
        this.notificationName = notificationName;
        return this;
    }

    /**
     * 标识关键操作名称。
     * @return notificationName
     */
    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public UpdateNotificationRequestBody withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 标识操作类型。 目前支持的操作类型有完整类型(complete)和自定义类型(customized)。 完整类型下，CTS发送通知的对象为已对接服务的所有事件。 自定义类型下，CTS发送通知的对象是在operations列表中指定的事件。
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public UpdateNotificationRequestBody withOperations(List<Operations> operations) {
        this.operations = operations;
        return this;
    }

    public UpdateNotificationRequestBody addOperationsItem(Operations operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public UpdateNotificationRequestBody withOperations(Consumer<List<Operations>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 操作事件列表。
     * @return operations
     */
    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    public UpdateNotificationRequestBody withNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
        return this;
    }

    public UpdateNotificationRequestBody addNotifyUserListItem(NotificationUsers notifyUserListItem) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        this.notifyUserList.add(notifyUserListItem);
        return this;
    }

    public UpdateNotificationRequestBody withNotifyUserList(Consumer<List<NotificationUsers>> notifyUserListSetter) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        notifyUserListSetter.accept(this.notifyUserList);
        return this;
    }

    /**
     * 通知用户列表，目前最多支持对10个用户组和50个用户发起的操作进行配置。
     * @return notifyUserList
     */
    public List<NotificationUsers> getNotifyUserList() {
        return notifyUserList;
    }

    public void setNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
    }

    public UpdateNotificationRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 标识关键操作通知状态，包括正常(enabled)，停止(disabled)两种状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateNotificationRequestBody withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 消息通知服务的topic_urn或者函数工作流的func_urn，当“status”字段为enabled时，该字段必填。 - 消息通知服务的topic_urn可以通过消息通知服务的查询主题列表API获取，示例：urn:smn:regionId:f96188c7ccaf4ffba0c9aa149ab2bd57:test_topic_v2。 - 函数工作流的func_urn可以通过函数工作流的获取函数列表API获取，示例：urn:fss:xxxxxxxxx:7aad83af3e8d42e99ac194e8419e2c9b:function:default:test。
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public UpdateNotificationRequestBody withNotificationId(String notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * 关键操作通知id。
     * @return notificationId
     */
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public UpdateNotificationRequestBody withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public UpdateNotificationRequestBody withFilter(Consumer<Filter> filterSetter) {
        if (this.filter == null) {
            this.filter = new Filter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNotificationRequestBody updateNotificationRequestBody = (UpdateNotificationRequestBody) o;
        return Objects.equals(this.notificationName, updateNotificationRequestBody.notificationName)
            && Objects.equals(this.operationType, updateNotificationRequestBody.operationType)
            && Objects.equals(this.operations, updateNotificationRequestBody.operations)
            && Objects.equals(this.notifyUserList, updateNotificationRequestBody.notifyUserList)
            && Objects.equals(this.status, updateNotificationRequestBody.status)
            && Objects.equals(this.topicId, updateNotificationRequestBody.topicId)
            && Objects.equals(this.notificationId, updateNotificationRequestBody.notificationId)
            && Objects.equals(this.filter, updateNotificationRequestBody.filter);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(notificationName, operationType, operations, notifyUserList, status, topicId, notificationId, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationRequestBody {\n");
        sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    notifyUserList: ").append(toIndentedString(notifyUserList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
