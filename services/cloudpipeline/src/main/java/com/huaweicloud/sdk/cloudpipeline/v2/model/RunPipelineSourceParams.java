package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源参数
 */
public class RunPipelineSourceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_git_url")

    private String sshGitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_params")

    private RunPipelineSourceParamsBuildParams buildParams;

    public RunPipelineSourceParams withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * 代码仓类型
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public RunPipelineSourceParams withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * 代码仓https地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public RunPipelineSourceParams withSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
        return this;
    }

    /**
     * 代码仓ssh地址
     * @return sshGitUrl
     */
    public String getSshGitUrl() {
        return sshGitUrl;
    }

    public void setSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
    }

    public RunPipelineSourceParams withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 代码仓页面地址
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public RunPipelineSourceParams withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 代码仓名
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public RunPipelineSourceParams withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * 默认分支
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public RunPipelineSourceParams withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 扩展点ID
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public RunPipelineSourceParams withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * codehub代码仓ID
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public RunPipelineSourceParams withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 代码仓别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public RunPipelineSourceParams withBuildParams(RunPipelineSourceParamsBuildParams buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public RunPipelineSourceParams withBuildParams(Consumer<RunPipelineSourceParamsBuildParams> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new RunPipelineSourceParamsBuildParams();
            buildParamsSetter.accept(this.buildParams);
        }

        return this;
    }

    /**
     * Get buildParams
     * @return buildParams
     */
    public RunPipelineSourceParamsBuildParams getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(RunPipelineSourceParamsBuildParams buildParams) {
        this.buildParams = buildParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunPipelineSourceParams runPipelineSourceParams = (RunPipelineSourceParams) o;
        return Objects.equals(this.gitType, runPipelineSourceParams.gitType)
            && Objects.equals(this.gitUrl, runPipelineSourceParams.gitUrl)
            && Objects.equals(this.sshGitUrl, runPipelineSourceParams.sshGitUrl)
            && Objects.equals(this.webUrl, runPipelineSourceParams.webUrl)
            && Objects.equals(this.repoName, runPipelineSourceParams.repoName)
            && Objects.equals(this.defaultBranch, runPipelineSourceParams.defaultBranch)
            && Objects.equals(this.endpointId, runPipelineSourceParams.endpointId)
            && Objects.equals(this.codehubId, runPipelineSourceParams.codehubId)
            && Objects.equals(this.alias, runPipelineSourceParams.alias)
            && Objects.equals(this.buildParams, runPipelineSourceParams.buildParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitType,
            gitUrl,
            sshGitUrl,
            webUrl,
            repoName,
            defaultBranch,
            endpointId,
            codehubId,
            alias,
            buildParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineSourceParams {\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sshGitUrl: ").append(toIndentedString(sshGitUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    buildParams: ").append(toIndentedString(buildParams)).append("\n");
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
