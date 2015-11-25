package com.internshipTour.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.internshipTour.base.BaseController;
import com.internshipTour.bean.OcenterTravelRouteList;
import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumResultCode;
import com.internshipTour.enums.LoginResultStatus;
import com.internshipTour.service.OcenterTravelRouteListService;
import com.internshipTour.util.common.JsonStr2Object;

@Controller
@RequestMapping(value = "/user/{userType}")
public class ScheduleController extends BaseController {

	@Resource(name = "ocenterTravelRouteListService")
	OcenterTravelRouteListService ocenterTravelRouteListService;
	
	/**
	 * 获取行程
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/mySchedule")
	public ReturnBean mySchedule(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		OcenterUcenterMember ocenterUcenterMember = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ocenterUcenterMember = JsonStr2Object.json2Bean(OcenterUcenterMember.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		List<OcenterTravelRouteList> schedule = ocenterTravelRouteListService.getSchedule(ocenterUcenterMember);
		if (schedule == null || schedule.size() <= 0) {
			log.error("无数据!");
			map.put("msg", "无数据!");
			map.put("status", LoginResultStatus.USERNAMEPASSWORDMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		map.put("schedule", schedule);
		map.put("size", schedule.size());
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		returnBean.setResultMsg(map);
		return returnBean;
	}
	
	@RequestMapping("/updateSchedule")
	public ReturnBean updateSchedule(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		OcenterTravelRouteList ocenterTravelRouteList = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ocenterTravelRouteList = JsonStr2Object.json2Bean(OcenterTravelRouteList.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		ocenterTravelRouteListService.updateSchedule(ocenterTravelRouteList);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		returnBean.setResultMsg(map);
		return returnBean;
	}

}
