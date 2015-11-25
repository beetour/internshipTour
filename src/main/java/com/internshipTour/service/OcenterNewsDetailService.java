package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterNewsDetail;

public interface OcenterNewsDetailService extends BaseService<OcenterNewsDetail> {
	
	/**
	 * 根据id查
	 * @param ocenterNewsDetail
	 * @return
	 */
	Map<String, Object> getByNewsId(OcenterNewsDetail ocenterNewsDetail);



}
