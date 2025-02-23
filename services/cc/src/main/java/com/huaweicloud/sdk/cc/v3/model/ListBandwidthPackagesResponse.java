package com.huaweicloud.sdk.cc.v3.model;

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
public class ListBandwidthPackagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_packages")

    private List<BandwidthPackage> bandwidthPackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListBandwidthPackagesResponse withBandwidthPackages(List<BandwidthPackage> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }

    public ListBandwidthPackagesResponse addBandwidthPackagesItem(BandwidthPackage bandwidthPackagesItem) {
        if (this.bandwidthPackages == null) {
            this.bandwidthPackages = new ArrayList<>();
        }
        this.bandwidthPackages.add(bandwidthPackagesItem);
        return this;
    }

    public ListBandwidthPackagesResponse withBandwidthPackages(
        Consumer<List<BandwidthPackage>> bandwidthPackagesSetter) {
        if (this.bandwidthPackages == null) {
            this.bandwidthPackages = new ArrayList<>();
        }
        bandwidthPackagesSetter.accept(this.bandwidthPackages);
        return this;
    }

    /**
     * 带宽包实例列表。
     * @return bandwidthPackages
     */
    public List<BandwidthPackage> getBandwidthPackages() {
        return bandwidthPackages;
    }

    public void setBandwidthPackages(List<BandwidthPackage> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
    }

    public ListBandwidthPackagesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthPackagesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListBandwidthPackagesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthPackagesResponse listBandwidthPackagesResponse = (ListBandwidthPackagesResponse) o;
        return Objects.equals(this.bandwidthPackages, listBandwidthPackagesResponse.bandwidthPackages)
            && Objects.equals(this.pageInfo, listBandwidthPackagesResponse.pageInfo)
            && Objects.equals(this.requestId, listBandwidthPackagesResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackages, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPackagesResponse {\n");
        sb.append("    bandwidthPackages: ").append(toIndentedString(bandwidthPackages)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
