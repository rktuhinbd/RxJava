package com.rktuhinbd.rxjava.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CertificateOption {

    @SerializedName("name_en")
    @Expose
    private String nameEn;
    @SerializedName("name_bn")
    @Expose
    private String nameBn;

    boolean isChecked = false;

    public CertificateOption(String nameEn, String nameBn, boolean isChecked) {
        this.nameEn = nameEn;
        this.nameBn = nameBn;
        this.isChecked = isChecked;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
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

}