package com.internshipTour.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterTravelRoute;
import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.bean.mapper.OcenterTravelRouteMapper;
import com.internshipTour.service.OcenterTravelRouteService;


@Service("ocenterTravelRouteService")
@Transactional
public class OcenterTravelRouteServiceImpl extends BaseServiceImpl<OcenterTravelRoute> implements OcenterTravelRouteService {

	@Autowired
	private OcenterTravelRouteMapper ocenterTravelRouteMapper;


}
