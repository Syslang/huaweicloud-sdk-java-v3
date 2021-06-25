package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ConfirmAssetUploadRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ConfirmAssetUploadReq body;

    public ConfirmAssetUploadRequest withBody(ConfirmAssetUploadReq body) {
        this.body = body;
        return this;
    }

    public ConfirmAssetUploadRequest withBody(Consumer<ConfirmAssetUploadReq> bodySetter) {
        if(this.body == null ){
            this.body = new ConfirmAssetUploadReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ConfirmAssetUploadReq getBody() {
        return body;
    }

    public void setBody(ConfirmAssetUploadReq body) {
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
        ConfirmAssetUploadRequest confirmAssetUploadRequest = (ConfirmAssetUploadRequest) o;
        return Objects.equals(this.body, confirmAssetUploadRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmAssetUploadRequest {\n");
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

