package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateAddressGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group")

    private CreateAddressGroupOption addressGroup;

    public CreateAddressGroupRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会创建地址组。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接创建地址组。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateAddressGroupRequestBody withAddressGroup(CreateAddressGroupOption addressGroup) {
        this.addressGroup = addressGroup;
        return this;
    }

    public CreateAddressGroupRequestBody withAddressGroup(Consumer<CreateAddressGroupOption> addressGroupSetter) {
        if (this.addressGroup == null) {
            this.addressGroup = new CreateAddressGroupOption();
            addressGroupSetter.accept(this.addressGroup);
        }

        return this;
    }

    /**
     * Get addressGroup
     * @return addressGroup
     */
    public CreateAddressGroupOption getAddressGroup() {
        return addressGroup;
    }

    public void setAddressGroup(CreateAddressGroupOption addressGroup) {
        this.addressGroup = addressGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAddressGroupRequestBody createAddressGroupRequestBody = (CreateAddressGroupRequestBody) o;
        return Objects.equals(this.dryRun, createAddressGroupRequestBody.dryRun)
            && Objects.equals(this.addressGroup, createAddressGroupRequestBody.addressGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, addressGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAddressGroupRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    addressGroup: ").append(toIndentedString(addressGroup)).append("\n");
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
