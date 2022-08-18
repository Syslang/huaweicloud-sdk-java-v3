package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateNet2CloudPhoneServerRequestBodyPorts
 */
public class CreateNet2CloudPhoneServerRequestBodyPorts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listen_port")

    private Integer listenPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_accessible")

    private String internetAccessible;

    public CreateNet2CloudPhoneServerRequestBodyPorts withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用端口名称，不超过16个字节，系统关键服务名称不能使用\"adb\"和\"vnc\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNet2CloudPhoneServerRequestBodyPorts withListenPort(Integer listenPort) {
        this.listenPort = listenPort;
        return this;
    }

    /**
     * 端口号，大于等于10000，小于等于50000
     * @return listenPort
     */
    public Integer getListenPort() {
        return listenPort;
    }

    public void setListenPort(Integer listenPort) {
        this.listenPort = listenPort;
    }

    public CreateNet2CloudPhoneServerRequestBodyPorts withInternetAccessible(String internetAccessible) {
        this.internetAccessible = internetAccessible;
        return this;
    }

    /**
     * 为\"true\"则映射出公网访问（忽略大小写）。 为其他则不映射
     * @return internetAccessible
     */
    public String getInternetAccessible() {
        return internetAccessible;
    }

    public void setInternetAccessible(String internetAccessible) {
        this.internetAccessible = internetAccessible;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBodyPorts createNet2CloudPhoneServerRequestBodyPorts =
            (CreateNet2CloudPhoneServerRequestBodyPorts) o;
        return Objects.equals(this.name, createNet2CloudPhoneServerRequestBodyPorts.name)
            && Objects.equals(this.listenPort, createNet2CloudPhoneServerRequestBodyPorts.listenPort)
            && Objects.equals(this.internetAccessible, createNet2CloudPhoneServerRequestBodyPorts.internetAccessible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listenPort, internetAccessible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBodyPorts {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    listenPort: ").append(toIndentedString(listenPort)).append("\n");
        sb.append("    internetAccessible: ").append(toIndentedString(internetAccessible)).append("\n");
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
