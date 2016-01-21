package com.internshipTour.bean;

public class OcenterCpsTempCallboard {
    private Integer id;

    private Boolean status;

    private Integer sendtime;

    private Integer classid;

    private String bannerUrl;

    private String bannerUrlEn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public String getBannerUrlEn() {
        return bannerUrlEn;
    }

    public void setBannerUrlEn(String bannerUrlEn) {
        this.bannerUrlEn = bannerUrlEn == null ? null : bannerUrlEn.trim();
    }
}