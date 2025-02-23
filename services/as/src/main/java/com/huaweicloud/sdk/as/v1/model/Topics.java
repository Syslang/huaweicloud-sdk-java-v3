package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Topics
 */
public class Topics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_scene")

    private List<String> topicScene = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    public Topics withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * SMN服务中Topic的唯一的资源标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public Topics withTopicScene(List<String> topicScene) {
        this.topicScene = topicScene;
        return this;
    }

    public Topics addTopicSceneItem(String topicSceneItem) {
        if (this.topicScene == null) {
            this.topicScene = new ArrayList<>();
        }
        this.topicScene.add(topicSceneItem);
        return this;
    }

    public Topics withTopicScene(Consumer<List<String>> topicSceneSetter) {
        if (this.topicScene == null) {
            this.topicScene = new ArrayList<>();
        }
        topicSceneSetter.accept(this.topicScene);
        return this;
    }

    /**
     * 通知场景，有以下五种类型。SCALING_UP：扩容成功。SCALING_UP_FAIL：扩容失败。SCALING_DOWN：减容成功。SCALING_DOWN_FAIL：减容失败。SCALING_GROUP_ABNORMAL：伸缩组发生异常
     * @return topicScene
     */
    public List<String> getTopicScene() {
        return topicScene;
    }

    public void setTopicScene(List<String> topicScene) {
        this.topicScene = topicScene;
    }

    public Topics withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * SMN服务中Topic的资源名称。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Topics topics = (Topics) o;
        return Objects.equals(this.topicUrn, topics.topicUrn) && Objects.equals(this.topicScene, topics.topicScene)
            && Objects.equals(this.topicName, topics.topicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, topicScene, topicName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Topics {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    topicScene: ").append(toIndentedString(topicScene)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
