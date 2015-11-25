package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterConfig;

public interface OcenterConfigService extends BaseService<OcenterConfig> {
	
	/**
	 * 查询短信配置信息
	 * @return
	 */
	Map<String, String> getEmailInfo();
}
