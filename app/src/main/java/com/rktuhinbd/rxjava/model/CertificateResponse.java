package com.rktuhinbd.rxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CertificateResponse {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private CertificateData data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CertificateData getData() {
        return data;
    }

    public void setData(CertificateData data) {
        this.data = data;
    }

}