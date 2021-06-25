package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ThrottleBaseInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateRequestThrottlingPolicyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_id")
    
    private String throttleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ThrottleBaseInfo body;

    public UpdateRequestThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public UpdateRequestThrottlingPolicyV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    


    /**
     * 流控策略的编号
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    

    public UpdateRequestThrottlingPolicyV2Request withBody(ThrottleBaseInfo body) {
        this.body = body;
        return this;
    }

    public UpdateRequestThrottlingPolicyV2Request withBody(Consumer<ThrottleBaseInfo> bodySetter) {
        if(this.body == null ){
            this.body = new ThrottleBaseInfo();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ThrottleBaseInfo getBody() {
        return body;
    }

    public void setBody(ThrottleBaseInfo body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRequestThrottlingPolicyV2Request updateRequestThrottlingPolicyV2Request = (UpdateRequestThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, updateRequestThrottlingPolicyV2Request.instanceId) &&
            Objects.equals(this.throttleId, updateRequestThrottlingPolicyV2Request.throttleId) &&
            Objects.equals(this.body, updateRequestThrottlingPolicyV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRequestThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

