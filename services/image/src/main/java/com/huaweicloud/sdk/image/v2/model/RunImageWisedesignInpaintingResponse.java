package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunImageWisedesignInpaintingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ImageWisedesignInpaintingResponseResult result;

    public RunImageWisedesignInpaintingResponse withResult(ImageWisedesignInpaintingResponseResult result) {
        this.result = result;
        return this;
    }

    public RunImageWisedesignInpaintingResponse withResult(
        Consumer<ImageWisedesignInpaintingResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new ImageWisedesignInpaintingResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ImageWisedesignInpaintingResponseResult getResult() {
        return result;
    }

    public void setResult(ImageWisedesignInpaintingResponseResult result) {
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
        RunImageWisedesignInpaintingResponse runImageWisedesignInpaintingResponse =
            (RunImageWisedesignInpaintingResponse) o;
        return Objects.equals(this.result, runImageWisedesignInpaintingResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunImageWisedesignInpaintingResponse {\n");
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
