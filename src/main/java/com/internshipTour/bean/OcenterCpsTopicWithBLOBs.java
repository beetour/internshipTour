package com.internshipTour.bean;

public class OcenterCpsTopicWithBLOBs extends OcenterCpsTopic {
    private String infoEn;

    private String info;

    public String getInfoEn() {
        return infoEn;
    }

    public void setInfoEn(String infoEn) {
        this.infoEn = infoEn == null ? null : infoEn.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}