package com.internshipTour.enums;

public enum ImgUploadStatus {
	IMGBIG(0), //图片大于524288
	IMGSAVEFAIL(1);//头像存储出错


	private Integer value;

	private ImgUploadStatus(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public static ImgUploadStatus setValue(String str) {
		return valueOf(str);

	}

}
