package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociateRouterReq
 */
public class AssociateRouterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router")

    private Router router;

    public AssociateRouterReq withRouter(Router router) {
        this.router = router;
        return this;
    }

    public AssociateRouterReq withRouter(Consumer<Router> routerSetter) {
        if (this.router == null) {
            this.router = new Router();
            routerSetter.accept(this.router);
        }

        return this;
    }

    /**
     * Get router
     * @return router
     */
    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateRouterReq associateRouterReq = (AssociateRouterReq) o;
        return Objects.equals(this.router, associateRouterReq.router);
    }

    @Override
    public int hashCode() {
        return Objects.hash(router);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRouterReq {\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
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
