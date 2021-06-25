package com.huaweicloud.sdk.ocr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.TaxiInvoiceResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RecognizeTaxiInvoiceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private TaxiInvoiceResult result;

    public RecognizeTaxiInvoiceResponse withResult(TaxiInvoiceResult result) {
        this.result = result;
        return this;
    }

    public RecognizeTaxiInvoiceResponse withResult(Consumer<TaxiInvoiceResult> resultSetter) {
        if(this.result == null ){
            this.result = new TaxiInvoiceResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public TaxiInvoiceResult getResult() {
        return result;
    }

    public void setResult(TaxiInvoiceResult result) {
        this.result = result;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceResponse = (RecognizeTaxiInvoiceResponse) o;
        return Objects.equals(this.result, recognizeTaxiInvoiceResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeTaxiInvoiceResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

