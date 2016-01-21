package com.internshipTour.bean;

public class OcenterCpsTripWithBLOBs extends OcenterCpsTrip {
    private String tripInfo;

    private String tripInfoEn;

    private String picInfo;

    public String getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo == null ? null : tripInfo.trim();
    }

    public String getTripInfoEn() {
        return tripInfoEn;
    }

    public void setTripInfoEn(String tripInfoEn) {
        this.tripInfoEn = tripInfoEn == null ? null : tripInfoEn.trim();
    }

    public String getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(String picInfo) {
        this.picInfo = picInfo == null ? null : picInfo.trim();
    }
}