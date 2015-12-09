package com.internshipTour.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterUserRole;
import com.internshipTour.bean.mapper.OcenterUserRoleMapper;
import com.internshipTour.service.OcenterUserRoleService;

@Service("ocenterUserRoleService")
@Transactional
public class OcenterUserRoleServiceImpl extends BaseServiceImpl<OcenterUserRole> implements OcenterUserRoleService {

	@Autowired
	private OcenterUserRoleMapper ocenterUserRoleMapper;
	

}
