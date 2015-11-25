package com.internshipTour.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterConfig;
import com.internshipTour.bean.mapper.OcenterConfigMapper;
import com.internshipTour.enums.EnumEmailParams;
import com.internshipTour.service.OcenterConfigService;
@Service("ocenterConfigService")
@Transactional
public class OcenterConfigServiceImpl extends BaseServiceImpl<OcenterConfig> implements OcenterConfigService {

	@Autowired
	private OcenterConfigMapper ocenterConfigMapper;

	public Map<String, String> getEmailInfo() {
		OcenterConfig ConfigHOST = ocenterConfigMapper.selectByName(EnumEmailParams.MAIL_SMTP_HOST.toString());
		OcenterConfig ConfigPORT = ocenterConfigMapper.selectByName(EnumEmailParams.MAIL_SMTP_PORT.toString());
		OcenterConfig ConfigUSER = ocenterConfigMapper.selectByName(EnumEmailParams.MAIL_SMTP_USER.toString());
		OcenterConfig ConfigPASS = ocenterConfigMapper.selectByName(EnumEmailParams.MAIL_SMTP_PASS.toString());
		Map<String, String> map =new HashMap<String, String>();
		map.put(EnumEmailParams.MAIL_SMTP_HOST.toString(), ConfigHOST.getValue());
		map.put(EnumEmailParams.MAIL_SMTP_PORT.toString(), ConfigPORT.getValue());
		map.put(EnumEmailParams.MAIL_SMTP_USER.toString(), ConfigUSER.getValue());
		map.put(EnumEmailParams.MAIL_SMTP_PASS.toString(), ConfigPASS.getValue());
		return map;
	}

	
	

}
