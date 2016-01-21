package com.internshipTour.bean;

public class OcenterCpsCatalog {
    private Integer categoryId;

    private Integer parentId;

    private Integer classId;

    private String comTitlename;

    private Integer comColumnid;

    private String comLink;

    private Integer comList;

    private String classUrl;

    private Boolean isShow;

    private Short tempId;

    private Boolean status;

    private Boolean categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getComTitlename() {
        return comTitlename;
    }

    public void setComTitlename(String comTitlename) {
        this.comTitlename = comTitlename == null ? null : comTitlename.trim();
    }

    public Integer getComColumnid() {
        return comColumnid;
    }

    public void setComColumnid(Integer comColumnid) {
        this.comColumnid = comColumnid;
    }

    public String getComLink() {
        return comLink;
    }

    public void setComLink(String comLink) {
        this.comLink = comLink == null ? null : comLink.trim();
    }

    public Integer getComList() {
        return comList;
    }

    public void setComList(Integer comList) {
        this.comList = comList;
    }

    public String getClassUrl() {
        return classUrl;
    }

    public void setClassUrl(String classUrl) {
        this.classUrl = classUrl == null ? null : classUrl.trim();
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Short getTempId() {
        return tempId;
    }

    public void setTempId(Short tempId) {
        this.tempId = tempId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Boolean categoryType) {
        this.categoryType = categoryType;
    }
}