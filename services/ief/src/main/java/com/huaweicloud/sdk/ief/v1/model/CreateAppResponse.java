package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private AppResponse app;

    public CreateAppResponse withApp(AppResponse app) {
        this.app = app;
        return this;
    }

    public CreateAppResponse withApp(Consumer<AppResponse> appSetter) {
        if (this.app == null) {
            this.app = new AppResponse();
            appSetter.accept(this.app);
        }

        return this;
    }

    /**
     * Get app
     * @return app
     */
    public AppResponse getApp() {
        return app;
    }

    public void setApp(AppResponse app) {
        this.app = app;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppResponse createAppResponse = (CreateAppResponse) o;
        return Objects.equals(this.app, createAppResponse.app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppResponse {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
