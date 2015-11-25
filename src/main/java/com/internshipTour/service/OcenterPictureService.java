package com.internshipTour.service;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterPicture;

public interface OcenterPictureService extends BaseService<OcenterPicture> {
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	OcenterPicture getById(Integer id);



}
