package com.internshipTour.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterTravelRouteList;
import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.bean.mapper.OcenterTravelRouteListMapper;
import com.internshipTour.service.OcenterTravelRouteListService;
import com.internshipTour.util.common.DateUtil;

@Service("ocenterTravelRouteListService")
@Transactional
public class OcenterTravelRouteListServiceImpl extends BaseServiceImpl<OcenterTravelRouteList> implements OcenterTravelRouteListService {

	@Autowired
	private OcenterTravelRouteListMapper ocenterTravelRouteListMapper;


	public List<OcenterTravelRouteList> getSchedule(OcenterUcenterMember ocenterUcenterMember) {
		return ocenterTravelRouteListMapper.getAll(ocenterUcenterMember.getId());
	}


	public void updateSchedule(OcenterTravelRouteList ocenterTravelRouteList) {
		OcenterTravelRouteList selectByPrimaryKey = ocenterTravelRouteListMapper.selectByPrimaryKey(ocenterTravelRouteList.getId());
		if(selectByPrimaryKey != null){
			selectByPrimaryKey.setStatus(selectByPrimaryKey.getStatus() + 1);
			selectByPrimaryKey.setFlushTime(DateUtil.getIntTime());
			ocenterTravelRouteListMapper.updateByPrimaryKeySelective(selectByPrimaryKey);
		}
	}

}
