package com.internshipTour.enums;

public enum EnumRegisterStatus {
	EMAILEXIST(0),
	PASSWORDDIFFERENT(1),
	NICKNAMEEXIST(2),
	PARAMSMISTAKE(3);

	private Integer value;

	private EnumRegisterStatus(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public static EnumRegisterStatus setValue(String str) {
		return valueOf(str);

	}

}
