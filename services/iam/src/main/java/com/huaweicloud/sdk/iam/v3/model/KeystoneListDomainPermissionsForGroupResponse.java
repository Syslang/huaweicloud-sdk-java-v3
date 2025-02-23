package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneListDomainPermissionsForGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Links links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<RoleResult> roles = null;

    public KeystoneListDomainPermissionsForGroupResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListDomainPermissionsForGroupResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneListDomainPermissionsForGroupResponse withRoles(List<RoleResult> roles) {
        this.roles = roles;
        return this;
    }

    public KeystoneListDomainPermissionsForGroupResponse addRolesItem(RoleResult rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public KeystoneListDomainPermissionsForGroupResponse withRoles(Consumer<List<RoleResult>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 权限信息列表。
     * @return roles
     */
    public List<RoleResult> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleResult> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListDomainPermissionsForGroupResponse keystoneListDomainPermissionsForGroupResponse =
            (KeystoneListDomainPermissionsForGroupResponse) o;
        return Objects.equals(this.links, keystoneListDomainPermissionsForGroupResponse.links)
            && Objects.equals(this.roles, keystoneListDomainPermissionsForGroupResponse.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListDomainPermissionsForGroupResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
