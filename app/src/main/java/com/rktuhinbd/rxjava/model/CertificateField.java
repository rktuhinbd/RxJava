package com.rktuhinbd.rxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CertificateField {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name_en")
    @Expose
    private String nameEn;
    @SerializedName("name_bn")
    @Expose
    private String nameBn;
    @SerializedName("order_idx")
    @Expose
    private Integer orderIdx;
    @SerializedName("required")
    @Expose
    private Boolean required;
    @SerializedName("placeholder")
    @Expose
    private String placeholder;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("field_type")
    @Expose
    private String fieldType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("options")
    @Expose
    private List<CertificateOption> certificateOptions = null;
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    @SerializedName("conditions")
    @Expose
    private List<CertificateCondition> conditions = null;
    @SerializedName("meta")
    @Expose
    private Object meta;

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

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CertificateOption> getOptions() {
        return certificateOptions;
    }

    public void setOptions(List<CertificateOption> certificateOptions) {
        this.certificateOptions = certificateOptions;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public List<CertificateCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<CertificateCondition> certificateConditions) {
        this.conditions = certificateConditions;
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

}