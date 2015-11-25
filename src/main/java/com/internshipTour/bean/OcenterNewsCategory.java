package com.internshipTour.bean;

public class OcenterNewsCategory {
    private Integer id;

    private String title;

    private Integer pid;

    private Byte canPost;

    private Byte needAudit;

    private Byte sort;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getCanPost() {
        return canPost;
    }

    public void setCanPost(Byte canPost) {
        this.canPost = canPost;
    }

    public Byte getNeedAudit() {
        return needAudit;
    }

    public void setNeedAudit(Byte needAudit) {
        this.needAudit = needAudit;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}