package com.internshipTour.bean;

public class OcenterUserRole {
    private Integer id;

    private Integer uid;

    private Integer roleId;

    private Byte status;

    private String step;

    private Byte init;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public Byte getInit() {
        return init;
    }

    public void setInit(Byte init) {
        this.init = init;
    }

	@Override
	public String toString() {
		return "OcenterUserRole [id=" + id + ", uid=" + uid + ", roleId=" + roleId + ", status=" + status + ", step="
				+ step + ", init=" + init + "]";
	}
    
   
}