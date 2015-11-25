package com.internshipTour.enums;

public enum OcenterNewsStatus {
	DELETE(-1),//删除
	 FORBIDDEN(0), //禁用
	USERNAMEPASSWORDMISTAKE(1), //启用
	NOTAUDIT(2); //未审核

	private Integer value;

	private OcenterNewsStatus(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public static OcenterNewsStatus setValue(String str) {
		return valueOf(str);

	}

}
