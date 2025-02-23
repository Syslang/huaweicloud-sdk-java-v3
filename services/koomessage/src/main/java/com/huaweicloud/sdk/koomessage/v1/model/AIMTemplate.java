package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 短信下发响应对象。
 */
public class AIMTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_state")

    private Integer tplState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_desc")

    private String disableDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_time")

    private String disableTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_state")

    private Integer auditState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_desc")

    private String auditDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private String creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private String pages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<AIMTemplateParams> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factory_info")

    private List<FactoryInfo> factoryInfo = null;

    public AIMTemplate withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。  > 智能信息平台生成的模板ID，由9位数字组成。 
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public AIMTemplate withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public AIMTemplate withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 场景类型。 
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public AIMTemplate withTplState(Integer tplState) {
        this.tplState = tplState;
        return this;
    }

    /**
     * 模板状态。  - 0：禁用 - 1：启用  > 智能信息模板启动、禁用暂为运营管理功能，Console页面与API暂未开放此功能。 
     * @return tplState
     */
    public Integer getTplState() {
        return tplState;
    }

    public void setTplState(Integer tplState) {
        this.tplState = tplState;
    }

    public AIMTemplate withDisableDesc(String disableDesc) {
        this.disableDesc = disableDesc;
        return this;
    }

    /**
     * 禁用原因。
     * @return disableDesc
     */
    public String getDisableDesc() {
        return disableDesc;
    }

    public void setDisableDesc(String disableDesc) {
        this.disableDesc = disableDesc;
    }

    public AIMTemplate withDisableTime(String disableTime) {
        this.disableTime = disableTime;
        return this;
    }

    /**
     * 禁用时间。样例：1970-01-01T00:00 :00Z。
     * @return disableTime
     */
    public String getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(String disableTime) {
        this.disableTime = disableTime;
    }

    public AIMTemplate withAuditState(Integer auditState) {
        this.auditState = auditState;
        return this;
    }

    /**
     * 审核状态。 - 0：未提交  - 1：审核中  - 2：审核通过  - 3：审核失败 
     * @return auditState
     */
    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public AIMTemplate withAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
        return this;
    }

    /**
     * 审批信息。
     * @return auditDesc
     */
    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public AIMTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 短信示例。  >对应创建个人模板API中的入参sms_example。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AIMTemplate withCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 创建时间。样例为：1970-01-01T00:00:00Z。
     * @return creationTime
     */
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public AIMTemplate withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。样例为：1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AIMTemplate withPages(String pages) {
        this.pages = pages;
        return this;
    }

    /**
     * 模板页面HTML，JSON格式。
     * @return pages
     */
    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public AIMTemplate withParams(List<AIMTemplateParams> params) {
        this.params = params;
        return this;
    }

    public AIMTemplate addParamsItem(AIMTemplateParams paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public AIMTemplate withParams(Consumer<List<AIMTemplateParams>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 模板动态参数列表。
     * @return params
     */
    public List<AIMTemplateParams> getParams() {
        return params;
    }

    public void setParams(List<AIMTemplateParams> params) {
        this.params = params;
    }

    public AIMTemplate withFactoryInfo(List<FactoryInfo> factoryInfo) {
        this.factoryInfo = factoryInfo;
        return this;
    }

    public AIMTemplate addFactoryInfoItem(FactoryInfo factoryInfoItem) {
        if (this.factoryInfo == null) {
            this.factoryInfo = new ArrayList<>();
        }
        this.factoryInfo.add(factoryInfoItem);
        return this;
    }

    public AIMTemplate withFactoryInfo(Consumer<List<FactoryInfo>> factoryInfoSetter) {
        if (this.factoryInfo == null) {
            this.factoryInfo = new ArrayList<>();
        }
        factoryInfoSetter.accept(this.factoryInfo);
        return this;
    }

    /**
     * 支持厂商列表。
     * @return factoryInfo
     */
    public List<FactoryInfo> getFactoryInfo() {
        return factoryInfo;
    }

    public void setFactoryInfo(List<FactoryInfo> factoryInfo) {
        this.factoryInfo = factoryInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIMTemplate aiMTemplate = (AIMTemplate) o;
        return Objects.equals(this.tplId, aiMTemplate.tplId) && Objects.equals(this.tplName, aiMTemplate.tplName)
            && Objects.equals(this.scene, aiMTemplate.scene) && Objects.equals(this.tplState, aiMTemplate.tplState)
            && Objects.equals(this.disableDesc, aiMTemplate.disableDesc)
            && Objects.equals(this.disableTime, aiMTemplate.disableTime)
            && Objects.equals(this.auditState, aiMTemplate.auditState)
            && Objects.equals(this.auditDesc, aiMTemplate.auditDesc)
            && Objects.equals(this.description, aiMTemplate.description)
            && Objects.equals(this.creationTime, aiMTemplate.creationTime)
            && Objects.equals(this.updateTime, aiMTemplate.updateTime) && Objects.equals(this.pages, aiMTemplate.pages)
            && Objects.equals(this.params, aiMTemplate.params)
            && Objects.equals(this.factoryInfo, aiMTemplate.factoryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId,
            tplName,
            scene,
            tplState,
            disableDesc,
            disableTime,
            auditState,
            auditDesc,
            description,
            creationTime,
            updateTime,
            pages,
            params,
            factoryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMTemplate {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    tplState: ").append(toIndentedString(tplState)).append("\n");
        sb.append("    disableDesc: ").append(toIndentedString(disableDesc)).append("\n");
        sb.append("    disableTime: ").append(toIndentedString(disableTime)).append("\n");
        sb.append("    auditState: ").append(toIndentedString(auditState)).append("\n");
        sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    factoryInfo: ").append(toIndentedString(factoryInfo)).append("\n");
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
