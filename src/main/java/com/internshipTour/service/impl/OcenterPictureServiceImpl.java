package com.internshipTour.service.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.mapper.OcenterPictureMapper;
import com.internshipTour.service.OcenterPictureService;


@Service("ocenterPictureService")
@Transactional
public class OcenterPictureServiceImpl extends BaseServiceImpl<OcenterPicture> implements OcenterPictureService {

	@Autowired
	private OcenterPictureMapper ocenterPictureMapper;

	public OcenterPicture getById(Integer id) {
		return ocenterPictureMapper.selectByPrimaryKey(id);
	}



}
