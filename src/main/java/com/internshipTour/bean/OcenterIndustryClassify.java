package com.internshipTour.bean;

public class OcenterIndustryClassify {
    private Integer id;

    private String name;

    private String description;

    private String zhcn;

    private String enus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getZhcn() {
        return zhcn;
    }

    public void setZhcn(String zhcn) {
        this.zhcn = zhcn == null ? null : zhcn.trim();
    }

    public String getEnus() {
        return enus;
    }

    public void setEnus(String enus) {
        this.enus = enus == null ? null : enus.trim();
    }
}