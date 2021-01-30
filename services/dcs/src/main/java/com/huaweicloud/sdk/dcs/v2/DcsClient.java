package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dcs.v2.model.*;

public class DcsClient {
    protected HcClient hcClient;

    public DcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsClient> newBuilder() {
        return new ClientBuilder<>(DcsClient::new);
    }


    /**
     * 批量添加或删除标签
     * 为指定实例批量添加标签，或批量删除标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return BatchCreateOrDeleteTagsResponse
     */
    public BatchCreateOrDeleteTagsResponse batchCreateOrDeleteTags(BatchCreateOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除标签
     * 为指定实例批量添加标签，或批量删除标签。
     *
     * @param BatchCreateOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsInvoker(BatchCreateOrDeleteTagsRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>(request, DcsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 批量删除实例
     * 批量删除多个缓存实例。
     *
     * @param BatchDeleteInstancesRequest 请求对象
     * @return BatchDeleteInstancesResponse
     */
    public BatchDeleteInstancesResponse batchDeleteInstances(BatchDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     * 批量删除多个缓存实例。
     *
     * @param BatchDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesInvoker(BatchDeleteInstancesRequest request) {
        return new SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>(request, DcsMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 主备切换
     * 切换实例主备节点，只有主备实例支持该操作。
     *
     * @param ChangeMasterStandbyRequest 请求对象
     * @return ChangeMasterStandbyResponse
     */
    public ChangeMasterStandbyResponse changeMasterStandby(ChangeMasterStandbyRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.changeMasterStandby);
    }

    /**
     * 主备切换
     * 切换实例主备节点，只有主备实例支持该操作。
     *
     * @param ChangeMasterStandbyRequest 请求对象
     * @return SyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>
     */
    public SyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandbyInvoker(ChangeMasterStandbyRequest request) {
        return new SyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>(request, DcsMeta.changeMasterStandby, hcClient);
    }

    /**
     * 备份指定实例
     * 备份指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param CopyInstanceRequest 请求对象
     * @return CopyInstanceResponse
     */
    public CopyInstanceResponse copyInstance(CopyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.copyInstance);
    }

    /**
     * 备份指定实例
     * 备份指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param CopyInstanceRequest 请求对象
     * @return SyncInvoker<CopyInstanceRequest, CopyInstanceResponse>
     */
    public SyncInvoker<CopyInstanceRequest, CopyInstanceResponse> copyInstanceInvoker(CopyInstanceRequest request) {
        return new SyncInvoker<CopyInstanceRequest, CopyInstanceResponse>(request, DcsMeta.copyInstance, hcClient);
    }

    /**
     * 创建大key分析任务
     * 为Redis实例创建大key分析任务。
     *
     * @param CreateBigkeyScanTaskRequest 请求对象
     * @return CreateBigkeyScanTaskResponse
     */
    public CreateBigkeyScanTaskResponse createBigkeyScanTask(CreateBigkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createBigkeyScanTask);
    }

    /**
     * 创建大key分析任务
     * 为Redis实例创建大key分析任务。
     *
     * @param CreateBigkeyScanTaskRequest 请求对象
     * @return SyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>
     */
    public SyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTaskInvoker(CreateBigkeyScanTaskRequest request) {
        return new SyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>(request, DcsMeta.createBigkeyScanTask, hcClient);
    }

    /**
     * 创建热key分析任务
     * 创建热key分析任务，Redis 3.0 不支持热key分析。  热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。 
     *
     * @param CreateHotkeyScanTaskRequest 请求对象
     * @return CreateHotkeyScanTaskResponse
     */
    public CreateHotkeyScanTaskResponse createHotkeyScanTask(CreateHotkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createHotkeyScanTask);
    }

    /**
     * 创建热key分析任务
     * 创建热key分析任务，Redis 3.0 不支持热key分析。  热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。 
     *
     * @param CreateHotkeyScanTaskRequest 请求对象
     * @return SyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>
     */
    public SyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTaskInvoker(CreateHotkeyScanTaskRequest request) {
        return new SyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>(request, DcsMeta.createHotkeyScanTask, hcClient);
    }

    /**
     * 创建缓存实例
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createInstance);
    }

    /**
     * 创建缓存实例
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, DcsMeta.createInstance, hcClient);
    }

    /**
     * 创建数据迁移任务
     * 创建数据迁移任务。
     *
     * @param CreateMigrationTaskRequest 请求对象
     * @return CreateMigrationTaskResponse
     */
    public CreateMigrationTaskResponse createMigrationTask(CreateMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    /**
     * 创建数据迁移任务
     * 创建数据迁移任务。
     *
     * @param CreateMigrationTaskRequest 请求对象
     * @return SyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>
     */
    public SyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTaskInvoker(CreateMigrationTaskRequest request) {
        return new SyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>(request, DcsMeta.createMigrationTask, hcClient);
    }

    /**
     * 删除后台任务
     * 删除后台任务
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
     */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务
     * 删除后台任务
     *
     * @param DeleteBackgroundTaskRequest 请求对象
     * @return SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskInvoker(DeleteBackgroundTaskRequest request) {
        return new SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>(request, DcsMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除备份文件
     * 删除缓存实例已备份的文件。
     *
     * @param DeleteBackupFileRequest 请求对象
     * @return DeleteBackupFileResponse
     */
    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    /**
     * 删除备份文件
     * 删除缓存实例已备份的文件。
     *
     * @param DeleteBackupFileRequest 请求对象
     * @return SyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>
     */
    public SyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFileInvoker(DeleteBackupFileRequest request) {
        return new SyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>(request, DcsMeta.deleteBackupFile, hcClient);
    }

    /**
     * 删除大key分析记录
     * 删除大key分析记录。
     *
     * @param DeleteBigkeyScanTaskRequest 请求对象
     * @return DeleteBigkeyScanTaskResponse
     */
    public DeleteBigkeyScanTaskResponse deleteBigkeyScanTask(DeleteBigkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBigkeyScanTask);
    }

    /**
     * 删除大key分析记录
     * 删除大key分析记录。
     *
     * @param DeleteBigkeyScanTaskRequest 请求对象
     * @return SyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>
     */
    public SyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskInvoker(DeleteBigkeyScanTaskRequest request) {
        return new SyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>(request, DcsMeta.deleteBigkeyScanTask, hcClient);
    }

    /**
     * 删除热key分析任务
     * 删除热key分析任务。
     *
     * @param DeleteHotkeyScanTaskRequest 请求对象
     * @return DeleteHotkeyScanTaskResponse
     */
    public DeleteHotkeyScanTaskResponse deleteHotkeyScanTask(DeleteHotkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteHotkeyScanTask);
    }

    /**
     * 删除热key分析任务
     * 删除热key分析任务。
     *
     * @param DeleteHotkeyScanTaskRequest 请求对象
     * @return SyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>
     */
    public SyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskInvoker(DeleteHotkeyScanTaskRequest request) {
        return new SyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>(request, DcsMeta.deleteHotkeyScanTask, hcClient);
    }

    /**
     * 域名摘除IP
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     *
     * @param DeleteIpFromDomainNameRequest 请求对象
     * @return DeleteIpFromDomainNameResponse
     */
    public DeleteIpFromDomainNameResponse deleteIpFromDomainName(DeleteIpFromDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    /**
     * 域名摘除IP
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     *
     * @param DeleteIpFromDomainNameRequest 请求对象
     * @return SyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>
     */
    public SyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainNameInvoker(DeleteIpFromDomainNameRequest request) {
        return new SyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>(request, DcsMeta.deleteIpFromDomainName, hcClient);
    }

    /**
     * 删除数据迁移任务
     * 删除数据迁移任务。
     *
     * @param DeleteMigrationTaskRequest 请求对象
     * @return DeleteMigrationTaskResponse
     */
    public DeleteMigrationTaskResponse deleteMigrationTask(DeleteMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    /**
     * 删除数据迁移任务
     * 删除数据迁移任务。
     *
     * @param DeleteMigrationTaskRequest 请求对象
     * @return SyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>
     */
    public SyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTaskInvoker(DeleteMigrationTaskRequest request) {
        return new SyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>(request, DcsMeta.deleteMigrationTask, hcClient);
    }

    /**
     * 删除实例
     * 删除指定的缓存实例，释放该实例的所有资源。  &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。 
     *
     * @param DeleteSingleInstanceRequest 请求对象
     * @return DeleteSingleInstanceResponse
     */
    public DeleteSingleInstanceResponse deleteSingleInstance(DeleteSingleInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteSingleInstance);
    }

    /**
     * 删除实例
     * 删除指定的缓存实例，释放该实例的所有资源。  &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。 
     *
     * @param DeleteSingleInstanceRequest 请求对象
     * @return SyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>
     */
    public SyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstanceInvoker(DeleteSingleInstanceRequest request) {
        return new SyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>(request, DcsMeta.deleteSingleInstance, hcClient);
    }

    /**
     * 查询可用区信息
     * 查询所在局点的可用区信息
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     * 查询所在局点的可用区信息
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(ListAvailableZonesRequest request) {
        return new SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>(request, DcsMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询后台任务列表
     * 查询后台任务列表
     *
     * @param ListBackgroundTaskRequest 请求对象
     * @return ListBackgroundTaskResponse
     */
    public ListBackgroundTaskResponse listBackgroundTask(ListBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackgroundTask);
    }

    /**
     * 查询后台任务列表
     * 查询后台任务列表
     *
     * @param ListBackgroundTaskRequest 请求对象
     * @return SyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>
     */
    public SyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTaskInvoker(ListBackgroundTaskRequest request) {
        return new SyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>(request, DcsMeta.listBackgroundTask, hcClient);
    }

    /**
     * 获取备份文件下载链接
     * 获取指定实例的备份文件下载链接，下载备份文件。
     *
     * @param ListBackupFileLinksRequest 请求对象
     * @return ListBackupFileLinksResponse
     */
    public ListBackupFileLinksResponse listBackupFileLinks(ListBackupFileLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    /**
     * 获取备份文件下载链接
     * 获取指定实例的备份文件下载链接，下载备份文件。
     *
     * @param ListBackupFileLinksRequest 请求对象
     * @return SyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>
     */
    public SyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinksInvoker(ListBackupFileLinksRequest request) {
        return new SyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>(request, DcsMeta.listBackupFileLinks, hcClient);
    }

    /**
     * 查询实例备份信息
     * 查询指定缓存实例的备份信息列表。
     *
     * @param ListBackupRecordsRequest 请求对象
     * @return ListBackupRecordsResponse
     */
    public ListBackupRecordsResponse listBackupRecords(ListBackupRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    /**
     * 查询实例备份信息
     * 查询指定缓存实例的备份信息列表。
     *
     * @param ListBackupRecordsRequest 请求对象
     * @return SyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>
     */
    public SyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecordsInvoker(ListBackupRecordsRequest request) {
        return new SyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>(request, DcsMeta.listBackupRecords, hcClient);
    }

    /**
     * 查询大key分析任务列表
     * 查询大key分析任务列表。
     *
     * @param ListBigkeyScanTasksRequest 请求对象
     * @return ListBigkeyScanTasksResponse
     */
    public ListBigkeyScanTasksResponse listBigkeyScanTasks(ListBigkeyScanTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBigkeyScanTasks);
    }

    /**
     * 查询大key分析任务列表
     * 查询大key分析任务列表。
     *
     * @param ListBigkeyScanTasksRequest 请求对象
     * @return SyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>
     */
    public SyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasksInvoker(ListBigkeyScanTasksRequest request) {
        return new SyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>(request, DcsMeta.listBigkeyScanTasks, hcClient);
    }

    /**
     * 查询实例配置参数
     * 查询指定实例的配置参数信息。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    /**
     * 查询实例配置参数
     * 查询指定实例的配置参数信息。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request, DcsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询产品规格
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listFlavors);
    }

    /**
     * 查询产品规格
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, DcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询分片信息
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     *
     * @param ListGroupReplicationInfoRequest 请求对象
     * @return ListGroupReplicationInfoResponse
     */
    public ListGroupReplicationInfoResponse listGroupReplicationInfo(ListGroupReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    /**
     * 查询分片信息
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     *
     * @param ListGroupReplicationInfoRequest 请求对象
     * @return SyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>
     */
    public SyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfoInvoker(ListGroupReplicationInfoRequest request) {
        return new SyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>(request, DcsMeta.listGroupReplicationInfo, hcClient);
    }

    /**
     * 查询热key分析任务列表
     * 查询热key分析历史记录。
     *
     * @param ListHotKeyScanTasksRequest 请求对象
     * @return ListHotKeyScanTasksResponse
     */
    public ListHotKeyScanTasksResponse listHotKeyScanTasks(ListHotKeyScanTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listHotKeyScanTasks);
    }

    /**
     * 查询热key分析任务列表
     * 查询热key分析历史记录。
     *
     * @param ListHotKeyScanTasksRequest 请求对象
     * @return SyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>
     */
    public SyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasksInvoker(ListHotKeyScanTasksRequest request) {
        return new SyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>(request, DcsMeta.listHotKeyScanTasks, hcClient);
    }

    /**
     * 查询所有实例列表
     * 查询租户的缓存实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     * 查询租户的缓存实例列表，支持按照条件查询。
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, DcsMeta.listInstances, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ListMaintenanceWindowsRequest 请求对象
     * @return ListMaintenanceWindowsResponse
     */
    public ListMaintenanceWindowsResponse listMaintenanceWindows(ListMaintenanceWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ListMaintenanceWindowsRequest 请求对象
     * @return SyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
     */
    public SyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindowsInvoker(ListMaintenanceWindowsRequest request) {
        return new SyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>(request, DcsMeta.listMaintenanceWindows, hcClient);
    }

    /**
     * 查询迁移任务列表
     * 查询迁移任务列表。
     *
     * @param ListMigrationTaskRequest 请求对象
     * @return ListMigrationTaskResponse
     */
    public ListMigrationTaskResponse listMigrationTask(ListMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    /**
     * 查询迁移任务列表
     * 查询迁移任务列表。
     *
     * @param ListMigrationTaskRequest 请求对象
     * @return SyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>
     */
    public SyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTaskInvoker(ListMigrationTaskRequest request) {
        return new SyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>(request, DcsMeta.listMigrationTask, hcClient);
    }

    /**
     * 查询主维度信息列表
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。 &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListMonitoredObjectsRequest 请求对象
     * @return ListMonitoredObjectsResponse
     */
    public ListMonitoredObjectsResponse listMonitoredObjects(ListMonitoredObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjects);
    }

    /**
     * 查询主维度信息列表
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。 &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListMonitoredObjectsRequest 请求对象
     * @return SyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>
     */
    public SyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjectsInvoker(ListMonitoredObjectsRequest request) {
        return new SyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>(request, DcsMeta.listMonitoredObjects, hcClient);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return ListMonitoredObjectsOfInstanceResponse
     */
    public ListMonitoredObjectsOfInstanceResponse listMonitoredObjectsOfInstance(ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return SyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>
     */
    public SyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceInvoker(ListMonitoredObjectsOfInstanceRequest request) {
        return new SyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>(request, DcsMeta.listMonitoredObjectsOfInstance, hcClient);
    }

    /**
     * 查询实例状态
     * 查询该租户在当前区域下不同状态的实例数。
     *
     * @param ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return ListNumberOfInstancesInDifferentStatusResponse
     */
    public ListNumberOfInstancesInDifferentStatusResponse listNumberOfInstancesInDifferentStatus(ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    /**
     * 查询实例状态
     * 查询该租户在当前区域下不同状态的实例数。
     *
     * @param ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return SyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>
     */
    public SyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusInvoker(ListNumberOfInstancesInDifferentStatusRequest request) {
        return new SyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>(request, DcsMeta.listNumberOfInstancesInDifferentStatus, hcClient);
    }

    /**
     * 查询实例恢复记录
     * 查询指定缓存实例的恢复记录列表。
     *
     * @param ListRestoreRecordsRequest 请求对象
     * @return ListRestoreRecordsResponse
     */
    public ListRestoreRecordsResponse listRestoreRecords(ListRestoreRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    /**
     * 查询实例恢复记录
     * 查询指定缓存实例的恢复记录列表。
     *
     * @param ListRestoreRecordsRequest 请求对象
     * @return SyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>
     */
    public SyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecordsInvoker(ListRestoreRecordsRequest request) {
        return new SyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>(request, DcsMeta.listRestoreRecords, hcClient);
    }

    /**
     * 查询慢日志
     * 查询慢日志。
     *
     * @param ListSlowlogRequest 请求对象
     * @return ListSlowlogResponse
     */
    public ListSlowlogResponse listSlowlog(ListSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listSlowlog);
    }

    /**
     * 查询慢日志
     * 查询慢日志。
     *
     * @param ListSlowlogRequest 请求对象
     * @return SyncInvoker<ListSlowlogRequest, ListSlowlogResponse>
     */
    public SyncInvoker<ListSlowlogRequest, ListSlowlogResponse> listSlowlogInvoker(ListSlowlogRequest request) {
        return new SyncInvoker<ListSlowlogRequest, ListSlowlogResponse>(request, DcsMeta.listSlowlog, hcClient);
    }

    /**
     * 查询运行中实例的统计信息
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     *
     * @param ListStatisticsOfRunningInstancesRequest 请求对象
     * @return ListStatisticsOfRunningInstancesResponse
     */
    public ListStatisticsOfRunningInstancesResponse listStatisticsOfRunningInstances(ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    /**
     * 查询运行中实例的统计信息
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     *
     * @param ListStatisticsOfRunningInstancesRequest 请求对象
     * @return SyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>
     */
    public SyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesInvoker(ListStatisticsOfRunningInstancesRequest request) {
        return new SyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>(request, DcsMeta.listStatisticsOfRunningInstances, hcClient);
    }

    /**
     * 查询租户所有标签
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     *
     * @param ListTagsOfTenantRequest 请求对象
     * @return ListTagsOfTenantResponse
     */
    public ListTagsOfTenantResponse listTagsOfTenant(ListTagsOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listTagsOfTenant);
    }

    /**
     * 查询租户所有标签
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     *
     * @param ListTagsOfTenantRequest 请求对象
     * @return SyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>
     */
    public SyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenantInvoker(ListTagsOfTenantRequest request) {
        return new SyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>(request, DcsMeta.listTagsOfTenant, hcClient);
    }

    /**
     * 重启实例或清空数据
     * 重启运行中的DCS缓存实例。  清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。 
     *
     * @param RestartOrFlushInstancesRequest 请求对象
     * @return RestartOrFlushInstancesResponse
     */
    public RestartOrFlushInstancesResponse restartOrFlushInstances(RestartOrFlushInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restartOrFlushInstances);
    }

    /**
     * 重启实例或清空数据
     * 重启运行中的DCS缓存实例。  清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。 
     *
     * @param RestartOrFlushInstancesRequest 请求对象
     * @return SyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>
     */
    public SyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstancesInvoker(RestartOrFlushInstancesRequest request) {
        return new SyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>(request, DcsMeta.restartOrFlushInstances, hcClient);
    }

    /**
     * 恢复指定实例
     * 恢复指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    /**
     * 恢复指定实例
     * 恢复指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(RestoreInstanceRequest request) {
        return new SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>(request, DcsMeta.restoreInstance, hcClient);
    }

    /**
     * 查询大key自动分析配置
     * 查询大key自动分析配置。
     *
     * @param ShowBigkeyAutoscanConfigRequest 请求对象
     * @return ShowBigkeyAutoscanConfigResponse
     */
    public ShowBigkeyAutoscanConfigResponse showBigkeyAutoscanConfig(ShowBigkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showBigkeyAutoscanConfig);
    }

    /**
     * 查询大key自动分析配置
     * 查询大key自动分析配置。
     *
     * @param ShowBigkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>
     */
    public SyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigInvoker(ShowBigkeyAutoscanConfigRequest request) {
        return new SyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>(request, DcsMeta.showBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询大key分析详情
     * 查询大key分析详情。
     *
     * @param ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return ShowBigkeyScanTaskDetailsResponse
     */
    public ShowBigkeyScanTaskDetailsResponse showBigkeyScanTaskDetails(ShowBigkeyScanTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showBigkeyScanTaskDetails);
    }

    /**
     * 查询大key分析详情
     * 查询大key分析详情。
     *
     * @param ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>
     */
    public SyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsInvoker(ShowBigkeyScanTaskDetailsRequest request) {
        return new SyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>(request, DcsMeta.showBigkeyScanTaskDetails, hcClient);
    }

    /**
     * 查询热key自动分析配置
     * 查询热key自动分析配置。
     *
     * @param ShowHotkeyAutoscanConfigRequest 请求对象
     * @return ShowHotkeyAutoscanConfigResponse
     */
    public ShowHotkeyAutoscanConfigResponse showHotkeyAutoscanConfig(ShowHotkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showHotkeyAutoscanConfig);
    }

    /**
     * 查询热key自动分析配置
     * 查询热key自动分析配置。
     *
     * @param ShowHotkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>
     */
    public SyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigInvoker(ShowHotkeyAutoscanConfigRequest request) {
        return new SyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>(request, DcsMeta.showHotkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询热key分析详情
     * 查询热key分析详情。
     *
     * @param ShowHotkeyTaskDetailsRequest 请求对象
     * @return ShowHotkeyTaskDetailsResponse
     */
    public ShowHotkeyTaskDetailsResponse showHotkeyTaskDetails(ShowHotkeyTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showHotkeyTaskDetails);
    }

    /**
     * 查询热key分析详情
     * 查询热key分析详情。
     *
     * @param ShowHotkeyTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>
     */
    public SyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsInvoker(ShowHotkeyTaskDetailsRequest request) {
        return new SyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>(request, DcsMeta.showHotkeyTaskDetails, hcClient);
    }

    /**
     * 查询指定实例
     * 通过实例ID查询实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showInstance);
    }

    /**
     * 查询指定实例
     * 通过实例ID查询实例的详细信息。
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, DcsMeta.showInstance, hcClient);
    }

    /**
     * 查询迁移任务详情
     * 查询迁移任务详情。
     *
     * @param ShowMigrationTaskRequest 请求对象
     * @return ShowMigrationTaskResponse
     */
    public ShowMigrationTaskResponse showMigrationTask(ShowMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    /**
     * 查询迁移任务详情
     * 查询迁移任务详情。
     *
     * @param ShowMigrationTaskRequest 请求对象
     * @return SyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>
     */
    public SyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTaskInvoker(ShowMigrationTaskRequest request) {
        return new SyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>(request, DcsMeta.showMigrationTask, hcClient);
    }

    /**
     * 查询在线迁移进度明细
     * 查询在线迁移进度明细。
     *
     * @param ShowMigrationTaskStatsRequest 请求对象
     * @return ShowMigrationTaskStatsResponse
     */
    public ShowMigrationTaskStatsResponse showMigrationTaskStats(ShowMigrationTaskStatsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTaskStats);
    }

    /**
     * 查询在线迁移进度明细
     * 查询在线迁移进度明细。
     *
     * @param ShowMigrationTaskStatsRequest 请求对象
     * @return SyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>
     */
    public SyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStatsInvoker(ShowMigrationTaskStatsRequest request) {
        return new SyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>(request, DcsMeta.showMigrationTaskStats, hcClient);
    }

    /**
     * 查询租户配额
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     *
     * @param ShowQuotaOfTenantRequest 请求对象
     * @return ShowQuotaOfTenantResponse
     */
    public ShowQuotaOfTenantResponse showQuotaOfTenant(ShowQuotaOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    /**
     * 查询租户配额
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     *
     * @param ShowQuotaOfTenantRequest 请求对象
     * @return SyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>
     */
    public SyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenantInvoker(ShowQuotaOfTenantRequest request) {
        return new SyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>(request, DcsMeta.showQuotaOfTenant, hcClient);
    }

    /**
     * 查询单个实例标签
     * 通过实例ID查询标签。
     *
     * @param ShowTagsRequest 请求对象
     * @return ShowTagsResponse
     */
    public ShowTagsResponse showTags(ShowTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showTags);
    }

    /**
     * 查询单个实例标签
     * 通过实例ID查询标签。
     *
     * @param ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<ShowTagsRequest, ShowTagsResponse>(request, DcsMeta.showTags, hcClient);
    }

    /**
     * 停止数据迁移任务
     * 停止数据迁移任务。
     *
     * @param StopMigrationTaskRequest 请求对象
     * @return StopMigrationTaskResponse
     */
    public StopMigrationTaskResponse stopMigrationTask(StopMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    /**
     * 停止数据迁移任务
     * 停止数据迁移任务。
     *
     * @param StopMigrationTaskRequest 请求对象
     * @return SyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>
     */
    public SyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTaskInvoker(StopMigrationTaskRequest request) {
        return new SyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>(request, DcsMeta.stopMigrationTask, hcClient);
    }

    /**
     * 设置大key自动分析配置
     * 设置大key自动分析配置。
     *
     * @param UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return UpdateBigkeyAutoscanConfigResponse
     */
    public UpdateBigkeyAutoscanConfigResponse updateBigkeyAutoscanConfig(UpdateBigkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateBigkeyAutoscanConfig);
    }

    /**
     * 设置大key自动分析配置
     * 设置大key自动分析配置。
     *
     * @param UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>
     */
    public SyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigInvoker(UpdateBigkeyAutoscanConfigRequest request) {
        return new SyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>(request, DcsMeta.updateBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 修改实例配置参数
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     *
     * @param UpdateConfigurationsRequest 请求对象
     * @return UpdateConfigurationsResponse
     */
    public UpdateConfigurationsResponse updateConfigurations(UpdateConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    /**
     * 修改实例配置参数
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     *
     * @param UpdateConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>
     */
    public SyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurationsInvoker(UpdateConfigurationsRequest request) {
        return new SyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>(request, DcsMeta.updateConfigurations, hcClient);
    }

    /**
     * 设置热key自动分析配置
     * 设置热key自动分析配置。
     *
     * @param UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return UpdateHotkeyAutoScanConfigResponse
     */
    public UpdateHotkeyAutoScanConfigResponse updateHotkeyAutoScanConfig(UpdateHotkeyAutoScanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateHotkeyAutoScanConfig);
    }

    /**
     * 设置热key自动分析配置
     * 设置热key自动分析配置。
     *
     * @param UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return SyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>
     */
    public SyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigInvoker(UpdateHotkeyAutoScanConfigRequest request) {
        return new SyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>(request, DcsMeta.updateHotkeyAutoScanConfig, hcClient);
    }

    /**
     * 修改实例信息
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateInstance);
    }

    /**
     * 修改实例信息
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, DcsMeta.updateInstance, hcClient);
    }

    /**
     * 修改密码
     * 修改缓存实例的密码。
     *
     * @param UpdatePasswordRequest 请求对象
     * @return UpdatePasswordResponse
     */
    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updatePassword);
    }

    /**
     * 修改密码
     * 修改缓存实例的密码。
     *
     * @param UpdatePasswordRequest 请求对象
     * @return SyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>
     */
    public SyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse> updatePasswordInvoker(UpdatePasswordRequest request) {
        return new SyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>(request, DcsMeta.updatePassword, hcClient);
    }

    /**
     * 设置备节点优先级
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     *
     * @param UpdateSlavePriorityRequest 请求对象
     * @return UpdateSlavePriorityResponse
     */
    public UpdateSlavePriorityResponse updateSlavePriority(UpdateSlavePriorityRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    /**
     * 设置备节点优先级
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     *
     * @param UpdateSlavePriorityRequest 请求对象
     * @return SyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>
     */
    public SyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriorityInvoker(UpdateSlavePriorityRequest request) {
        return new SyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>(request, DcsMeta.updateSlavePriority, hcClient);
    }

    /**
     * 查询指定实例的IP白名单
     * 查询指定实例的IP白名单。
     *
     * @param ShowIpWhitelistRequest 请求对象
     * @return ShowIpWhitelistResponse
     */
    public ShowIpWhitelistResponse showIpWhitelist(ShowIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    /**
     * 查询指定实例的IP白名单
     * 查询指定实例的IP白名单。
     *
     * @param ShowIpWhitelistRequest 请求对象
     * @return SyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>
     */
    public SyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelistInvoker(ShowIpWhitelistRequest request) {
        return new SyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>(request, DcsMeta.showIpWhitelist, hcClient);
    }

    /**
     * 设置IP白名单分组
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     *
     * @param UpdateIpWhitelistRequest 请求对象
     * @return UpdateIpWhitelistResponse
     */
    public UpdateIpWhitelistResponse updateIpWhitelist(UpdateIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

    /**
     * 设置IP白名单分组
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     *
     * @param UpdateIpWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>
     */
    public SyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelistInvoker(UpdateIpWhitelistRequest request) {
        return new SyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>(request, DcsMeta.updateIpWhitelist, hcClient);
    }

}