package com.huaweicloud.sdk.dds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 增强版实例的存储池空间信息，仅针对增强版实例有效。
 */
public class CreateInstanceStorageResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public CreateInstanceStorageResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 社区增强版实例的存储池空间大小，仅针对增强版实例有效
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceStorageResult createInstanceStorageResult = (CreateInstanceStorageResult) o;
        return Objects.equals(this.size, createInstanceStorageResult.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceStorageResult {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

