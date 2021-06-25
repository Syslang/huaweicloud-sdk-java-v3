package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.Common;
import com.huaweicloud.sdk.vod.v1.model.QualityInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TransTemplateGroup
 */
public class TransTemplateGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 是否设置默认<br/> 
     */
    public static final class StatusEnum {

        
        /**
         * Enum _1 for value: "1"
         */
        public static final StatusEnum _1 = new StatusEnum("1");
        
        /**
         * Enum _0 for value: "0"
         */
        public static final StatusEnum _0 = new StatusEnum("0");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("0", _0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * 模板组类型<br/> 
     */
    public static final class TypeEnum {

        
        /**
         * Enum CUSTOM_TEMPLATE_GROUP for value: "custom_template_group"
         */
        public static final TypeEnum CUSTOM_TEMPLATE_GROUP = new TypeEnum("custom_template_group");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("custom_template_group", CUSTOM_TEMPLATE_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;
    /**
     * 是否自动加密
     */
    public static final class AutoEncryptEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AutoEncryptEnum NUMBER_0 = new AutoEncryptEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AutoEncryptEnum NUMBER_1 = new AutoEncryptEnum(1);
        

        private static final Map<Integer, AutoEncryptEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AutoEncryptEnum> createStaticFields() {
            Map<Integer, AutoEncryptEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AutoEncryptEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AutoEncryptEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            AutoEncryptEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AutoEncryptEnum(value);
            }
            return result;
        }

        public static AutoEncryptEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            AutoEncryptEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof AutoEncryptEnum) {
                return this.value.equals(((AutoEncryptEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auto_encrypt")
    
    private AutoEncryptEnum autoEncrypt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality_info_list")
    
    private List<QualityInfo> qualityInfoList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Common common;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="watermark_template_ids")
    
    private List<String> watermarkTemplateIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public TransTemplateGroup withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板组名称<br/> 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public TransTemplateGroup withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 是否设置默认<br/> 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public TransTemplateGroup withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 模板组类型<br/> 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public TransTemplateGroup withAutoEncrypt(AutoEncryptEnum autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    


    /**
     * 是否自动加密
     * @return autoEncrypt
     */
    public AutoEncryptEnum getAutoEncrypt() {
        return autoEncrypt;
    }

    public void setAutoEncrypt(AutoEncryptEnum autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
    }

    

    public TransTemplateGroup withQualityInfoList(List<QualityInfo> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
        return this;
    }

    
    public TransTemplateGroup addQualityInfoListItem(QualityInfo qualityInfoListItem) {
        if(this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        this.qualityInfoList.add(qualityInfoListItem);
        return this;
    }

    public TransTemplateGroup withQualityInfoList(Consumer<List<QualityInfo>> qualityInfoListSetter) {
        if(this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        qualityInfoListSetter.accept(this.qualityInfoList);
        return this;
    }

    /**
     * 画质配置信息列表<br/> 
     * @return qualityInfoList
     */
    public List<QualityInfo> getQualityInfoList() {
        return qualityInfoList;
    }

    public void setQualityInfoList(List<QualityInfo> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
    }

    

    public TransTemplateGroup withCommon(Common common) {
        this.common = common;
        return this;
    }

    public TransTemplateGroup withCommon(Consumer<Common> commonSetter) {
        if(this.common == null ){
            this.common = new Common();
            commonSetter.accept(this.common);
        }
        
        return this;
    }


    /**
     * Get common
     * @return common
     */
    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    

    public TransTemplateGroup withWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
        return this;
    }

    
    public TransTemplateGroup addWatermarkTemplateIdsItem(String watermarkTemplateIdsItem) {
        if(this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        this.watermarkTemplateIds.add(watermarkTemplateIdsItem);
        return this;
    }

    public TransTemplateGroup withWatermarkTemplateIds(Consumer<List<String>> watermarkTemplateIdsSetter) {
        if(this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        watermarkTemplateIdsSetter.accept(this.watermarkTemplateIds);
        return this;
    }

    /**
     * 绑定的水印模板组ID数组<br/> 
     * @return watermarkTemplateIds
     */
    public List<String> getWatermarkTemplateIds() {
        return watermarkTemplateIds;
    }

    public void setWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
    }

    

    public TransTemplateGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 模板介绍<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransTemplateGroup transTemplateGroup = (TransTemplateGroup) o;
        return Objects.equals(this.name, transTemplateGroup.name) &&
            Objects.equals(this.status, transTemplateGroup.status) &&
            Objects.equals(this.type, transTemplateGroup.type) &&
            Objects.equals(this.autoEncrypt, transTemplateGroup.autoEncrypt) &&
            Objects.equals(this.qualityInfoList, transTemplateGroup.qualityInfoList) &&
            Objects.equals(this.common, transTemplateGroup.common) &&
            Objects.equals(this.watermarkTemplateIds, transTemplateGroup.watermarkTemplateIds) &&
            Objects.equals(this.description, transTemplateGroup.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, status, type, autoEncrypt, qualityInfoList, common, watermarkTemplateIds, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransTemplateGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    autoEncrypt: ").append(toIndentedString(autoEncrypt)).append("\n");
        sb.append("    qualityInfoList: ").append(toIndentedString(qualityInfoList)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    watermarkTemplateIds: ").append(toIndentedString(watermarkTemplateIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

