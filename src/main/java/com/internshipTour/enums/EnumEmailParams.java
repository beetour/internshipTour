package com.internshipTour.enums;

public enum EnumEmailParams {
	MAIL_SMTP_HOST("服务器"),
	MAIL_SMTP_PORT("端口"),
	MAIL_SMTP_USER("用户名"),
	MAIL_SMTP_PASS("密码");

	private String value;

	private EnumEmailParams(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static EnumEmailParams setValue(String str) {
		return valueOf(str);

	}

}
