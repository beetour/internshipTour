package com.internshipTour.enums;

public enum LoginResultStatus {
	PARAMSISNULL(0), //参数为空
	USERNAMEPASSWORDMISTAKE(1), //用户名密码错误
	PARAMSMISTAKE(2); //参数错误

	private Integer value;

	private LoginResultStatus(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public static LoginResultStatus setValue(String str) {
		return valueOf(str);

	}

}
