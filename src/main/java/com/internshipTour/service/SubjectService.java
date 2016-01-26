package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterCpsCatalog;
import com.internshipTour.bean.OcenterCpsSign;
import com.internshipTour.requesrBean.IsRegister;

public interface SubjectService extends BaseService<OcenterCpsCatalog> {

	/**
	 * 获取实习实践数据
	 * @return
	 */
	Map<String, Object> getInternshipData();
	
	/**
	 * 获取文化体验数据
	 * @return
	 */
	Map<String, Object> getTourData();
	
	
	/**
	 * 是否参加文化体验
	 * @param isRegister
	 * @return
	 */
	boolean isRegister(IsRegister isRegister);
	
	/**
	 * 文化体验报名
	 * @param ocenterCpsSign
	 * @return
	 */
	boolean registerNow(OcenterCpsSign ocenterCpsSign);
	


}
