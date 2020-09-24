package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateIncidentV2Req
 */
public class CreateIncidentV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_sub_type_id")
    
    private String incidentSubTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_category_id")
    
    private String productCategoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_id")
    
    private String businessTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="simple_description")
    
    private String simpleDescription;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_id")
    
    private String sourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_authorized")
    
    private Integer isAuthorized;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_content")
    
    private String authorizationContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remind_mobile")
    
    private String remindMobile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remind_mail")
    
    private String remindMail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remind_time")
    
    private String remindTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessory_ids")
    
    private List<String> accessoryIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extends_map")
    
    private Map<String, Object> extendsMap = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extension_map")
    
    private Map<String, Object> extensionMap = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity_id")
    
    private String severityId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verify_code")
    
    private String verifyCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area_code")
    
    private String areaCode;

    public CreateIncidentV2Req withIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
        return this;
    }

    


    /**
     * 工单子类
     * @return incidentSubTypeId
     */
    public String getIncidentSubTypeId() {
        return incidentSubTypeId;
    }

    public void setIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
    }

    public CreateIncidentV2Req withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    


    /**
     * 工单产品类型
     * @return productCategoryId
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public CreateIncidentV2Req withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    


    /**
     * 工单问题类型
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public CreateIncidentV2Req withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateIncidentV2Req withSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
        return this;
    }

    


    /**
     * 问题描述
     * @return simpleDescription
     */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public CreateIncidentV2Req withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    


    /**
     * 工单来源
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateIncidentV2Req withIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    


    /**
     * 是否授权
     * minimum: 0
     * maximum: 1
     * @return isAuthorized
     */
    public Integer getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public CreateIncidentV2Req withAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
        return this;
    }

    


    /**
     * 机密信息内容
     * @return authorizationContent
     */
    public String getAuthorizationContent() {
        return authorizationContent;
    }

    public void setAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
    }

    public CreateIncidentV2Req withRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
        return this;
    }

    


    /**
     * 提醒手机号
     * @return remindMobile
     */
    public String getRemindMobile() {
        return remindMobile;
    }

    public void setRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
    }

    public CreateIncidentV2Req withRemindMail(String remindMail) {
        this.remindMail = remindMail;
        return this;
    }

    


    /**
     * 提醒邮箱
     * @return remindMail
     */
    public String getRemindMail() {
        return remindMail;
    }

    public void setRemindMail(String remindMail) {
        this.remindMail = remindMail;
    }

    public CreateIncidentV2Req withRemindTime(String remindTime) {
        this.remindTime = remindTime;
        return this;
    }

    


    /**
     * 提醒时间
     * @return remindTime
     */
    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public CreateIncidentV2Req withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * ProjectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateIncidentV2Req withAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
        return this;
    }

    
    public CreateIncidentV2Req addAccessoryIdsItem(String accessoryIdsItem) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        this.accessoryIds.add(accessoryIdsItem);
        return this;
    }

    public CreateIncidentV2Req withAccessoryIds(Consumer<List<String>> accessoryIdsSetter) {
        if(this.accessoryIds == null ){
            this.accessoryIds = new ArrayList<>();
        }
        accessoryIdsSetter.accept(this.accessoryIds);
        return this;
    }

    /**
     * 附件id列表
     * @return accessoryIds
     */
    public List<String> getAccessoryIds() {
        return accessoryIds;
    }

    public void setAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
    }

    public CreateIncidentV2Req withExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }

    

    public CreateIncidentV2Req putExtendsMapItem(String key, Object extendsMapItem) {
         if (this.extendsMap == null) {
            this.extendsMap = new HashMap<>();
         }
        this.extendsMap.put(key, extendsMapItem);
        return this;
    }

    public CreateIncidentV2Req withExtendsMap(Consumer<Map<String, Object>> extendsMapSetter) {
        if(this.extendsMap == null ){
            this.extendsMap = new HashMap<>();
        }
        extendsMapSetter.accept(this.extendsMap);
        return this;
    }
    /**
     * 附加参数
     * @return extendsMap
     */
    public Map<String, Object> getExtendsMap() {
        return extendsMap;
    }

    public void setExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
    }

    public CreateIncidentV2Req withExtensionMap(Map<String, Object> extensionMap) {
        this.extensionMap = extensionMap;
        return this;
    }

    

    public CreateIncidentV2Req putExtensionMapItem(String key, Object extensionMapItem) {
         if (this.extensionMap == null) {
            this.extensionMap = new HashMap<>();
         }
        this.extensionMap.put(key, extensionMapItem);
        return this;
    }

    public CreateIncidentV2Req withExtensionMap(Consumer<Map<String, Object>> extensionMapSetter) {
        if(this.extensionMap == null ){
            this.extensionMap = new HashMap<>();
        }
        extensionMapSetter.accept(this.extensionMap);
        return this;
    }
    /**
     * 扩展参数
     * @return extensionMap
     */
    public Map<String, Object> getExtensionMap() {
        return extensionMap;
    }

    public void setExtensionMap(Map<String, Object> extensionMap) {
        this.extensionMap = extensionMap;
    }

    public CreateIncidentV2Req withSeverityId(String severityId) {
        this.severityId = severityId;
        return this;
    }

    


    /**
     * 严重性id
     * @return severityId
     */
    public String getSeverityId() {
        return severityId;
    }

    public void setSeverityId(String severityId) {
        this.severityId = severityId;
    }

    public CreateIncidentV2Req withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    


    /**
     * 验证码
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public CreateIncidentV2Req withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    


    /**
     * 国家码
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIncidentV2Req createIncidentV2Req = (CreateIncidentV2Req) o;
        return Objects.equals(this.incidentSubTypeId, createIncidentV2Req.incidentSubTypeId) &&
            Objects.equals(this.productCategoryId, createIncidentV2Req.productCategoryId) &&
            Objects.equals(this.businessTypeId, createIncidentV2Req.businessTypeId) &&
            Objects.equals(this.regionId, createIncidentV2Req.regionId) &&
            Objects.equals(this.simpleDescription, createIncidentV2Req.simpleDescription) &&
            Objects.equals(this.sourceId, createIncidentV2Req.sourceId) &&
            Objects.equals(this.isAuthorized, createIncidentV2Req.isAuthorized) &&
            Objects.equals(this.authorizationContent, createIncidentV2Req.authorizationContent) &&
            Objects.equals(this.remindMobile, createIncidentV2Req.remindMobile) &&
            Objects.equals(this.remindMail, createIncidentV2Req.remindMail) &&
            Objects.equals(this.remindTime, createIncidentV2Req.remindTime) &&
            Objects.equals(this.projectId, createIncidentV2Req.projectId) &&
            Objects.equals(this.accessoryIds, createIncidentV2Req.accessoryIds) &&
            Objects.equals(this.extendsMap, createIncidentV2Req.extendsMap) &&
            Objects.equals(this.extensionMap, createIncidentV2Req.extensionMap) &&
            Objects.equals(this.severityId, createIncidentV2Req.severityId) &&
            Objects.equals(this.verifyCode, createIncidentV2Req.verifyCode) &&
            Objects.equals(this.areaCode, createIncidentV2Req.areaCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(incidentSubTypeId, productCategoryId, businessTypeId, regionId, simpleDescription, sourceId, isAuthorized, authorizationContent, remindMobile, remindMail, remindTime, projectId, accessoryIds, extendsMap, extensionMap, severityId, verifyCode, areaCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIncidentV2Req {\n");
        sb.append("    incidentSubTypeId: ").append(toIndentedString(incidentSubTypeId)).append("\n");
        sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    authorizationContent: ").append(toIndentedString(authorizationContent)).append("\n");
        sb.append("    remindMobile: ").append(toIndentedString(remindMobile)).append("\n");
        sb.append("    remindMail: ").append(toIndentedString(remindMail)).append("\n");
        sb.append("    remindTime: ").append(toIndentedString(remindTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    accessoryIds: ").append(toIndentedString(accessoryIds)).append("\n");
        sb.append("    extendsMap: ").append(toIndentedString(extendsMap)).append("\n");
        sb.append("    extensionMap: ").append(toIndentedString(extensionMap)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

