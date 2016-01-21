package com.internshipTour.bean;

public class OcenterCpsTrip {
    private Integer tripId;

    private Integer classId;

    private String picUrl;

    private String picInfoEn;

    private String photoMark;

    private Integer photoSubid;

    private Integer trTime;

    private Integer trEndtime;

    private Integer number;

    private String cUrl;

    private String requirement;

    private String jobId;

    private String schoolId;

    private Integer ctime;

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPicInfoEn() {
        return picInfoEn;
    }

    public void setPicInfoEn(String picInfoEn) {
        this.picInfoEn = picInfoEn == null ? null : picInfoEn.trim();
    }

    public String getPhotoMark() {
        return photoMark;
    }

    public void setPhotoMark(String photoMark) {
        this.photoMark = photoMark == null ? null : photoMark.trim();
    }

    public Integer getPhotoSubid() {
        return photoSubid;
    }

    public void setPhotoSubid(Integer photoSubid) {
        this.photoSubid = photoSubid;
    }

    public Integer getTrTime() {
        return trTime;
    }

    public void setTrTime(Integer trTime) {
        this.trTime = trTime;
    }

    public Integer getTrEndtime() {
        return trEndtime;
    }

    public void setTrEndtime(Integer trEndtime) {
        this.trEndtime = trEndtime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl == null ? null : cUrl.trim();
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId == null ? null : schoolId.trim();
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}