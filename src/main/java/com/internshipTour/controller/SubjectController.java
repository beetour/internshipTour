package com.internshipTour.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.internshipTour.base.BaseController;
import com.internshipTour.bean.OcenterCpsSign;
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumResultCode;
import com.internshipTour.enums.LoginResultStatus;
import com.internshipTour.requesrBean.IsRegister;
import com.internshipTour.service.SubjectService;
import com.internshipTour.util.common.JsonStr2Object;

@Controller
@RequestMapping(value = "/user/{userType}")
public class SubjectController extends BaseController {

	@Resource(name = "subjectService")
	SubjectService subjectService;
	
	/**
	 * 获取实习实践专题数据
	 * 
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/getInternshipData")
	public ReturnBean getInternshipData(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> internshipData = subjectService.getInternshipData();
		if(null == internshipData){
			log.error("实习专题无数据!");
			map.put("msg", "实习专题无数据!");
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}		
		System.out.println(internshipData);
		map.put("internshipData", internshipData);
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}

	/**
	 * 获取文化体验专题数据
	 * 
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/getTourData")
	public ReturnBean getTourData(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> tourData = subjectService.getTourData();
		if(null == tourData){
			log.error("文化体验专题无数据!");
			map.put("msg", "文化体验专题无数据!");
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}		
		map.put("tourData", tourData);
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}
	
	/**
	 * 是否报名
	 * 
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/isRegister")
	public ReturnBean isRegister(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		IsRegister isRegister = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			isRegister = JsonStr2Object.json2Bean(IsRegister.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		
		boolean register = subjectService.isRegister(isRegister);
		
		if(register == false){
			log.error("未报名文化体验!");
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}		
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}
	
	
	/**
	 * 报名
	 * 
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/registerNow")
	public ReturnBean registerNow(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {

		OcenterCpsSign ocenterCpsSign = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ocenterCpsSign = JsonStr2Object.json2Bean(OcenterCpsSign.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		
		boolean registerNow = subjectService.registerNow(ocenterCpsSign);
		if(registerNow == false){
			log.error("文化体验报名失败!");
			map.put("msg", "文化体验报名失败");
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}

}
