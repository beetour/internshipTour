package com.internshipTour.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterNewsCategory;
import com.internshipTour.bean.mapper.OcenterNewsCategoryMapper;
import com.internshipTour.service.OcenterNewsCategoryService;


@Service("ocenterNewsCategoryService")
@Transactional
public class OcenterNewsCategoryServiceImpl extends BaseServiceImpl<OcenterNewsCategory> implements OcenterNewsCategoryService {

	@Autowired
	private OcenterNewsCategoryMapper ocenterNewsCategoryMapper;
	
	
	public List<OcenterNewsCategory> getAll() {
		return ocenterNewsCategoryMapper.getAll();	
	}

}
