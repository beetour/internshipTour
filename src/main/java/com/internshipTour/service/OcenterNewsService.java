package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterNews;
import com.internshipTour.requesrBean.News;

public interface OcenterNewsService extends BaseService<OcenterNews> {
	
	/**
	 * 获取首页大图资讯
	 * @return
	 */
	Map<String, OcenterNews> getScrollNews();
	
	/**
	 * 分页查询新闻
	 * @param news
	 * @return
	 */
	Map<String, OcenterNews> getNews(News news);



}
