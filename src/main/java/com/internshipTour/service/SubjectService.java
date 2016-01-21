package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterCpsCatalog;

public interface SubjectService extends BaseService<OcenterCpsCatalog> {

	/**
	 * 获取实习时间数据
	 * @return
	 */
	Map<String, Object> getInternshipData();
	


}
