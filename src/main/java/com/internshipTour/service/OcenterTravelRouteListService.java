package com.internshipTour.service;

import java.util.List;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterTravelRouteList;
import com.internshipTour.bean.OcenterUcenterMember;

public interface OcenterTravelRouteListService extends BaseService<OcenterTravelRouteList> {
	
	/**
	 * 获取行程
	 * @param ocenterUcenterMember
	 * @return
	 */
	List<OcenterTravelRouteList> getSchedule(OcenterUcenterMember ocenterUcenterMember);
	
	/**
	 * 更新行程状态
	 * @param ocenterTravelRouteList
	 */
	void updateSchedule(OcenterTravelRouteList ocenterTravelRouteList);
	


}
