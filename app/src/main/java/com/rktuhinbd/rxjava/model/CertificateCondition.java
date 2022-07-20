package com.rktuhinbd.rxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CertificateCondition {

    @SerializedName("values")
    @Expose
    private List<String> values = null;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("applied_field_id")
    @Expose
    private String appliedFieldId;
    @SerializedName("type")
    @Expose
    private String type;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppliedFieldId() {
        return appliedFieldId;
    }

    public void setAppliedFieldId(String appliedFieldId) {
        this.appliedFieldId = appliedFieldId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}