package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReqDataByIdCardImage
 */
public class ReqDataByIdCardImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image1")

    private String idcardImage1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_image2")

    private String idcardImage2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_image")

    private String faceImage;

    public ReqDataByIdCardImage withIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
        return this;
    }

    /**
     * 身份证人像面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage1
     */
    public String getIdcardImage1() {
        return idcardImage1;
    }

    public void setIdcardImage1(String idcardImage1) {
        this.idcardImage1 = idcardImage1;
    }

    public ReqDataByIdCardImage withIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
        return this;
    }

    /**
     * 身份证国徽面图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return idcardImage2
     */
    public String getIdcardImage2() {
        return idcardImage2;
    }

    public void setIdcardImage2(String idcardImage2) {
        this.idcardImage2 = idcardImage2;
    }

    public ReqDataByIdCardImage withFaceImage(String faceImage) {
        this.faceImage = faceImage;
        return this;
    }

    /**
     * 现场人像图像数据，使用base64编码，要求base64编码后大小不超过4M。图像各边的像素大小在300到4000之间，支持JPG格式。
     * @return faceImage
     */
    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReqDataByIdCardImage reqDataByIdCardImage = (ReqDataByIdCardImage) o;
        return Objects.equals(this.idcardImage1, reqDataByIdCardImage.idcardImage1)
            && Objects.equals(this.idcardImage2, reqDataByIdCardImage.idcardImage2)
            && Objects.equals(this.faceImage, reqDataByIdCardImage.faceImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcardImage1, idcardImage2, faceImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqDataByIdCardImage {\n");
        sb.append("    idcardImage1: ").append(toIndentedString(idcardImage1)).append("\n");
        sb.append("    idcardImage2: ").append(toIndentedString(idcardImage2)).append("\n");
        sb.append("    faceImage: ").append(toIndentedString(faceImage)).append("\n");
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
