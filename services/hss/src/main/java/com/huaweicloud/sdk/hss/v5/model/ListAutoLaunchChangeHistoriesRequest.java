package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAutoLaunchChangeHistoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_name")

    private String autoLaunchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variation_type")

    private String variationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ListAutoLaunchChangeHistoriesRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ListAutoLaunchChangeHistoriesRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 主机ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListAutoLaunchChangeHistoriesRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListAutoLaunchChangeHistoriesRequest withAutoLaunchName(String autoLaunchName) {
        this.autoLaunchName = autoLaunchName;
        return this;
    }

    /**
     * 自启动项名称
     * @return autoLaunchName
     */
    public String getAutoLaunchName() {
        return autoLaunchName;
    }

    public void setAutoLaunchName(String autoLaunchName) {
        this.autoLaunchName = autoLaunchName;
    }

    public ListAutoLaunchChangeHistoriesRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 自启动项类型   - 0 ：自启动服务   - 1 ：定时任务   - 2 ：预加载动态库   - 3 ：Run注册表键   - 4 ：开机启动文件夹
     * minimum: 0
     * maximum: 100
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ListAutoLaunchChangeHistoriesRequest withVariationType(String variationType) {
        this.variationType = variationType;
        return this;
    }

    /**
     * 变更类型:   - add ：新建   - delete ：删除   - modify ：修改
     * @return variationType
     */
    public String getVariationType() {
        return variationType;
    }

    public void setVariationType(String variationType) {
        this.variationType = variationType;
    }

    public ListAutoLaunchChangeHistoriesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAutoLaunchChangeHistoriesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序的key值
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListAutoLaunchChangeHistoriesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 升序还是降序，默认升序，asc
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListAutoLaunchChangeHistoriesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 默认10
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAutoLaunchChangeHistoriesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 默认是0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAutoLaunchChangeHistoriesRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 变更开始时间，13位时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListAutoLaunchChangeHistoriesRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 变更结束时间，13位时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAutoLaunchChangeHistoriesRequest listAutoLaunchChangeHistoriesRequest =
            (ListAutoLaunchChangeHistoriesRequest) o;
        return Objects.equals(this.hostId, listAutoLaunchChangeHistoriesRequest.hostId)
            && Objects.equals(this.hostIp, listAutoLaunchChangeHistoriesRequest.hostIp)
            && Objects.equals(this.hostName, listAutoLaunchChangeHistoriesRequest.hostName)
            && Objects.equals(this.autoLaunchName, listAutoLaunchChangeHistoriesRequest.autoLaunchName)
            && Objects.equals(this.type, listAutoLaunchChangeHistoriesRequest.type)
            && Objects.equals(this.variationType, listAutoLaunchChangeHistoriesRequest.variationType)
            && Objects.equals(this.enterpriseProjectId, listAutoLaunchChangeHistoriesRequest.enterpriseProjectId)
            && Objects.equals(this.sortKey, listAutoLaunchChangeHistoriesRequest.sortKey)
            && Objects.equals(this.sortDir, listAutoLaunchChangeHistoriesRequest.sortDir)
            && Objects.equals(this.limit, listAutoLaunchChangeHistoriesRequest.limit)
            && Objects.equals(this.offset, listAutoLaunchChangeHistoriesRequest.offset)
            && Objects.equals(this.startTime, listAutoLaunchChangeHistoriesRequest.startTime)
            && Objects.equals(this.endTime, listAutoLaunchChangeHistoriesRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostIp,
            hostName,
            autoLaunchName,
            type,
            variationType,
            enterpriseProjectId,
            sortKey,
            sortDir,
            limit,
            offset,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoLaunchChangeHistoriesRequest {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    autoLaunchName: ").append(toIndentedString(autoLaunchName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    variationType: ").append(toIndentedString(variationType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
