package com.internshipTour.bean;

public class OcenterTravelRouteList {
    private Integer id;

    private Integer uid;

    private Integer roadId;

    private Integer sort;

    private Integer addTime;

    private Integer status;

    private String content;

    private Integer flushTime;
    
    private OcenterTravelRoute ocenterTravelRoute;

    public OcenterTravelRoute getOcenterTravelRoute() {
		return ocenterTravelRoute;
	}

	public void setOcenterTravelRoute(OcenterTravelRoute ocenterTravelRoute) {
		this.ocenterTravelRoute = ocenterTravelRoute;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRoadId() {
        return roadId;
    }

    public void setRoadId(Integer roadId) {
        this.roadId = roadId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getFlushTime() {
        return flushTime;
    }

    public void setFlushTime(Integer flushTime) {
        this.flushTime = flushTime;
    }
}