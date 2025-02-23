package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoSplitTaskRequestBody
 */
public class CreateVideoSplitTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private VideoSplitTaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private TaskCallback callback;

    public CreateVideoSplitTaskRequestBody withInput(VideoSplitTaskInput input) {
        this.input = input;
        return this;
    }

    public CreateVideoSplitTaskRequestBody withInput(Consumer<VideoSplitTaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new VideoSplitTaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public VideoSplitTaskInput getInput() {
        return input;
    }

    public void setInput(VideoSplitTaskInput input) {
        this.input = input;
    }

    public CreateVideoSplitTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateVideoSplitTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public CreateVideoSplitTaskRequestBody withCallback(TaskCallback callback) {
        this.callback = callback;
        return this;
    }

    public CreateVideoSplitTaskRequestBody withCallback(Consumer<TaskCallback> callbackSetter) {
        if (this.callback == null) {
            this.callback = new TaskCallback();
            callbackSetter.accept(this.callback);
        }

        return this;
    }

    /**
     * Get callback
     * @return callback
     */
    public TaskCallback getCallback() {
        return callback;
    }

    public void setCallback(TaskCallback callback) {
        this.callback = callback;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVideoSplitTaskRequestBody createVideoSplitTaskRequestBody = (CreateVideoSplitTaskRequestBody) o;
        return Objects.equals(this.input, createVideoSplitTaskRequestBody.input)
            && Objects.equals(this.output, createVideoSplitTaskRequestBody.output)
            && Objects.equals(this.callback, createVideoSplitTaskRequestBody.callback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, callback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoSplitTaskRequestBody {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
