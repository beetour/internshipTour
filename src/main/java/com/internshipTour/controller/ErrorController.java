package com.internshipTour.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.internshipTour.base.BaseController;
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumResultCode;


@Controller
@RequestMapping(value = "/error")
public class ErrorController extends BaseController {


	@RequestMapping("/404")
	public ReturnBean error() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msg", "失败");
		returnBean.setReturnCode(EnumResultCode.FAIL.toString());
		returnBean.setReturnMsg("未找到资源文件");
		returnBean.setResultCode(EnumResultCode.FAIL.toString());
		returnBean.setResultMsg(map);
		return returnBean;
	}
}
