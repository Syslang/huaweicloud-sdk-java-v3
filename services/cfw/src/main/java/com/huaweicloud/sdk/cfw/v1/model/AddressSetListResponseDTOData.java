package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询地址组列表返回数据
 */
public class AddressSetListResponseDTOData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AddressSetListResponseDTODataRecords> records = null;

    public AddressSetListResponseDTOData withOffset(Integer offset) {
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

    public AddressSetListResponseDTOData withLimit(Integer limit) {
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

    public AddressSetListResponseDTOData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public AddressSetListResponseDTOData withRecords(List<AddressSetListResponseDTODataRecords> records) {
        this.records = records;
        return this;
    }

    public AddressSetListResponseDTOData addRecordsItem(AddressSetListResponseDTODataRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public AddressSetListResponseDTOData withRecords(
        Consumer<List<AddressSetListResponseDTODataRecords>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 地址组列表
     * @return records
     */
    public List<AddressSetListResponseDTODataRecords> getRecords() {
        return records;
    }

    public void setRecords(List<AddressSetListResponseDTODataRecords> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressSetListResponseDTOData addressSetListResponseDTOData = (AddressSetListResponseDTOData) o;
        return Objects.equals(this.offset, addressSetListResponseDTOData.offset)
            && Objects.equals(this.limit, addressSetListResponseDTOData.limit)
            && Objects.equals(this.total, addressSetListResponseDTOData.total)
            && Objects.equals(this.records, addressSetListResponseDTOData.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressSetListResponseDTOData {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
