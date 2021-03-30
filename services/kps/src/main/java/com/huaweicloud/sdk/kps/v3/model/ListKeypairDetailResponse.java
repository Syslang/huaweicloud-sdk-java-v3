package com.huaweicloud.sdk.kps.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.KeypairDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListKeypairDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair")
    
    private KeypairDetail keypair;

    public ListKeypairDetailResponse withKeypair(KeypairDetail keypair) {
        this.keypair = keypair;
        return this;
    }

    public ListKeypairDetailResponse withKeypair(Consumer<KeypairDetail> keypairSetter) {
        if(this.keypair == null ){
            this.keypair = new KeypairDetail();
            keypairSetter.accept(this.keypair);
        }
        
        return this;
    }


    /**
     * Get keypair
     * @return keypair
     */
    public KeypairDetail getKeypair() {
        return keypair;
    }

    public void setKeypair(KeypairDetail keypair) {
        this.keypair = keypair;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListKeypairDetailResponse listKeypairDetailResponse = (ListKeypairDetailResponse) o;
        return Objects.equals(this.keypair, listKeypairDetailResponse.keypair);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeypairDetailResponse {\n");
        sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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

