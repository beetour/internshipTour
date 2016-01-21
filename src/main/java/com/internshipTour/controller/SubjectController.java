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
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumResultCode;
import com.internshipTour.enums.LoginResultStatus;
import com.internshipTour.service.SubjectService;

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
		map.put("internshipData", internshipData);
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}


}
