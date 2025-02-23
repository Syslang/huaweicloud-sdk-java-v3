package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dcs.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class DcsAsyncClient {

    protected HcClient hcClient;

    public DcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DcsAsyncClient::new);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定实例批量添加标签，或批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteTagsResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsync(
        BatchCreateOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定实例批量添加标签，或批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsyncInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>(request,
            DcsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstancesResponse>
     */
    public CompletableFuture<BatchDeleteInstancesResponse> batchDeleteInstancesAsync(
        BatchDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesAsyncInvoker(
        BatchDeleteInstancesRequest request) {
        return new AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>(request,
            DcsMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量查询实例节点信息
     *
     * 批量查询指定项目所有实例的节点信息、有效实例个数及节点个数。
     * 创建中实例不返回节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowNodesInformationRequest 请求对象
     * @return CompletableFuture<BatchShowNodesInformationResponse>
     */
    public CompletableFuture<BatchShowNodesInformationResponse> batchShowNodesInformationAsync(
        BatchShowNodesInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchShowNodesInformation);
    }

    /**
     * 批量查询实例节点信息
     *
     * 批量查询指定项目所有实例的节点信息、有效实例个数及节点个数。
     * 创建中实例不返回节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowNodesInformationRequest 请求对象
     * @return AsyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse>
     */
    public AsyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> batchShowNodesInformationAsyncInvoker(
        BatchShowNodesInformationRequest request) {
        return new AsyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse>(request,
            DcsMeta.batchShowNodesInformation, hcClient);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopMigrationTasksRequest 请求对象
     * @return CompletableFuture<BatchStopMigrationTasksResponse>
     */
    public CompletableFuture<BatchStopMigrationTasksResponse> batchStopMigrationTasksAsync(
        BatchStopMigrationTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchStopMigrationTasks);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopMigrationTasksRequest 请求对象
     * @return AsyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse>
     */
    public AsyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> batchStopMigrationTasksAsyncInvoker(
        BatchStopMigrationTasksRequest request) {
        return new AsyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse>(request,
            DcsMeta.batchStopMigrationTasks, hcClient);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeMasterStandbyRequest 请求对象
     * @return CompletableFuture<ChangeMasterStandbyResponse>
     */
    public CompletableFuture<ChangeMasterStandbyResponse> changeMasterStandbyAsync(ChangeMasterStandbyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.changeMasterStandby);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeMasterStandbyRequest 请求对象
     * @return AsyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>
     */
    public AsyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandbyAsyncInvoker(
        ChangeMasterStandbyRequest request) {
        return new AsyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>(request,
            DcsMeta.changeMasterStandby, hcClient);
    }

    /**
     * 备份指定实例
     *
     * 备份指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyInstanceRequest 请求对象
     * @return CompletableFuture<CopyInstanceResponse>
     */
    public CompletableFuture<CopyInstanceResponse> copyInstanceAsync(CopyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.copyInstance);
    }

    /**
     * 备份指定实例
     *
     * 备份指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyInstanceRequest 请求对象
     * @return AsyncInvoker<CopyInstanceRequest, CopyInstanceResponse>
     */
    public AsyncInvoker<CopyInstanceRequest, CopyInstanceResponse> copyInstanceAsyncInvoker(
        CopyInstanceRequest request) {
        return new AsyncInvoker<CopyInstanceRequest, CopyInstanceResponse>(request, DcsMeta.copyInstance, hcClient);
    }

    /**
     * 创建过期key扫描任务
     *
     * 创建过期key扫描任务（Redis 3.0 不支持过期key扫描）。
     * 过期key扫描会对键空间进行Redis的scan扫描，释放内存中已过期但是由于惰性删除机制而没有释放的内存空间。
     * 过期key扫描在主节点上执行，会对实例性能有一定的影响，建议不要在业务高峰期进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoExpireScanTaskRequest 请求对象
     * @return CompletableFuture<CreateAutoExpireScanTaskResponse>
     */
    public CompletableFuture<CreateAutoExpireScanTaskResponse> createAutoExpireScanTaskAsync(
        CreateAutoExpireScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createAutoExpireScanTask);
    }

    /**
     * 创建过期key扫描任务
     *
     * 创建过期key扫描任务（Redis 3.0 不支持过期key扫描）。
     * 过期key扫描会对键空间进行Redis的scan扫描，释放内存中已过期但是由于惰性删除机制而没有释放的内存空间。
     * 过期key扫描在主节点上执行，会对实例性能有一定的影响，建议不要在业务高峰期进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoExpireScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse>
     */
    public AsyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> createAutoExpireScanTaskAsyncInvoker(
        CreateAutoExpireScanTaskRequest request) {
        return new AsyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse>(request,
            DcsMeta.createAutoExpireScanTask, hcClient);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBigkeyScanTaskRequest 请求对象
     * @return CompletableFuture<CreateBigkeyScanTaskResponse>
     */
    public CompletableFuture<CreateBigkeyScanTaskResponse> createBigkeyScanTaskAsync(
        CreateBigkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createBigkeyScanTask);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBigkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>
     */
    public AsyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTaskAsyncInvoker(
        CreateBigkeyScanTaskRequest request) {
        return new AsyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>(request,
            DcsMeta.createBigkeyScanTask, hcClient);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomTemplateRequest 请求对象
     * @return CompletableFuture<CreateCustomTemplateResponse>
     */
    public CompletableFuture<CreateCustomTemplateResponse> createCustomTemplateAsync(
        CreateCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createCustomTemplate);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomTemplateRequest 请求对象
     * @return AsyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse>
     */
    public AsyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse> createCustomTemplateAsyncInvoker(
        CreateCustomTemplateRequest request) {
        return new AsyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse>(request,
            DcsMeta.createCustomTemplate, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CreateDiagnosisTaskResponse>
     */
    public CompletableFuture<CreateDiagnosisTaskResponse> createDiagnosisTaskAsync(CreateDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskAsyncInvoker(
        CreateDiagnosisTaskRequest request) {
        return new AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>(request,
            DcsMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 创建热key分析任务
     *
     * 创建热key分析任务，Redis 3.0 不支持热key分析。
     * 
     * 热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHotkeyScanTaskRequest 请求对象
     * @return CompletableFuture<CreateHotkeyScanTaskResponse>
     */
    public CompletableFuture<CreateHotkeyScanTaskResponse> createHotkeyScanTaskAsync(
        CreateHotkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createHotkeyScanTask);
    }

    /**
     * 创建热key分析任务
     *
     * 创建热key分析任务，Redis 3.0 不支持热key分析。
     * 
     * 热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateHotkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>
     */
    public AsyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTaskAsyncInvoker(
        CreateHotkeyScanTaskRequest request) {
        return new AsyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>(request,
            DcsMeta.createHotkeyScanTask, hcClient);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createInstance);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DcsMeta.createInstance,
            hcClient);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMigrationTaskRequest 请求对象
     * @return CompletableFuture<CreateMigrationTaskResponse>
     */
    public CompletableFuture<CreateMigrationTaskResponse> createMigrationTaskAsync(CreateMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>
     */
    public AsyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTaskAsyncInvoker(
        CreateMigrationTaskRequest request) {
        return new AsyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>(request,
            DcsMeta.createMigrationTask, hcClient);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOnlineMigrationTaskRequest 请求对象
     * @return CompletableFuture<CreateOnlineMigrationTaskResponse>
     */
    public CompletableFuture<CreateOnlineMigrationTaskResponse> createOnlineMigrationTaskAsync(
        CreateOnlineMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createOnlineMigrationTask);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOnlineMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse>
     */
    public AsyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> createOnlineMigrationTaskAsyncInvoker(
        CreateOnlineMigrationTaskRequest request) {
        return new AsyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse>(request,
            DcsMeta.createOnlineMigrationTask, hcClient);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRedislogRequest 请求对象
     * @return CompletableFuture<CreateRedislogResponse>
     */
    public CompletableFuture<CreateRedislogResponse> createRedislogAsync(CreateRedislogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createRedislog);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRedislogRequest 请求对象
     * @return AsyncInvoker<CreateRedislogRequest, CreateRedislogResponse>
     */
    public AsyncInvoker<CreateRedislogRequest, CreateRedislogResponse> createRedislogAsyncInvoker(
        CreateRedislogRequest request) {
        return new AsyncInvoker<CreateRedislogRequest, CreateRedislogResponse>(request, DcsMeta.createRedislog,
            hcClient);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRedislogDownloadLinkRequest 请求对象
     * @return CompletableFuture<CreateRedislogDownloadLinkResponse>
     */
    public CompletableFuture<CreateRedislogDownloadLinkResponse> createRedislogDownloadLinkAsync(
        CreateRedislogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createRedislogDownloadLink);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRedislogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse>
     */
    public AsyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLinkAsyncInvoker(
        CreateRedislogDownloadLinkRequest request) {
        return new AsyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse>(request,
            DcsMeta.createRedislogDownloadLink, hcClient);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse>
     */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(
        DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskAsyncInvoker(
        DeleteBackgroundTaskRequest request) {
        return new AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>(request,
            DcsMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupFileRequest 请求对象
     * @return CompletableFuture<DeleteBackupFileResponse>
     */
    public CompletableFuture<DeleteBackupFileResponse> deleteBackupFileAsync(DeleteBackupFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupFileRequest 请求对象
     * @return AsyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>
     */
    public AsyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFileAsyncInvoker(
        DeleteBackupFileRequest request) {
        return new AsyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>(request, DcsMeta.deleteBackupFile,
            hcClient);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBigkeyScanTaskRequest 请求对象
     * @return CompletableFuture<DeleteBigkeyScanTaskResponse>
     */
    public CompletableFuture<DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskAsync(
        DeleteBigkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBigkeyScanTask);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBigkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>
     */
    public AsyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskAsyncInvoker(
        DeleteBigkeyScanTaskRequest request) {
        return new AsyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>(request,
            DcsMeta.deleteBigkeyScanTask, hcClient);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHotkeyScanTaskRequest 请求对象
     * @return CompletableFuture<DeleteHotkeyScanTaskResponse>
     */
    public CompletableFuture<DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskAsync(
        DeleteHotkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteHotkeyScanTask);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHotkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>
     */
    public AsyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskAsyncInvoker(
        DeleteHotkeyScanTaskRequest request) {
        return new AsyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>(request,
            DcsMeta.deleteHotkeyScanTask, hcClient);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpFromDomainNameRequest 请求对象
     * @return CompletableFuture<DeleteIpFromDomainNameResponse>
     */
    public CompletableFuture<DeleteIpFromDomainNameResponse> deleteIpFromDomainNameAsync(
        DeleteIpFromDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIpFromDomainNameRequest 请求对象
     * @return AsyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>
     */
    public AsyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainNameAsyncInvoker(
        DeleteIpFromDomainNameRequest request) {
        return new AsyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>(request,
            DcsMeta.deleteIpFromDomainName, hcClient);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMigrationTaskRequest 请求对象
     * @return CompletableFuture<DeleteMigrationTaskResponse>
     */
    public CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTaskAsync(DeleteMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMigrationTaskRequest 请求对象
     * @return AsyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>
     */
    public AsyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTaskAsyncInvoker(
        DeleteMigrationTaskRequest request) {
        return new AsyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>(request,
            DcsMeta.deleteMigrationTask, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除指定的缓存实例，释放该实例的所有资源。
     * 
     * &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSingleInstanceRequest 请求对象
     * @return CompletableFuture<DeleteSingleInstanceResponse>
     */
    public CompletableFuture<DeleteSingleInstanceResponse> deleteSingleInstanceAsync(
        DeleteSingleInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteSingleInstance);
    }

    /**
     * 删除实例
     *
     * 删除指定的缓存实例，释放该实例的所有资源。
     * 
     * &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSingleInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>
     */
    public AsyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstanceAsyncInvoker(
        DeleteSingleInstanceRequest request) {
        return new AsyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>(request,
            DcsMeta.deleteSingleInstance, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request,
            DcsMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ListBackgroundTaskResponse>
     */
    public CompletableFuture<ListBackgroundTaskResponse> listBackgroundTaskAsync(ListBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackgroundTask);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>
     */
    public AsyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTaskAsyncInvoker(
        ListBackgroundTaskRequest request) {
        return new AsyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>(request,
            DcsMeta.listBackgroundTask, hcClient);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupFileLinksRequest 请求对象
     * @return CompletableFuture<ListBackupFileLinksResponse>
     */
    public CompletableFuture<ListBackupFileLinksResponse> listBackupFileLinksAsync(ListBackupFileLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupFileLinksRequest 请求对象
     * @return AsyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>
     */
    public AsyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinksAsyncInvoker(
        ListBackupFileLinksRequest request) {
        return new AsyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>(request,
            DcsMeta.listBackupFileLinks, hcClient);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRecordsRequest 请求对象
     * @return CompletableFuture<ListBackupRecordsResponse>
     */
    public CompletableFuture<ListBackupRecordsResponse> listBackupRecordsAsync(ListBackupRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBackupRecordsRequest 请求对象
     * @return AsyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>
     */
    public AsyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecordsAsyncInvoker(
        ListBackupRecordsRequest request) {
        return new AsyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>(request, DcsMeta.listBackupRecords,
            hcClient);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBigkeyScanTasksRequest 请求对象
     * @return CompletableFuture<ListBigkeyScanTasksResponse>
     */
    public CompletableFuture<ListBigkeyScanTasksResponse> listBigkeyScanTasksAsync(ListBigkeyScanTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBigkeyScanTasks);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBigkeyScanTasksRequest 请求对象
     * @return AsyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>
     */
    public AsyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasksAsyncInvoker(
        ListBigkeyScanTasksRequest request) {
        return new AsyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>(request,
            DcsMeta.listBigkeyScanTasks, hcClient);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigHistoriesRequest 请求对象
     * @return CompletableFuture<ListConfigHistoriesResponse>
     */
    public CompletableFuture<ListConfigHistoriesResponse> listConfigHistoriesAsync(ListConfigHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigHistories);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigHistoriesRequest 请求对象
     * @return AsyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse>
     */
    public AsyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse> listConfigHistoriesAsyncInvoker(
        ListConfigHistoriesRequest request) {
        return new AsyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse>(request,
            DcsMeta.listConfigHistories, hcClient);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            DcsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDiagnosisTasksRequest 请求对象
     * @return CompletableFuture<ListDiagnosisTasksResponse>
     */
    public CompletableFuture<ListDiagnosisTasksResponse> listDiagnosisTasksAsync(ListDiagnosisTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listDiagnosisTasks);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDiagnosisTasksRequest 请求对象
     * @return AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>
     */
    public AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasksAsyncInvoker(
        ListDiagnosisTasksRequest request) {
        return new AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>(request,
            DcsMeta.listDiagnosisTasks, hcClient);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listFlavors);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupReplicationInfoRequest 请求对象
     * @return CompletableFuture<ListGroupReplicationInfoResponse>
     */
    public CompletableFuture<ListGroupReplicationInfoResponse> listGroupReplicationInfoAsync(
        ListGroupReplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupReplicationInfoRequest 请求对象
     * @return AsyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>
     */
    public AsyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfoAsyncInvoker(
        ListGroupReplicationInfoRequest request) {
        return new AsyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>(request,
            DcsMeta.listGroupReplicationInfo, hcClient);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHotKeyScanTasksRequest 请求对象
     * @return CompletableFuture<ListHotKeyScanTasksResponse>
     */
    public CompletableFuture<ListHotKeyScanTasksResponse> listHotKeyScanTasksAsync(ListHotKeyScanTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listHotKeyScanTasks);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHotKeyScanTasksRequest 请求对象
     * @return AsyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>
     */
    public AsyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasksAsyncInvoker(
        ListHotKeyScanTasksRequest request) {
        return new AsyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>(request,
            DcsMeta.listHotKeyScanTasks, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DcsMeta.listInstances, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMaintenanceWindowsRequest 请求对象
     * @return CompletableFuture<ListMaintenanceWindowsResponse>
     */
    public CompletableFuture<ListMaintenanceWindowsResponse> listMaintenanceWindowsAsync(
        ListMaintenanceWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMaintenanceWindowsRequest 请求对象
     * @return AsyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
     */
    public AsyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindowsAsyncInvoker(
        ListMaintenanceWindowsRequest request) {
        return new AsyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>(request,
            DcsMeta.listMaintenanceWindows, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMigrationTaskRequest 请求对象
     * @return CompletableFuture<ListMigrationTaskResponse>
     */
    public CompletableFuture<ListMigrationTaskResponse> listMigrationTaskAsync(ListMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>
     */
    public AsyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTaskAsyncInvoker(
        ListMigrationTaskRequest request) {
        return new AsyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>(request, DcsMeta.listMigrationTask,
            hcClient);
    }

    /**
     * 查询主维度信息列表
     *
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitoredObjectsRequest 请求对象
     * @return CompletableFuture<ListMonitoredObjectsResponse>
     */
    public CompletableFuture<ListMonitoredObjectsResponse> listMonitoredObjectsAsync(
        ListMonitoredObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMonitoredObjects);
    }

    /**
     * 查询主维度信息列表
     *
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitoredObjectsRequest 请求对象
     * @return AsyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>
     */
    public AsyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjectsAsyncInvoker(
        ListMonitoredObjectsRequest request) {
        return new AsyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>(request,
            DcsMeta.listMonitoredObjects, hcClient);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     *
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return CompletableFuture<ListMonitoredObjectsOfInstanceResponse>
     */
    public CompletableFuture<ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceAsync(
        ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     *
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return AsyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>
     */
    public AsyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceAsyncInvoker(
        ListMonitoredObjectsOfInstanceRequest request) {
        return new AsyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>(request,
            DcsMeta.listMonitoredObjectsOfInstance, hcClient);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return CompletableFuture<ListNumberOfInstancesInDifferentStatusResponse>
     */
    public CompletableFuture<ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusAsync(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return AsyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>
     */
    public AsyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusAsyncInvoker(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return new AsyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>(
            request, DcsMeta.listNumberOfInstancesInDifferentStatus, hcClient);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRedislogRequest 请求对象
     * @return CompletableFuture<ListRedislogResponse>
     */
    public CompletableFuture<ListRedislogResponse> listRedislogAsync(ListRedislogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listRedislog);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRedislogRequest 请求对象
     * @return AsyncInvoker<ListRedislogRequest, ListRedislogResponse>
     */
    public AsyncInvoker<ListRedislogRequest, ListRedislogResponse> listRedislogAsyncInvoker(
        ListRedislogRequest request) {
        return new AsyncInvoker<ListRedislogRequest, ListRedislogResponse>(request, DcsMeta.listRedislog, hcClient);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreRecordsRequest 请求对象
     * @return CompletableFuture<ListRestoreRecordsResponse>
     */
    public CompletableFuture<ListRestoreRecordsResponse> listRestoreRecordsAsync(ListRestoreRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreRecordsRequest 请求对象
     * @return AsyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>
     */
    public AsyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecordsAsyncInvoker(
        ListRestoreRecordsRequest request) {
        return new AsyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>(request,
            DcsMeta.listRestoreRecords, hcClient);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogRequest 请求对象
     * @return CompletableFuture<ListSlowlogResponse>
     */
    public CompletableFuture<ListSlowlogResponse> listSlowlogAsync(ListSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listSlowlog);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowlogRequest 请求对象
     * @return AsyncInvoker<ListSlowlogRequest, ListSlowlogResponse>
     */
    public AsyncInvoker<ListSlowlogRequest, ListSlowlogResponse> listSlowlogAsyncInvoker(ListSlowlogRequest request) {
        return new AsyncInvoker<ListSlowlogRequest, ListSlowlogResponse>(request, DcsMeta.listSlowlog, hcClient);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsOfRunningInstancesRequest 请求对象
     * @return CompletableFuture<ListStatisticsOfRunningInstancesResponse>
     */
    public CompletableFuture<ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesAsync(
        ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsOfRunningInstancesRequest 请求对象
     * @return AsyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>
     */
    public AsyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesAsyncInvoker(
        ListStatisticsOfRunningInstancesRequest request) {
        return new AsyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>(
            request, DcsMeta.listStatisticsOfRunningInstances, hcClient);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsOfTenantRequest 请求对象
     * @return CompletableFuture<ListTagsOfTenantResponse>
     */
    public CompletableFuture<ListTagsOfTenantResponse> listTagsOfTenantAsync(ListTagsOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listTagsOfTenant);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsOfTenantRequest 请求对象
     * @return AsyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>
     */
    public AsyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenantAsyncInvoker(
        ListTagsOfTenantRequest request) {
        return new AsyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>(request, DcsMeta.listTagsOfTenant,
            hcClient);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request, DcsMeta.resizeInstance,
            hcClient);
    }

    /**
     * 重启实例或清空数据
     *
     * 重启运行中的DCS缓存实例。
     * 
     * 清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartOrFlushInstancesRequest 请求对象
     * @return CompletableFuture<RestartOrFlushInstancesResponse>
     */
    public CompletableFuture<RestartOrFlushInstancesResponse> restartOrFlushInstancesAsync(
        RestartOrFlushInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restartOrFlushInstances);
    }

    /**
     * 重启实例或清空数据
     *
     * 重启运行中的DCS缓存实例。
     * 
     * 清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartOrFlushInstancesRequest 请求对象
     * @return AsyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>
     */
    public AsyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstancesAsyncInvoker(
        RestartOrFlushInstancesRequest request) {
        return new AsyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>(request,
            DcsMeta.restartOrFlushInstances, hcClient);
    }

    /**
     * 恢复指定实例
     *
     * 恢复指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    /**
     * 恢复指定实例
     *
     * 恢复指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>(request, DcsMeta.restoreInstance,
            hcClient);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetOnlineMigrationTaskRequest 请求对象
     * @return CompletableFuture<SetOnlineMigrationTaskResponse>
     */
    public CompletableFuture<SetOnlineMigrationTaskResponse> setOnlineMigrationTaskAsync(
        SetOnlineMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.setOnlineMigrationTask);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetOnlineMigrationTaskRequest 请求对象
     * @return AsyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse>
     */
    public AsyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> setOnlineMigrationTaskAsyncInvoker(
        SetOnlineMigrationTaskRequest request) {
        return new AsyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse>(request,
            DcsMeta.setOnlineMigrationTask, hcClient);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBigkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<ShowBigkeyAutoscanConfigResponse>
     */
    public CompletableFuture<ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigAsync(
        ShowBigkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBigkeyAutoscanConfig);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBigkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigAsyncInvoker(
        ShowBigkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>(request,
            DcsMeta.showBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowBigkeyScanTaskDetailsResponse>
     */
    public CompletableFuture<ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsAsync(
        ShowBigkeyScanTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBigkeyScanTaskDetails);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>
     */
    public AsyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsAsyncInvoker(
        ShowBigkeyScanTaskDetailsRequest request) {
        return new AsyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>(request,
            DcsMeta.showBigkeyScanTaskDetails, hcClient);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiagnosisTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisTaskDetailsResponse>
     */
    public CompletableFuture<ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetailsAsync(
        ShowDiagnosisTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showDiagnosisTaskDetails);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiagnosisTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse>
     */
    public AsyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetailsAsyncInvoker(
        ShowDiagnosisTaskDetailsRequest request) {
        return new AsyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse>(request,
            DcsMeta.showDiagnosisTaskDetails, hcClient);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHotkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<ShowHotkeyAutoscanConfigResponse>
     */
    public CompletableFuture<ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigAsync(
        ShowHotkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showHotkeyAutoscanConfig);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHotkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigAsyncInvoker(
        ShowHotkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>(request,
            DcsMeta.showHotkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHotkeyTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowHotkeyTaskDetailsResponse>
     */
    public CompletableFuture<ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsAsync(
        ShowHotkeyTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showHotkeyTaskDetails);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHotkeyTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>
     */
    public AsyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsAsyncInvoker(
        ShowHotkeyTaskDetailsRequest request) {
        return new AsyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>(request,
            DcsMeta.showHotkeyTaskDetails, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, DcsMeta.showInstance, hcClient);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigrationTaskRequest 请求对象
     * @return CompletableFuture<ShowMigrationTaskResponse>
     */
    public CompletableFuture<ShowMigrationTaskResponse> showMigrationTaskAsync(ShowMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>
     */
    public AsyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTaskAsyncInvoker(
        ShowMigrationTaskRequest request) {
        return new AsyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>(request, DcsMeta.showMigrationTask,
            hcClient);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigrationTaskStatsRequest 请求对象
     * @return CompletableFuture<ShowMigrationTaskStatsResponse>
     */
    public CompletableFuture<ShowMigrationTaskStatsResponse> showMigrationTaskStatsAsync(
        ShowMigrationTaskStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showMigrationTaskStats);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMigrationTaskStatsRequest 请求对象
     * @return AsyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>
     */
    public AsyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStatsAsyncInvoker(
        ShowMigrationTaskStatsRequest request) {
        return new AsyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>(request,
            DcsMeta.showMigrationTaskStats, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaOfTenantRequest 请求对象
     * @return CompletableFuture<ShowQuotaOfTenantResponse>
     */
    public CompletableFuture<ShowQuotaOfTenantResponse> showQuotaOfTenantAsync(ShowQuotaOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaOfTenantRequest 请求对象
     * @return AsyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>
     */
    public AsyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenantAsyncInvoker(
        ShowQuotaOfTenantRequest request) {
        return new AsyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>(request, DcsMeta.showQuotaOfTenant,
            hcClient);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagsRequest 请求对象
     * @return CompletableFuture<ShowTagsResponse>
     */
    public CompletableFuture<ShowTagsResponse> showTagsAsync(ShowTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showTags);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagsRequest 请求对象
     * @return AsyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public AsyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsAsyncInvoker(ShowTagsRequest request) {
        return new AsyncInvoker<ShowTagsRequest, ShowTagsResponse>(request, DcsMeta.showTags, hcClient);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopMigrationTaskRequest 请求对象
     * @return CompletableFuture<StopMigrationTaskResponse>
     */
    public CompletableFuture<StopMigrationTaskResponse> stopMigrationTaskAsync(StopMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopMigrationTaskRequest 请求对象
     * @return AsyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>
     */
    public AsyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTaskAsyncInvoker(
        StopMigrationTaskRequest request) {
        return new AsyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>(request, DcsMeta.stopMigrationTask,
            hcClient);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopMigrationTaskSyncRequest 请求对象
     * @return CompletableFuture<StopMigrationTaskSyncResponse>
     */
    public CompletableFuture<StopMigrationTaskSyncResponse> stopMigrationTaskSyncAsync(
        StopMigrationTaskSyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.stopMigrationTaskSync);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopMigrationTaskSyncRequest 请求对象
     * @return AsyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse>
     */
    public AsyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> stopMigrationTaskSyncAsyncInvoker(
        StopMigrationTaskSyncRequest request) {
        return new AsyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse>(request,
            DcsMeta.stopMigrationTaskSync, hcClient);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<UpdateBigkeyAutoscanConfigResponse>
     */
    public CompletableFuture<UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigAsync(
        UpdateBigkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateBigkeyAutoscanConfig);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigAsyncInvoker(
        UpdateBigkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>(request,
            DcsMeta.updateBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationsRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationsResponse>
     */
    public CompletableFuture<UpdateConfigurationsResponse> updateConfigurationsAsync(
        UpdateConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationsRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>
     */
    public AsyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurationsAsyncInvoker(
        UpdateConfigurationsRequest request) {
        return new AsyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>(request,
            DcsMeta.updateConfigurations, hcClient);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return CompletableFuture<UpdateHotkeyAutoScanConfigResponse>
     */
    public CompletableFuture<UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigAsync(
        UpdateHotkeyAutoScanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateHotkeyAutoScanConfig);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>
     */
    public AsyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigAsyncInvoker(
        UpdateHotkeyAutoScanConfigRequest request) {
        return new AsyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>(request,
            DcsMeta.updateHotkeyAutoScanConfig, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, DcsMeta.updateInstance,
            hcClient);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePasswordRequest 请求对象
     * @return CompletableFuture<UpdatePasswordResponse>
     */
    public CompletableFuture<UpdatePasswordResponse> updatePasswordAsync(UpdatePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updatePassword);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePasswordRequest 请求对象
     * @return AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>
     */
    public AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse> updatePasswordAsyncInvoker(
        UpdatePasswordRequest request) {
        return new AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>(request, DcsMeta.updatePassword,
            hcClient);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSlavePriorityRequest 请求对象
     * @return CompletableFuture<UpdateSlavePriorityResponse>
     */
    public CompletableFuture<UpdateSlavePriorityResponse> updateSlavePriorityAsync(UpdateSlavePriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSlavePriorityRequest 请求对象
     * @return AsyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>
     */
    public AsyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriorityAsyncInvoker(
        UpdateSlavePriorityRequest request) {
        return new AsyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>(request,
            DcsMeta.updateSlavePriority, hcClient);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpWhitelistRequest 请求对象
     * @return CompletableFuture<ShowIpWhitelistResponse>
     */
    public CompletableFuture<ShowIpWhitelistResponse> showIpWhitelistAsync(ShowIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpWhitelistRequest 请求对象
     * @return AsyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>
     */
    public AsyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelistAsyncInvoker(
        ShowIpWhitelistRequest request) {
        return new AsyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>(request, DcsMeta.showIpWhitelist,
            hcClient);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateIpWhitelistResponse>
     */
    public CompletableFuture<UpdateIpWhitelistResponse> updateIpWhitelistAsync(UpdateIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIpWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>
     */
    public AsyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelistAsyncInvoker(
        UpdateIpWhitelistRequest request) {
        return new AsyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>(request, DcsMeta.updateIpWhitelist,
            hcClient);
    }

}
