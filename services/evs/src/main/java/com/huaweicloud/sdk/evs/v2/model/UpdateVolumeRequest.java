package com.huaweicloud.sdk.evs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.UpdateVolumeRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateVolumeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateVolumeRequestBody body = null;

    public UpdateVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * Get volumeId
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public UpdateVolumeRequest withBody(UpdateVolumeRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVolumeRequest withBody(Consumer<UpdateVolumeRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateVolumeRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateVolumeRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVolumeRequestBody body) {
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
        UpdateVolumeRequest updateVolumeRequest = (UpdateVolumeRequest) o;
        return Objects.equals(this.volumeId, updateVolumeRequest.volumeId) &&
            Objects.equals(this.body, updateVolumeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumeId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVolumeRequest {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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

