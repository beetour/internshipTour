package com.internshipTour.service;

import java.util.List;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterNewsCategory;

public interface OcenterNewsCategoryService extends BaseService<OcenterNewsCategory> {
	
	/**
	 * 获取所有种类
	 * @return
	 */
	List<OcenterNewsCategory> getAll();

	

}
