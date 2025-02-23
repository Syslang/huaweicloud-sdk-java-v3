package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询东西向防火墙接口响应Body体
 */
public class GetEastWestFirewallResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_associated_subnet")

    private SubnetInfo erAssociatedSubnet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_associated_subnets")

    private List<SubnetInfo> firewallAssociatedSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er")

    private ErInstance er;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_vpc")

    private VpcDetail inspectionVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_infos")

    private List<EwProtectResourceInfo> protectInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public GetEastWestFirewallResponseBody withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public GetEastWestFirewallResponseBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public GetEastWestFirewallResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态：0 未开启防护， 1 已开启防护
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GetEastWestFirewallResponseBody withErAssociatedSubnet(SubnetInfo erAssociatedSubnet) {
        this.erAssociatedSubnet = erAssociatedSubnet;
        return this;
    }

    public GetEastWestFirewallResponseBody withErAssociatedSubnet(Consumer<SubnetInfo> erAssociatedSubnetSetter) {
        if (this.erAssociatedSubnet == null) {
            this.erAssociatedSubnet = new SubnetInfo();
            erAssociatedSubnetSetter.accept(this.erAssociatedSubnet);
        }

        return this;
    }

    /**
     * Get erAssociatedSubnet
     * @return erAssociatedSubnet
     */
    public SubnetInfo getErAssociatedSubnet() {
        return erAssociatedSubnet;
    }

    public void setErAssociatedSubnet(SubnetInfo erAssociatedSubnet) {
        this.erAssociatedSubnet = erAssociatedSubnet;
    }

    public GetEastWestFirewallResponseBody withFirewallAssociatedSubnets(List<SubnetInfo> firewallAssociatedSubnets) {
        this.firewallAssociatedSubnets = firewallAssociatedSubnets;
        return this;
    }

    public GetEastWestFirewallResponseBody addFirewallAssociatedSubnetsItem(SubnetInfo firewallAssociatedSubnetsItem) {
        if (this.firewallAssociatedSubnets == null) {
            this.firewallAssociatedSubnets = new ArrayList<>();
        }
        this.firewallAssociatedSubnets.add(firewallAssociatedSubnetsItem);
        return this;
    }

    public GetEastWestFirewallResponseBody withFirewallAssociatedSubnets(
        Consumer<List<SubnetInfo>> firewallAssociatedSubnetsSetter) {
        if (this.firewallAssociatedSubnets == null) {
            this.firewallAssociatedSubnets = new ArrayList<>();
        }
        firewallAssociatedSubnetsSetter.accept(this.firewallAssociatedSubnets);
        return this;
    }

    /**
     * 云防火墙关联子网信息
     * @return firewallAssociatedSubnets
     */
    public List<SubnetInfo> getFirewallAssociatedSubnets() {
        return firewallAssociatedSubnets;
    }

    public void setFirewallAssociatedSubnets(List<SubnetInfo> firewallAssociatedSubnets) {
        this.firewallAssociatedSubnets = firewallAssociatedSubnets;
    }

    public GetEastWestFirewallResponseBody withEr(ErInstance er) {
        this.er = er;
        return this;
    }

    public GetEastWestFirewallResponseBody withEr(Consumer<ErInstance> erSetter) {
        if (this.er == null) {
            this.er = new ErInstance();
            erSetter.accept(this.er);
        }

        return this;
    }

    /**
     * Get er
     * @return er
     */
    public ErInstance getEr() {
        return er;
    }

    public void setEr(ErInstance er) {
        this.er = er;
    }

    public GetEastWestFirewallResponseBody withInspectionVpc(VpcDetail inspectionVpc) {
        this.inspectionVpc = inspectionVpc;
        return this;
    }

    public GetEastWestFirewallResponseBody withInspectionVpc(Consumer<VpcDetail> inspectionVpcSetter) {
        if (this.inspectionVpc == null) {
            this.inspectionVpc = new VpcDetail();
            inspectionVpcSetter.accept(this.inspectionVpc);
        }

        return this;
    }

    /**
     * Get inspectionVpc
     * @return inspectionVpc
     */
    public VpcDetail getInspectionVpc() {
        return inspectionVpc;
    }

    public void setInspectionVpc(VpcDetail inspectionVpc) {
        this.inspectionVpc = inspectionVpc;
    }

    public GetEastWestFirewallResponseBody withProtectInfos(List<EwProtectResourceInfo> protectInfos) {
        this.protectInfos = protectInfos;
        return this;
    }

    public GetEastWestFirewallResponseBody addProtectInfosItem(EwProtectResourceInfo protectInfosItem) {
        if (this.protectInfos == null) {
            this.protectInfos = new ArrayList<>();
        }
        this.protectInfos.add(protectInfosItem);
        return this;
    }

    public GetEastWestFirewallResponseBody withProtectInfos(Consumer<List<EwProtectResourceInfo>> protectInfosSetter) {
        if (this.protectInfos == null) {
            this.protectInfos = new ArrayList<>();
        }
        protectInfosSetter.accept(this.protectInfos);
        return this;
    }

    /**
     * 东西向防护资源信息
     * @return protectInfos
     */
    public List<EwProtectResourceInfo> getProtectInfos() {
        return protectInfos;
    }

    public void setProtectInfos(List<EwProtectResourceInfo> protectInfos) {
        this.protectInfos = protectInfos;
    }

    public GetEastWestFirewallResponseBody withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 防护VPC总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public GetEastWestFirewallResponseBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public GetEastWestFirewallResponseBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetEastWestFirewallResponseBody getEastWestFirewallResponseBody = (GetEastWestFirewallResponseBody) o;
        return Objects.equals(this.objectId, getEastWestFirewallResponseBody.objectId)
            && Objects.equals(this.projectId, getEastWestFirewallResponseBody.projectId)
            && Objects.equals(this.status, getEastWestFirewallResponseBody.status)
            && Objects.equals(this.erAssociatedSubnet, getEastWestFirewallResponseBody.erAssociatedSubnet)
            && Objects.equals(this.firewallAssociatedSubnets, getEastWestFirewallResponseBody.firewallAssociatedSubnets)
            && Objects.equals(this.er, getEastWestFirewallResponseBody.er)
            && Objects.equals(this.inspectionVpc, getEastWestFirewallResponseBody.inspectionVpc)
            && Objects.equals(this.protectInfos, getEastWestFirewallResponseBody.protectInfos)
            && Objects.equals(this.total, getEastWestFirewallResponseBody.total)
            && Objects.equals(this.offset, getEastWestFirewallResponseBody.offset)
            && Objects.equals(this.limit, getEastWestFirewallResponseBody.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId,
            projectId,
            status,
            erAssociatedSubnet,
            firewallAssociatedSubnets,
            er,
            inspectionVpc,
            protectInfos,
            total,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetEastWestFirewallResponseBody {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    erAssociatedSubnet: ").append(toIndentedString(erAssociatedSubnet)).append("\n");
        sb.append("    firewallAssociatedSubnets: ").append(toIndentedString(firewallAssociatedSubnets)).append("\n");
        sb.append("    er: ").append(toIndentedString(er)).append("\n");
        sb.append("    inspectionVpc: ").append(toIndentedString(inspectionVpc)).append("\n");
        sb.append("    protectInfos: ").append(toIndentedString(protectInfos)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
