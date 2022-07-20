package com.rktuhinbd.rxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CertificateData {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name_en")
    @Expose
    private String nameEn;
    @SerializedName("name_bn")
    @Expose
    private String nameBn;
    @SerializedName("short_id")
    @Expose
    private String shortId;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("fields")
    @Expose
    private List<CertificateField> endCourseCertificateFields = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameBn() {
        return nameBn;
    }

    public void setNameBn(String nameBn) {
        this.nameBn = nameBn;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CertificateField> getFields() {
        return endCourseCertificateFields;
    }

    public void setFields(List<CertificateField> endCourseCertificateFields) {
        this.endCourseCertificateFields = endCourseCertificateFields;
    }

}