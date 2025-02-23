package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRuleAclDto
 */
public class UpdateRuleAclDto {

    /**
     * 地址类型，0 ipv4,1 ipv6
     */
    public static final class AddressTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AddressTypeEnum NUMBER_0 = new AddressTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AddressTypeEnum NUMBER_1 = new AddressTypeEnum(1);

        private static final Map<Integer, AddressTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AddressTypeEnum> createStaticFields() {
            Map<Integer, AddressTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AddressTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AddressTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            AddressTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AddressTypeEnum(value);
            }
            return result;
        }

        public static AddressTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AddressTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressTypeEnum) {
                return this.value.equals(((AddressTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private AddressTypeEnum addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private OrderRuleAclDto sequence;

    /**
     * 规则方向
     */
    public static final class DirectionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DirectionEnum NUMBER_0 = new DirectionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DirectionEnum NUMBER_1 = new DirectionEnum(1);

        private static final Map<Integer, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DirectionEnum> createStaticFields() {
            Map<Integer, DirectionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DirectionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DirectionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    /**
     * 动作0：permit,1：deny
     */
    public static final class ActionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ActionTypeEnum NUMBER_0 = new ActionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ActionTypeEnum NUMBER_1 = new ActionTypeEnum(1);

        private static final Map<Integer, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ActionTypeEnum> createStaticFields() {
            Map<Integer, ActionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ActionTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ActionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionTypeEnum(value);
            }
            return result;
        }

        public static ActionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ActionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_hour")

    private Long longConnectTimeHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_minute")

    private Long longConnectTimeMinute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_second")

    private Long longConnectTimeSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time")

    private Long longConnectTime;

    /**
     * 是否支持长连接，0表示不支持，1表示支持
     */
    public static final class LongConnectEnableEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final LongConnectEnableEnum NUMBER_0 = new LongConnectEnableEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LongConnectEnableEnum NUMBER_1 = new LongConnectEnableEnum(1);

        private static final Map<Integer, LongConnectEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LongConnectEnableEnum> createStaticFields() {
            Map<Integer, LongConnectEnableEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LongConnectEnableEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LongConnectEnableEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            LongConnectEnableEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LongConnectEnableEnum(value);
            }
            return result;
        }

        public static LongConnectEnableEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            LongConnectEnableEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LongConnectEnableEnum) {
                return this.value.equals(((LongConnectEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_enable")

    private LongConnectEnableEnum longConnectEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private RuleAddressDto source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private RuleAddressDto destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private RuleServiceDto service;

    /**
     * 规则type，0：互联网规则，1:vpc规则，2：nat规则
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public UpdateRuleAclDto withAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型，0 ipv4,1 ipv6
     * @return addressType
     */
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    public UpdateRuleAclDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRuleAclDto withSequence(OrderRuleAclDto sequence) {
        this.sequence = sequence;
        return this;
    }

    public UpdateRuleAclDto withSequence(Consumer<OrderRuleAclDto> sequenceSetter) {
        if (this.sequence == null) {
            this.sequence = new OrderRuleAclDto();
            sequenceSetter.accept(this.sequence);
        }

        return this;
    }

    /**
     * Get sequence
     * @return sequence
     */
    public OrderRuleAclDto getSequence() {
        return sequence;
    }

    public void setSequence(OrderRuleAclDto sequence) {
        this.sequence = sequence;
    }

    public UpdateRuleAclDto withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 规则方向
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public UpdateRuleAclDto withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 动作0：permit,1：deny
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public UpdateRuleAclDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则下发状态 0：禁用,1：启用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateRuleAclDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRuleAclDto withLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
        return this;
    }

    /**
     * 长连接时长小时
     * @return longConnectTimeHour
     */
    public Long getLongConnectTimeHour() {
        return longConnectTimeHour;
    }

    public void setLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
    }

    public UpdateRuleAclDto withLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
        return this;
    }

    /**
     * 长连接时长分钟
     * @return longConnectTimeMinute
     */
    public Long getLongConnectTimeMinute() {
        return longConnectTimeMinute;
    }

    public void setLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
    }

    public UpdateRuleAclDto withLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
        return this;
    }

    /**
     * 长连接时长秒
     * @return longConnectTimeSecond
     */
    public Long getLongConnectTimeSecond() {
        return longConnectTimeSecond;
    }

    public void setLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
    }

    public UpdateRuleAclDto withLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
        return this;
    }

    /**
     * 长连接时长
     * @return longConnectTime
     */
    public Long getLongConnectTime() {
        return longConnectTime;
    }

    public void setLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
    }

    public UpdateRuleAclDto withLongConnectEnable(LongConnectEnableEnum longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
        return this;
    }

    /**
     * 是否支持长连接，0表示不支持，1表示支持
     * @return longConnectEnable
     */
    public LongConnectEnableEnum getLongConnectEnable() {
        return longConnectEnable;
    }

    public void setLongConnectEnable(LongConnectEnableEnum longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
    }

    public UpdateRuleAclDto withSource(RuleAddressDto source) {
        this.source = source;
        return this;
    }

    public UpdateRuleAclDto withSource(Consumer<RuleAddressDto> sourceSetter) {
        if (this.source == null) {
            this.source = new RuleAddressDto();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RuleAddressDto getSource() {
        return source;
    }

    public void setSource(RuleAddressDto source) {
        this.source = source;
    }

    public UpdateRuleAclDto withDestination(RuleAddressDto destination) {
        this.destination = destination;
        return this;
    }

    public UpdateRuleAclDto withDestination(Consumer<RuleAddressDto> destinationSetter) {
        if (this.destination == null) {
            this.destination = new RuleAddressDto();
            destinationSetter.accept(this.destination);
        }

        return this;
    }

    /**
     * Get destination
     * @return destination
     */
    public RuleAddressDto getDestination() {
        return destination;
    }

    public void setDestination(RuleAddressDto destination) {
        this.destination = destination;
    }

    public UpdateRuleAclDto withService(RuleServiceDto service) {
        this.service = service;
        return this;
    }

    public UpdateRuleAclDto withService(Consumer<RuleServiceDto> serviceSetter) {
        if (this.service == null) {
            this.service = new RuleServiceDto();
            serviceSetter.accept(this.service);
        }

        return this;
    }

    /**
     * Get service
     * @return service
     */
    public RuleServiceDto getService() {
        return service;
    }

    public void setService(RuleServiceDto service) {
        this.service = service;
    }

    public UpdateRuleAclDto withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 规则type，0：互联网规则，1:vpc规则，2：nat规则
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRuleAclDto updateRuleAclDto = (UpdateRuleAclDto) o;
        return Objects.equals(this.addressType, updateRuleAclDto.addressType)
            && Objects.equals(this.name, updateRuleAclDto.name)
            && Objects.equals(this.sequence, updateRuleAclDto.sequence)
            && Objects.equals(this.direction, updateRuleAclDto.direction)
            && Objects.equals(this.actionType, updateRuleAclDto.actionType)
            && Objects.equals(this.status, updateRuleAclDto.status)
            && Objects.equals(this.description, updateRuleAclDto.description)
            && Objects.equals(this.longConnectTimeHour, updateRuleAclDto.longConnectTimeHour)
            && Objects.equals(this.longConnectTimeMinute, updateRuleAclDto.longConnectTimeMinute)
            && Objects.equals(this.longConnectTimeSecond, updateRuleAclDto.longConnectTimeSecond)
            && Objects.equals(this.longConnectTime, updateRuleAclDto.longConnectTime)
            && Objects.equals(this.longConnectEnable, updateRuleAclDto.longConnectEnable)
            && Objects.equals(this.source, updateRuleAclDto.source)
            && Objects.equals(this.destination, updateRuleAclDto.destination)
            && Objects.equals(this.service, updateRuleAclDto.service)
            && Objects.equals(this.type, updateRuleAclDto.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressType,
            name,
            sequence,
            direction,
            actionType,
            status,
            description,
            longConnectTimeHour,
            longConnectTimeMinute,
            longConnectTimeSecond,
            longConnectTime,
            longConnectEnable,
            source,
            destination,
            service,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleAclDto {\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    longConnectTimeHour: ").append(toIndentedString(longConnectTimeHour)).append("\n");
        sb.append("    longConnectTimeMinute: ").append(toIndentedString(longConnectTimeMinute)).append("\n");
        sb.append("    longConnectTimeSecond: ").append(toIndentedString(longConnectTimeSecond)).append("\n");
        sb.append("    longConnectTime: ").append(toIndentedString(longConnectTime)).append("\n");
        sb.append("    longConnectEnable: ").append(toIndentedString(longConnectEnable)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
