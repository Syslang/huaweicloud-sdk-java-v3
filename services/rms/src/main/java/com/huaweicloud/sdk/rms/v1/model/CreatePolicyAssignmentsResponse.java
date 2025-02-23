package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePolicyAssignmentsResponse extends SdkResponse {

    /**
     * 规则类型，包括预定义合规规则(builtin)和用户自定义合规规则(custom)
     */
    public static final class PolicyAssignmentTypeEnum {

        /**
         * Enum BUILTIN for value: "builtin"
         */
        public static final PolicyAssignmentTypeEnum BUILTIN = new PolicyAssignmentTypeEnum("builtin");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final PolicyAssignmentTypeEnum CUSTOM = new PolicyAssignmentTypeEnum("custom");

        private static final Map<String, PolicyAssignmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyAssignmentTypeEnum> createStaticFields() {
            Map<String, PolicyAssignmentTypeEnum> map = new HashMap<>();
            map.put("builtin", BUILTIN);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyAssignmentTypeEnum(String value) {
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
        public static PolicyAssignmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PolicyAssignmentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PolicyAssignmentTypeEnum(value);
            }
            return result;
        }

        public static PolicyAssignmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PolicyAssignmentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyAssignmentTypeEnum) {
                return this.value.equals(((PolicyAssignmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_type")

    private PolicyAssignmentTypeEnum policyAssignmentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_filter")

    private PolicyFilterDefinition policyFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_policy")

    private CustomPolicy customPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterValue> parameters = null;

    public CreatePolicyAssignmentsResponse withPolicyAssignmentType(PolicyAssignmentTypeEnum policyAssignmentType) {
        this.policyAssignmentType = policyAssignmentType;
        return this;
    }

    /**
     * 规则类型，包括预定义合规规则(builtin)和用户自定义合规规则(custom)
     * @return policyAssignmentType
     */
    public PolicyAssignmentTypeEnum getPolicyAssignmentType() {
        return policyAssignmentType;
    }

    public void setPolicyAssignmentType(PolicyAssignmentTypeEnum policyAssignmentType) {
        this.policyAssignmentType = policyAssignmentType;
    }

    public CreatePolicyAssignmentsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreatePolicyAssignmentsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreatePolicyAssignmentsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePolicyAssignmentsResponse withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public CreatePolicyAssignmentsResponse withPolicyFilter(Consumer<PolicyFilterDefinition> policyFilterSetter) {
        if (this.policyFilter == null) {
            this.policyFilter = new PolicyFilterDefinition();
            policyFilterSetter.accept(this.policyFilter);
        }

        return this;
    }

    /**
     * Get policyFilter
     * @return policyFilter
     */
    public PolicyFilterDefinition getPolicyFilter() {
        return policyFilter;
    }

    public void setPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
    }

    public CreatePolicyAssignmentsResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 触发周期值，可选值：One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CreatePolicyAssignmentsResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 规则状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreatePolicyAssignmentsResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 规则创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreatePolicyAssignmentsResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 规则更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CreatePolicyAssignmentsResponse withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * 规则的策略ID
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public CreatePolicyAssignmentsResponse withCustomPolicy(CustomPolicy customPolicy) {
        this.customPolicy = customPolicy;
        return this;
    }

    public CreatePolicyAssignmentsResponse withCustomPolicy(Consumer<CustomPolicy> customPolicySetter) {
        if (this.customPolicy == null) {
            this.customPolicy = new CustomPolicy();
            customPolicySetter.accept(this.customPolicy);
        }

        return this;
    }

    /**
     * Get customPolicy
     * @return customPolicy
     */
    public CustomPolicy getCustomPolicy() {
        return customPolicy;
    }

    public void setCustomPolicy(CustomPolicy customPolicy) {
        this.customPolicy = customPolicy;
    }

    public CreatePolicyAssignmentsResponse withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    public CreatePolicyAssignmentsResponse putParametersItem(String key, PolicyParameterValue parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public CreatePolicyAssignmentsResponse withParameters(
        Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 规则参数
     * @return parameters
     */
    public Map<String, PolicyParameterValue> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePolicyAssignmentsResponse createPolicyAssignmentsResponse = (CreatePolicyAssignmentsResponse) o;
        return Objects.equals(this.policyAssignmentType, createPolicyAssignmentsResponse.policyAssignmentType)
            && Objects.equals(this.id, createPolicyAssignmentsResponse.id)
            && Objects.equals(this.name, createPolicyAssignmentsResponse.name)
            && Objects.equals(this.description, createPolicyAssignmentsResponse.description)
            && Objects.equals(this.policyFilter, createPolicyAssignmentsResponse.policyFilter)
            && Objects.equals(this.period, createPolicyAssignmentsResponse.period)
            && Objects.equals(this.state, createPolicyAssignmentsResponse.state)
            && Objects.equals(this.created, createPolicyAssignmentsResponse.created)
            && Objects.equals(this.updated, createPolicyAssignmentsResponse.updated)
            && Objects.equals(this.policyDefinitionId, createPolicyAssignmentsResponse.policyDefinitionId)
            && Objects.equals(this.customPolicy, createPolicyAssignmentsResponse.customPolicy)
            && Objects.equals(this.parameters, createPolicyAssignmentsResponse.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentType,
            id,
            name,
            description,
            policyFilter,
            period,
            state,
            created,
            updated,
            policyDefinitionId,
            customPolicy,
            parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyAssignmentsResponse {\n");
        sb.append("    policyAssignmentType: ").append(toIndentedString(policyAssignmentType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    customPolicy: ").append(toIndentedString(customPolicy)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
