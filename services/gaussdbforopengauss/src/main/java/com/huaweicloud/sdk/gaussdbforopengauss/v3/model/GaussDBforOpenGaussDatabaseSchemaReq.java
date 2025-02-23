package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussCreateSchemaReq;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建数据库schema信息。
 */
public class GaussDBforOpenGaussDatabaseSchemaReq  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemas")
    
    private List<GaussDBforOpenGaussCreateSchemaReq> schemas = null;
    
    public GaussDBforOpenGaussDatabaseSchemaReq withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 数据库名称。  数据库名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和GaussDB 模板库重名。  GaussDB 模板库包括postgres， template0 ，template1。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public GaussDBforOpenGaussDatabaseSchemaReq withSchemas(List<GaussDBforOpenGaussCreateSchemaReq> schemas) {
        this.schemas = schemas;
        return this;
    }

    
    public GaussDBforOpenGaussDatabaseSchemaReq addSchemasItem(GaussDBforOpenGaussCreateSchemaReq schemasItem) {
        if(this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public GaussDBforOpenGaussDatabaseSchemaReq withSchemas(Consumer<List<GaussDBforOpenGaussCreateSchemaReq>> schemasSetter) {
        if(this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 每个元素都是与数据库相关联的schmea信息。单次请求最多支持20个元素。
     * @return schemas
     */
    public List<GaussDBforOpenGaussCreateSchemaReq> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<GaussDBforOpenGaussCreateSchemaReq> schemas) {
        this.schemas = schemas;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GaussDBforOpenGaussDatabaseSchemaReq gaussDBforOpenGaussDatabaseSchemaReq = (GaussDBforOpenGaussDatabaseSchemaReq) o;
        return Objects.equals(this.dbName, gaussDBforOpenGaussDatabaseSchemaReq.dbName) &&
            Objects.equals(this.schemas, gaussDBforOpenGaussDatabaseSchemaReq.schemas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussDatabaseSchemaReq {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

