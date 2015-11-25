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
import com.internshipTour.bean.OcenterNews;
import com.internshipTour.bean.OcenterNewsDetail;
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumResultCode;
import com.internshipTour.enums.LoginResultStatus;
import com.internshipTour.requesrBean.News;
import com.internshipTour.service.OcenterNewsDetailService;
import com.internshipTour.service.OcenterNewsService;
import com.internshipTour.util.common.JsonStr2Object;



@Controller
@RequestMapping(value = "/user/{userType}")
public class NewsController extends BaseController {

	@Resource(name = "ocenterNewsService")
	OcenterNewsService ocenterNewsService;
	
	@Resource(name="ocenterNewsDetailService")
	OcenterNewsDetailService ocenterNewsDetailService;
	/**
	 * 新闻大图
	 * @param request
	 * @param userType
	 * @return
	 */
	@RequestMapping("/scrollNews")
	public ReturnBean scrollNews(HttpServletRequest request, @PathVariable String userType) {
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, OcenterNews> scrollNews = ocenterNewsService.getScrollNews();
		if(scrollNews == null || scrollNews.size() <= 0){
			log.error("scrollNews无数据!");
			map.put("msg", "无数据");
			map.put("status", 0);
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		map.put("scrollNews", scrollNews);
		map.put("size", scrollNews.size());
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		return returnBean;
	}
	
	/**
	 * 获取新闻
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/getNews")
	public ReturnBean getNews(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		News news = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			news = JsonStr2Object.json2Bean(News.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		Map<String, OcenterNews> ocenterNews = ocenterNewsService.getNews(news);
		if(ocenterNews == null || ocenterNews.size() <= 0){
			log.error("getNews无数据!");
			map.put("msg", "无数据");
			map.put("status", 0);
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		map.put("ocenterNews", ocenterNews);
		map.put("size", ocenterNews.size());
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());	
		return returnBean;
	}
	
	/**
	 * 查询新闻详情
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/getNewsDetail")
	public ReturnBean getNewsDetail(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		OcenterNewsDetail ocenterNewsDetail = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			ocenterNewsDetail = JsonStr2Object.json2Bean(OcenterNewsDetail.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		 Map<String, Object> byNewsId = ocenterNewsDetailService.getByNewsId(ocenterNewsDetail);
		if(byNewsId == null || byNewsId.size() <= 0){
			log.error("getNewsDetail无数据!");
			map.put("msg", "无数据");
			map.put("status", 0);
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		map.put("ocenterNewsDetail", byNewsId);
		returnBean.setResultMsg(map);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());	
		return returnBean;
	}
}
