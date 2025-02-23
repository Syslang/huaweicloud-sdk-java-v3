package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 任务执行详细跟踪日志
 */
public class TaskMonitorDetailLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    /**
     * 标识当前步骤属于哪一个阶段，允许如下值：ADAPTER-任务处于初始化阶段, READER-任务正在执行Reader读操作, WRITER-任务正在执行Writer写操作
     */
    public static final class PositionEnum {

        /**
         * Enum ADAPTER for value: "ADAPTER"
         */
        public static final PositionEnum ADAPTER = new PositionEnum("ADAPTER");

        /**
         * Enum READER for value: "READER"
         */
        public static final PositionEnum READER = new PositionEnum("READER");

        /**
         * Enum WRITER for value: "WRITER"
         */
        public static final PositionEnum WRITER = new PositionEnum("WRITER");

        private static final Map<String, PositionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionEnum> createStaticFields() {
            Map<String, PositionEnum> map = new HashMap<>();
            map.put("ADAPTER", ADAPTER);
            map.put("READER", READER);
            map.put("WRITER", WRITER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PositionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PositionEnum(value);
            }
            return result;
        }

        public static PositionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PositionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionEnum) {
                return this.value.equals(((PositionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private PositionEnum position;

    /**
     * 任务当前步骤的状态，允许如下值：NORMAL-正在运行, NODE_END-本节点正常结束, RUNTIME_CANCEL-任务被取消, TASK_END-本任务正常结束, RUNTIME_ERR-运行时异常, INTERNAL_ERR-内部程序异常
     */
    public static final class PositionStatusEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final PositionStatusEnum NORMAL = new PositionStatusEnum("NORMAL");

        /**
         * Enum NODE_END for value: "NODE_END"
         */
        public static final PositionStatusEnum NODE_END = new PositionStatusEnum("NODE_END");

        /**
         * Enum RUNTIME_CANCEL for value: "RUNTIME_CANCEL"
         */
        public static final PositionStatusEnum RUNTIME_CANCEL = new PositionStatusEnum("RUNTIME_CANCEL");

        /**
         * Enum TASK_END for value: "TASK_END"
         */
        public static final PositionStatusEnum TASK_END = new PositionStatusEnum("TASK_END");

        /**
         * Enum RUNTIME_ERR for value: "RUNTIME_ERR"
         */
        public static final PositionStatusEnum RUNTIME_ERR = new PositionStatusEnum("RUNTIME_ERR");

        /**
         * Enum INTERNAL_ERR for value: "INTERNAL_ERR"
         */
        public static final PositionStatusEnum INTERNAL_ERR = new PositionStatusEnum("INTERNAL_ERR");

        private static final Map<String, PositionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PositionStatusEnum> createStaticFields() {
            Map<String, PositionStatusEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("NODE_END", NODE_END);
            map.put("RUNTIME_CANCEL", RUNTIME_CANCEL);
            map.put("TASK_END", TASK_END);
            map.put("RUNTIME_ERR", RUNTIME_ERR);
            map.put("INTERNAL_ERR", INTERNAL_ERR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PositionStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PositionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PositionStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PositionStatusEnum(value);
            }
            return result;
        }

        public static PositionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PositionStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PositionStatusEnum) {
                return this.value.equals(((PositionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_status")

    private PositionStatusEnum positionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_data_count")

    private Integer dirtyDataCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_count")

    private Integer dataCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private BigDecimal dataSize;

    /**
     * 成功数据大小的计量单位
     */
    public static final class DataSizeUnitEnum {

        /**
         * Enum B for value: "B"
         */
        public static final DataSizeUnitEnum B = new DataSizeUnitEnum("B");

        /**
         * Enum KB for value: "KB"
         */
        public static final DataSizeUnitEnum KB = new DataSizeUnitEnum("KB");

        /**
         * Enum MB for value: "MB"
         */
        public static final DataSizeUnitEnum MB = new DataSizeUnitEnum("MB");

        /**
         * Enum GB for value: "GB"
         */
        public static final DataSizeUnitEnum GB = new DataSizeUnitEnum("GB");

        /**
         * Enum TB for value: "TB"
         */
        public static final DataSizeUnitEnum TB = new DataSizeUnitEnum("TB");

        private static final Map<String, DataSizeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataSizeUnitEnum> createStaticFields() {
            Map<String, DataSizeUnitEnum> map = new HashMap<>();
            map.put("B", B);
            map.put("KB", KB);
            map.put("MB", MB);
            map.put("GB", GB);
            map.put("TB", TB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataSizeUnitEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataSizeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DataSizeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DataSizeUnitEnum(value);
            }
            return result;
        }

        public static DataSizeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DataSizeUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataSizeUnitEnum) {
                return this.value.equals(((DataSizeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size_unit")

    private DataSizeUnitEnum dataSizeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spend_time")

    private Integer spendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_begin_time")

    private Long stepBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_end_time")

    private Long stepEndTime;

    public TaskMonitorDetailLog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务每次执行步骤产生的唯一ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskMonitorDetailLog withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 当前步骤执行详细状态，使用状态码的形式</br> 状态码划分规则：reader端 100 ~ 499，writer端 500 ~ 899，其他900 ~ </br> 当前状态码如下：</br> 16-被强制取消</br> 99-任务开始</br> 100-Reader 任务开始</br> 101-Reader 任务结束</br> 102-正在读取数据</br> 103-读端数据源端异常</br> 104-读取数据结束</br> 105-读取数据为0</br> 106-读任务强制取消</br> 107-在reader plugin中，任务发生了中断</br> 108-读任务恢复运行</br> 500-Writer 任务开始</br> 501-Writer 任务结束</br> 502-正在数据写入</br> 503-目标端异常</br> 504-数据写入结束</br> 505-写任务强制取消</br> 506-在writer plugin中，任务发生了中断</br> 507-写任务恢复运行</br> 900-接收到调度请求</br> 901-任务运行结束</br> 902-任务已运行结束，正在进行数据完整性校验</br> 903-输出数据完整性校验结果</br> 904-经过数据完整性校验，发现有数据缺失，正在进行数据补偿</br> 905-输出数据补偿结果</br> 906-读取任务正在在排队中（平台资源）</br> 907-读取任务被拒绝执行，因为上一次调度还没有结束</br> 908-写入任务正在在排队中（平台资源）</br> 909-写入任务被拒绝执行，因为上一次调度还没有结束</br> 911-读取任务没有被正常开启，请检查网络是否通畅，参数是否正确</br> 912-写入任务没有被正常开启，请检查网络是否通畅，参数是否正确</br> 913-任务调度请求失败</br> 914-任务被拒绝执行，因为上一次调度还没有结束</br> 915-任务不正常运行</br> 916-任务日志上报异常</br>
     * minimum: 1
     * maximum: 1000
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TaskMonitorDetailLog withPosition(PositionEnum position) {
        this.position = position;
        return this;
    }

    /**
     * 标识当前步骤属于哪一个阶段，允许如下值：ADAPTER-任务处于初始化阶段, READER-任务正在执行Reader读操作, WRITER-任务正在执行Writer写操作
     * @return position
     */
    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public TaskMonitorDetailLog withPositionStatus(PositionStatusEnum positionStatus) {
        this.positionStatus = positionStatus;
        return this;
    }

    /**
     * 任务当前步骤的状态，允许如下值：NORMAL-正在运行, NODE_END-本节点正常结束, RUNTIME_CANCEL-任务被取消, TASK_END-本任务正常结束, RUNTIME_ERR-运行时异常, INTERNAL_ERR-内部程序异常
     * @return positionStatus
     */
    public PositionStatusEnum getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(PositionStatusEnum positionStatus) {
        this.positionStatus = positionStatus;
    }

    public TaskMonitorDetailLog withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 标识当前步骤属于哪一个FDI插件，如adapter, apireader, rdbwriter等
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public TaskMonitorDetailLog withDirtyDataCount(Integer dirtyDataCount) {
        this.dirtyDataCount = dirtyDataCount;
        return this;
    }

    /**
     * 异常数据条数
     * minimum: 0
     * maximum: 9999999999999
     * @return dirtyDataCount
     */
    public Integer getDirtyDataCount() {
        return dirtyDataCount;
    }

    public void setDirtyDataCount(Integer dirtyDataCount) {
        this.dirtyDataCount = dirtyDataCount;
    }

    public TaskMonitorDetailLog withDataCount(Integer dataCount) {
        this.dataCount = dataCount;
        return this;
    }

    /**
     * 成功数据条数
     * minimum: 0
     * maximum: 9999999999999
     * @return dataCount
     */
    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public TaskMonitorDetailLog withDataSize(BigDecimal dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 成功数据大小，浮点数类型
     * minimum: 0
     * maximum: 9999999999999
     * @return dataSize
     */
    public BigDecimal getDataSize() {
        return dataSize;
    }

    public void setDataSize(BigDecimal dataSize) {
        this.dataSize = dataSize;
    }

    public TaskMonitorDetailLog withDataSizeUnit(DataSizeUnitEnum dataSizeUnit) {
        this.dataSizeUnit = dataSizeUnit;
        return this;
    }

    /**
     * 成功数据大小的计量单位
     * @return dataSizeUnit
     */
    public DataSizeUnitEnum getDataSizeUnit() {
        return dataSizeUnit;
    }

    public void setDataSizeUnit(DataSizeUnitEnum dataSizeUnit) {
        this.dataSizeUnit = dataSizeUnit;
    }

    public TaskMonitorDetailLog withSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
        return this;
    }

    /**
     * 执行时长，单位：ms
     * minimum: 0
     * maximum: 9999999999999
     * @return spendTime
     */
    public Integer getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    public TaskMonitorDetailLog withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 执行详细信息
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public TaskMonitorDetailLog withStepBeginTime(Long stepBeginTime) {
        this.stepBeginTime = stepBeginTime;
        return this;
    }

    /**
     * 本次步骤启动时间，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 9999999999999
     * @return stepBeginTime
     */
    public Long getStepBeginTime() {
        return stepBeginTime;
    }

    public void setStepBeginTime(Long stepBeginTime) {
        this.stepBeginTime = stepBeginTime;
    }

    public TaskMonitorDetailLog withStepEndTime(Long stepEndTime) {
        this.stepEndTime = stepEndTime;
        return this;
    }

    /**
     * 本次步骤结束时间，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 9999999999999
     * @return stepEndTime
     */
    public Long getStepEndTime() {
        return stepEndTime;
    }

    public void setStepEndTime(Long stepEndTime) {
        this.stepEndTime = stepEndTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskMonitorDetailLog taskMonitorDetailLog = (TaskMonitorDetailLog) o;
        return Objects.equals(this.id, taskMonitorDetailLog.id)
            && Objects.equals(this.status, taskMonitorDetailLog.status)
            && Objects.equals(this.position, taskMonitorDetailLog.position)
            && Objects.equals(this.positionStatus, taskMonitorDetailLog.positionStatus)
            && Objects.equals(this.stage, taskMonitorDetailLog.stage)
            && Objects.equals(this.dirtyDataCount, taskMonitorDetailLog.dirtyDataCount)
            && Objects.equals(this.dataCount, taskMonitorDetailLog.dataCount)
            && Objects.equals(this.dataSize, taskMonitorDetailLog.dataSize)
            && Objects.equals(this.dataSizeUnit, taskMonitorDetailLog.dataSizeUnit)
            && Objects.equals(this.spendTime, taskMonitorDetailLog.spendTime)
            && Objects.equals(this.remarks, taskMonitorDetailLog.remarks)
            && Objects.equals(this.stepBeginTime, taskMonitorDetailLog.stepBeginTime)
            && Objects.equals(this.stepEndTime, taskMonitorDetailLog.stepEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            position,
            positionStatus,
            stage,
            dirtyDataCount,
            dataCount,
            dataSize,
            dataSizeUnit,
            spendTime,
            remarks,
            stepBeginTime,
            stepEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskMonitorDetailLog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    positionStatus: ").append(toIndentedString(positionStatus)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    dirtyDataCount: ").append(toIndentedString(dirtyDataCount)).append("\n");
        sb.append("    dataCount: ").append(toIndentedString(dataCount)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    dataSizeUnit: ").append(toIndentedString(dataSizeUnit)).append("\n");
        sb.append("    spendTime: ").append(toIndentedString(spendTime)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    stepBeginTime: ").append(toIndentedString(stepBeginTime)).append("\n");
        sb.append("    stepEndTime: ").append(toIndentedString(stepEndTime)).append("\n");
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
