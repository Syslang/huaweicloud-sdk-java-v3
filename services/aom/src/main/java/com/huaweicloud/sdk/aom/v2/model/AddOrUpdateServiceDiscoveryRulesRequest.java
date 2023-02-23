package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.AppRulesBody;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "AddOrUpdateServiceDiscoveryRulesRequest")
public class AddOrUpdateServiceDiscoveryRulesRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")

    private AppRulesBody body;

    public AddOrUpdateServiceDiscoveryRulesRequest withBody(AppRulesBody body) {
        this.body = body;
        return this;
    }

    public AddOrUpdateServiceDiscoveryRulesRequest withBody(Consumer<AppRulesBody> bodySetter) {
        if(this.body == null ){
            this.body = new AppRulesBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AppRulesBody getBody() {
        return body;
    }

    public void setBody(AppRulesBody body) {
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
        AddOrUpdateServiceDiscoveryRulesRequest addOrUpdateServiceDiscoveryRulesRequest = (AddOrUpdateServiceDiscoveryRulesRequest) o;
        return Objects.equals(this.body, addOrUpdateServiceDiscoveryRulesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateServiceDiscoveryRulesRequest {\n");
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

