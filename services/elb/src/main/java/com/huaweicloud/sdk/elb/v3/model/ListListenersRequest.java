package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListListenersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private List<String> protocolPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private List<String> protocol = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tls_container_ref")

    private List<String> defaultTlsContainerRef = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_tls_container_ref")

    private List<String> clientCaTlsContainerRef = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_limit")

    private List<Integer> connectionLimit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_pool_id")

    private List<String> defaultPoolId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private List<String> loadbalancerId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_ciphers_policy")

    private List<String> tlsCiphersPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_address")

    private List<String> memberAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_device_id")

    private List<String> memberDeviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_member_retry")

    private Boolean enableMemberRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_timeout")

    private List<Integer> memberTimeout = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_timeout")

    private List<Integer> clientTimeout = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepalive_timeout")

    private List<Integer> keepaliveTimeout = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_client_ip_enable")

    private Boolean transparentClientIpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enhance_l7policy_enable")

    private Boolean enhanceL7policyEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_instance_id")

    private List<String> memberInstanceId = null;

    public ListListenersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListListenersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的ID。  使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListListenersRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * 是否反向查询。  取值： - true：查询上一页。 - false：查询下一页，默认。  使用说明： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker。
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListListenersRequest withProtocolPort(List<String> protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    public ListListenersRequest addProtocolPortItem(String protocolPortItem) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        this.protocolPort.add(protocolPortItem);
        return this;
    }

    public ListListenersRequest withProtocolPort(Consumer<List<String>> protocolPortSetter) {
        if (this.protocolPort == null) {
            this.protocolPort = new ArrayList<>();
        }
        protocolPortSetter.accept(this.protocolPort);
        return this;
    }

    /**
     * 监听器的前端监听端口。  支持多值查询，查询条件格式：*protocol_port=xxx&protocol_port=xxx*。
     * @return protocolPort
     */
    public List<String> getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(List<String> protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListListenersRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    public ListListenersRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListListenersRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * 监听器的监听协议。  [取值：TCP、UDP、HTTP、HTTPS、TERMINATED_HTTPS、QUIC。  说明：TERMINATED_HTTPS为共享型LB上的监听器独有的协议。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt)  [取值：TCP、UDP、HTTP、HTTPS。](tag:hws_eu,hcso_dt)  支持多值查询，查询条件格式：*protocol=xxx&protocol=xxx*。  [荷兰region不支持QUIC。](tag:dt)
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public ListListenersRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListListenersRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListListenersRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 监听器的描述信息。  支持多值查询，查询条件格式：*description=xxx&description=xxx*。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListListenersRequest withDefaultTlsContainerRef(List<String> defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    public ListListenersRequest addDefaultTlsContainerRefItem(String defaultTlsContainerRefItem) {
        if (this.defaultTlsContainerRef == null) {
            this.defaultTlsContainerRef = new ArrayList<>();
        }
        this.defaultTlsContainerRef.add(defaultTlsContainerRefItem);
        return this;
    }

    public ListListenersRequest withDefaultTlsContainerRef(Consumer<List<String>> defaultTlsContainerRefSetter) {
        if (this.defaultTlsContainerRef == null) {
            this.defaultTlsContainerRef = new ArrayList<>();
        }
        defaultTlsContainerRefSetter.accept(this.defaultTlsContainerRef);
        return this;
    }

    /**
     * 监听器的服务器证书ID。  支持多值查询，查询条件格式： *default_tls_container_ref=xxx&default_tls_container_ref=xxx*。
     * @return defaultTlsContainerRef
     */
    public List<String> getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(List<String> defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    public ListListenersRequest withClientCaTlsContainerRef(List<String> clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
        return this;
    }

    public ListListenersRequest addClientCaTlsContainerRefItem(String clientCaTlsContainerRefItem) {
        if (this.clientCaTlsContainerRef == null) {
            this.clientCaTlsContainerRef = new ArrayList<>();
        }
        this.clientCaTlsContainerRef.add(clientCaTlsContainerRefItem);
        return this;
    }

    public ListListenersRequest withClientCaTlsContainerRef(Consumer<List<String>> clientCaTlsContainerRefSetter) {
        if (this.clientCaTlsContainerRef == null) {
            this.clientCaTlsContainerRef = new ArrayList<>();
        }
        clientCaTlsContainerRefSetter.accept(this.clientCaTlsContainerRef);
        return this;
    }

    /**
     * 监听器的CA证书ID。  支持多值查询，查询条件格式： *client_ca_tls_container_ref=xxx&client_ca_tls_container_ref=xxx*。
     * @return clientCaTlsContainerRef
     */
    public List<String> getClientCaTlsContainerRef() {
        return clientCaTlsContainerRef;
    }

    public void setClientCaTlsContainerRef(List<String> clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
    }

    public ListListenersRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 监听器的管理状态，只能设置为true。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListListenersRequest withConnectionLimit(List<Integer> connectionLimit) {
        this.connectionLimit = connectionLimit;
        return this;
    }

    public ListListenersRequest addConnectionLimitItem(Integer connectionLimitItem) {
        if (this.connectionLimit == null) {
            this.connectionLimit = new ArrayList<>();
        }
        this.connectionLimit.add(connectionLimitItem);
        return this;
    }

    public ListListenersRequest withConnectionLimit(Consumer<List<Integer>> connectionLimitSetter) {
        if (this.connectionLimit == null) {
            this.connectionLimit = new ArrayList<>();
        }
        connectionLimitSetter.accept(this.connectionLimit);
        return this;
    }

    /**
     * ​监听器的最大连接数。  取值：-1表示不限制连接数。  支持多值查询，查询条件格式：*connection_limit=xxx&connection_limit=xxx*。  不支持该字段，请勿使用。
     * @return connectionLimit
     */
    public List<Integer> getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(List<Integer> connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public ListListenersRequest withDefaultPoolId(List<String> defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    public ListListenersRequest addDefaultPoolIdItem(String defaultPoolIdItem) {
        if (this.defaultPoolId == null) {
            this.defaultPoolId = new ArrayList<>();
        }
        this.defaultPoolId.add(defaultPoolIdItem);
        return this;
    }

    public ListListenersRequest withDefaultPoolId(Consumer<List<String>> defaultPoolIdSetter) {
        if (this.defaultPoolId == null) {
            this.defaultPoolId = new ArrayList<>();
        }
        defaultPoolIdSetter.accept(this.defaultPoolId);
        return this;
    }

    /**
     * 监听器的默认后端云服务器组ID。当请求没有匹配的转发策略时，转发到默认后端云服务器上处理。  支持多值查询，查询条件格式：*default_pool_id=xxx&default_pool_id=xxx*。
     * @return defaultPoolId
     */
    public List<String> getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(List<String> defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public ListListenersRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListListenersRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListListenersRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 监听器ID。  支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListListenersRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListListenersRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListListenersRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 监听器名称。  支持多值查询，查询条件格式：*name=xxx&name=xxx*。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListListenersRequest withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * 客户端与LB之间的HTTPS请求的HTTP2功能的开启状态。 开启后，可提升客户端与LB间的访问性能，但LB与后端服务器间仍采用HTTP1.X协议。  使用说明： - 仅HTTPS协议监听器有效。 - QUIC监听器不能设置该字段，固定返回为true。 - 其他协议的监听器可设置该字段但无效，无论取值如何都不影响监听器正常运行。  [荷兰region不支持QUIC。](tag:dt)
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public ListListenersRequest withLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    public ListListenersRequest addLoadbalancerIdItem(String loadbalancerIdItem) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        this.loadbalancerId.add(loadbalancerIdItem);
        return this;
    }

    public ListListenersRequest withLoadbalancerId(Consumer<List<String>> loadbalancerIdSetter) {
        if (this.loadbalancerId == null) {
            this.loadbalancerId = new ArrayList<>();
        }
        loadbalancerIdSetter.accept(this.loadbalancerId);
        return this;
    }

    /**
     * 监听器所属的负载均衡器ID。  支持多值查询，查询条件格式：*loadbalancer_id=xxx&loadbalancer_id=xxx*。
     * @return loadbalancerId
     */
    public List<String> getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(List<String> loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ListListenersRequest withTlsCiphersPolicy(List<String> tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    public ListListenersRequest addTlsCiphersPolicyItem(String tlsCiphersPolicyItem) {
        if (this.tlsCiphersPolicy == null) {
            this.tlsCiphersPolicy = new ArrayList<>();
        }
        this.tlsCiphersPolicy.add(tlsCiphersPolicyItem);
        return this;
    }

    public ListListenersRequest withTlsCiphersPolicy(Consumer<List<String>> tlsCiphersPolicySetter) {
        if (this.tlsCiphersPolicy == null) {
            this.tlsCiphersPolicy = new ArrayList<>();
        }
        tlsCiphersPolicySetter.accept(this.tlsCiphersPolicy);
        return this;
    }

    /**
     * 监听器使用的安全策略。  支持多值查询，查询条件格式：*tls_ciphers_policy=xxx&tls_ciphers_policy=xxx*。
     * @return tlsCiphersPolicy
     */
    public List<String> getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(List<String> tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public ListListenersRequest withMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
        return this;
    }

    public ListListenersRequest addMemberAddressItem(String memberAddressItem) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        this.memberAddress.add(memberAddressItem);
        return this;
    }

    public ListListenersRequest withMemberAddress(Consumer<List<String>> memberAddressSetter) {
        if (this.memberAddress == null) {
            this.memberAddress = new ArrayList<>();
        }
        memberAddressSetter.accept(this.memberAddress);
        return this;
    }

    /**
     * 后端云服务器的IP地址。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_address=xxx&member_address=xxx*。
     * @return memberAddress
     */
    public List<String> getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(List<String> memberAddress) {
        this.memberAddress = memberAddress;
    }

    public ListListenersRequest withMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
        return this;
    }

    public ListListenersRequest addMemberDeviceIdItem(String memberDeviceIdItem) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        this.memberDeviceId.add(memberDeviceIdItem);
        return this;
    }

    public ListListenersRequest withMemberDeviceId(Consumer<List<String>> memberDeviceIdSetter) {
        if (this.memberDeviceId == null) {
            this.memberDeviceId = new ArrayList<>();
        }
        memberDeviceIdSetter.accept(this.memberDeviceId);
        return this;
    }

    /**
     * 后端云服务器对应的弹性云服务器的ID。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_device_id=xxx&member_device_id=xxx*。
     * @return memberDeviceId
     */
    public List<String> getMemberDeviceId() {
        return memberDeviceId;
    }

    public void setMemberDeviceId(List<String> memberDeviceId) {
        this.memberDeviceId = memberDeviceId;
    }

    public ListListenersRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListListenersRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListListenersRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。不传时查询default企业项目\"0\"下的资源，鉴权按照default企业项目鉴权； 如果传值，则传已存在的企业项目ID或all_granted_eps（表示查询所有企业项目）进行查询。  支持多值查询，查询条件格式：*enterprise_project_id=xxx&enterprise_project_id=xxx*。  [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListListenersRequest withEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
        return this;
    }

    /**
     * 是否开启后端服务器的重试。  取值：true 开启重试，false 不开启重试。
     * @return enableMemberRetry
     */
    public Boolean getEnableMemberRetry() {
        return enableMemberRetry;
    }

    public void setEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
    }

    public ListListenersRequest withMemberTimeout(List<Integer> memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    public ListListenersRequest addMemberTimeoutItem(Integer memberTimeoutItem) {
        if (this.memberTimeout == null) {
            this.memberTimeout = new ArrayList<>();
        }
        this.memberTimeout.add(memberTimeoutItem);
        return this;
    }

    public ListListenersRequest withMemberTimeout(Consumer<List<Integer>> memberTimeoutSetter) {
        if (this.memberTimeout == null) {
            this.memberTimeout = new ArrayList<>();
        }
        memberTimeoutSetter.accept(this.memberTimeout);
        return this;
    }

    /**
     * 等待后端服务器响应超时时间。请求转发后端服务器后，在等待超时member_timeout时长没有响应，负载均衡将终止等待，并返回 HTTP504错误码。  取值：1-300s。  支持多值查询，查询条件格式：*member_timeout=xxx&member_timeout=xxx*。
     * @return memberTimeout
     */
    public List<Integer> getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(List<Integer> memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    public ListListenersRequest withClientTimeout(List<Integer> clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    public ListListenersRequest addClientTimeoutItem(Integer clientTimeoutItem) {
        if (this.clientTimeout == null) {
            this.clientTimeout = new ArrayList<>();
        }
        this.clientTimeout.add(clientTimeoutItem);
        return this;
    }

    public ListListenersRequest withClientTimeout(Consumer<List<Integer>> clientTimeoutSetter) {
        if (this.clientTimeout == null) {
            this.clientTimeout = new ArrayList<>();
        }
        clientTimeoutSetter.accept(this.clientTimeout);
        return this;
    }

    /**
     * 等待客户端请求超时时间，包括两种情况： - 读取整个客户端请求头的超时时长：如果客户端未在超时时长内发送完整个请求头，则请求将被中断 - 两个连续body体的数据包到达LB的时间间隔，超出client_timeout将会断开连接。  取值：1-300s。  支持多值查询，查询条件格式：*client_timeout=xxx&client_timeout=xxx*。
     * @return clientTimeout
     */
    public List<Integer> getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(List<Integer> clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    public ListListenersRequest withKeepaliveTimeout(List<Integer> keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    public ListListenersRequest addKeepaliveTimeoutItem(Integer keepaliveTimeoutItem) {
        if (this.keepaliveTimeout == null) {
            this.keepaliveTimeout = new ArrayList<>();
        }
        this.keepaliveTimeout.add(keepaliveTimeoutItem);
        return this;
    }

    public ListListenersRequest withKeepaliveTimeout(Consumer<List<Integer>> keepaliveTimeoutSetter) {
        if (this.keepaliveTimeout == null) {
            this.keepaliveTimeout = new ArrayList<>();
        }
        keepaliveTimeoutSetter.accept(this.keepaliveTimeout);
        return this;
    }

    /**
     * 客户端连接空闲超时时间。在超过keepalive_timeout时长一直没有请求， 负载均衡会暂时中断当前连接，直到一下次请求时重新建立新的连接。  取值： - TCP监听器：10-4000s。 - HTTP/HTTPS/TERMINATED_HTTPS监听器：0-4000s。 - UDP监听器不支持此字段。  支持多值查询，查询条件格式：*keepalive_timeout=xxx&keepalive_timeout=xxx*。
     * @return keepaliveTimeout
     */
    public List<Integer> getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(List<Integer> keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    public ListListenersRequest withTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
        return this;
    }

    /**
     * 是否透传客户端IP地址。开启后客户端IP地址将透传到后端服务器。  [仅作用于共享型LB的TCP/UDP监听器。取值：true开启，false不开启。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt,hk_tm)
     * @return transparentClientIpEnable
     */
    public Boolean getTransparentClientIpEnable() {
        return transparentClientIpEnable;
    }

    public void setTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
    }

    public ListListenersRequest withEnhanceL7policyEnable(Boolean enhanceL7policyEnable) {
        this.enhanceL7policyEnable = enhanceL7policyEnable;
        return this;
    }

    /**
     * 是否开启高级转发策略功能。开启高级转发策略后，支持更灵活的转发策略和转发规则设置。  取值：true开启，false不开启。  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return enhanceL7policyEnable
     */
    public Boolean getEnhanceL7policyEnable() {
        return enhanceL7policyEnable;
    }

    public void setEnhanceL7policyEnable(Boolean enhanceL7policyEnable) {
        this.enhanceL7policyEnable = enhanceL7policyEnable;
    }

    public ListListenersRequest withMemberInstanceId(List<String> memberInstanceId) {
        this.memberInstanceId = memberInstanceId;
        return this;
    }

    public ListListenersRequest addMemberInstanceIdItem(String memberInstanceIdItem) {
        if (this.memberInstanceId == null) {
            this.memberInstanceId = new ArrayList<>();
        }
        this.memberInstanceId.add(memberInstanceIdItem);
        return this;
    }

    public ListListenersRequest withMemberInstanceId(Consumer<List<String>> memberInstanceIdSetter) {
        if (this.memberInstanceId == null) {
            this.memberInstanceId = new ArrayList<>();
        }
        memberInstanceIdSetter.accept(this.memberInstanceId);
        return this;
    }

    /**
     * 后端云服务器ID。仅用于查询条件，不作为响应参数字段。  支持多值查询，查询条件格式：*member_instance_id=xxx&member_instance_id=xxx*。
     * @return memberInstanceId
     */
    public List<String> getMemberInstanceId() {
        return memberInstanceId;
    }

    public void setMemberInstanceId(List<String> memberInstanceId) {
        this.memberInstanceId = memberInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListListenersRequest listListenersRequest = (ListListenersRequest) o;
        return Objects.equals(this.limit, listListenersRequest.limit)
            && Objects.equals(this.marker, listListenersRequest.marker)
            && Objects.equals(this.pageReverse, listListenersRequest.pageReverse)
            && Objects.equals(this.protocolPort, listListenersRequest.protocolPort)
            && Objects.equals(this.protocol, listListenersRequest.protocol)
            && Objects.equals(this.description, listListenersRequest.description)
            && Objects.equals(this.defaultTlsContainerRef, listListenersRequest.defaultTlsContainerRef)
            && Objects.equals(this.clientCaTlsContainerRef, listListenersRequest.clientCaTlsContainerRef)
            && Objects.equals(this.adminStateUp, listListenersRequest.adminStateUp)
            && Objects.equals(this.connectionLimit, listListenersRequest.connectionLimit)
            && Objects.equals(this.defaultPoolId, listListenersRequest.defaultPoolId)
            && Objects.equals(this.id, listListenersRequest.id) && Objects.equals(this.name, listListenersRequest.name)
            && Objects.equals(this.http2Enable, listListenersRequest.http2Enable)
            && Objects.equals(this.loadbalancerId, listListenersRequest.loadbalancerId)
            && Objects.equals(this.tlsCiphersPolicy, listListenersRequest.tlsCiphersPolicy)
            && Objects.equals(this.memberAddress, listListenersRequest.memberAddress)
            && Objects.equals(this.memberDeviceId, listListenersRequest.memberDeviceId)
            && Objects.equals(this.enterpriseProjectId, listListenersRequest.enterpriseProjectId)
            && Objects.equals(this.enableMemberRetry, listListenersRequest.enableMemberRetry)
            && Objects.equals(this.memberTimeout, listListenersRequest.memberTimeout)
            && Objects.equals(this.clientTimeout, listListenersRequest.clientTimeout)
            && Objects.equals(this.keepaliveTimeout, listListenersRequest.keepaliveTimeout)
            && Objects.equals(this.transparentClientIpEnable, listListenersRequest.transparentClientIpEnable)
            && Objects.equals(this.enhanceL7policyEnable, listListenersRequest.enhanceL7policyEnable)
            && Objects.equals(this.memberInstanceId, listListenersRequest.memberInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            pageReverse,
            protocolPort,
            protocol,
            description,
            defaultTlsContainerRef,
            clientCaTlsContainerRef,
            adminStateUp,
            connectionLimit,
            defaultPoolId,
            id,
            name,
            http2Enable,
            loadbalancerId,
            tlsCiphersPolicy,
            memberAddress,
            memberDeviceId,
            enterpriseProjectId,
            enableMemberRetry,
            memberTimeout,
            clientTimeout,
            keepaliveTimeout,
            transparentClientIpEnable,
            enhanceL7policyEnable,
            memberInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    connectionLimit: ").append(toIndentedString(connectionLimit)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    memberAddress: ").append(toIndentedString(memberAddress)).append("\n");
        sb.append("    memberDeviceId: ").append(toIndentedString(memberDeviceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enableMemberRetry: ").append(toIndentedString(enableMemberRetry)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    transparentClientIpEnable: ").append(toIndentedString(transparentClientIpEnable)).append("\n");
        sb.append("    enhanceL7policyEnable: ").append(toIndentedString(enhanceL7policyEnable)).append("\n");
        sb.append("    memberInstanceId: ").append(toIndentedString(memberInstanceId)).append("\n");
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
