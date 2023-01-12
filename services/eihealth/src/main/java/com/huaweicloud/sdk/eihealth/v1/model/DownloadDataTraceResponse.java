package com.huaweicloud.sdk.eihealth.v1.model;

import com.huaweicloud.sdk.core.SdkStreamResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DownloadDataTraceResponse extends SdkStreamResponse {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadDataTraceResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}
