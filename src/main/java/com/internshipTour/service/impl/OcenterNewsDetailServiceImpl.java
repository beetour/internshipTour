package com.internshipTour.service.impl;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterNews;
import com.internshipTour.bean.OcenterNewsDetail;
import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.mapper.OcenterNewsDetailMapper;
import com.internshipTour.bean.mapper.OcenterNewsMapper;
import com.internshipTour.bean.mapper.OcenterPictureMapper;
import com.internshipTour.service.OcenterNewsDetailService;
import com.internshipTour.util.common.DateUtil;
import com.internshipTour.util.common.SystemConf;


@Service("ocenterNewsDetailService")
@Transactional
public class OcenterNewsDetailServiceImpl extends BaseServiceImpl<OcenterNewsDetail> implements OcenterNewsDetailService {

	@Autowired
	private OcenterNewsDetailMapper ocenterNewsDetailMapper;
	
	@Autowired
	private OcenterNewsMapper ocenterNewsMapper;
	
	@Autowired
	private OcenterPictureMapper ocenterPictureMapper;

	public Map<String, Object> getByNewsId(OcenterNewsDetail ocenterNewsDetail) {
		 OcenterNewsDetail newsDetail = ocenterNewsDetailMapper.selectByPrimaryKey(ocenterNewsDetail.getNewsId());
		 Map<String, Object> map = new HashMap<String, Object>();
		 if(newsDetail != null){
			 OcenterNews record = ocenterNewsMapper.selectByPrimaryKey(newsDetail.getNewsId());
			 OcenterPicture ocenterPicture = ocenterPictureMapper.selectByPrimaryKey(record.getCover());
			map.put("newsDetail", newsDetail);
			map.put("ocenterNews", record);
			String path = SystemConf.getServerIP() +ocenterPicture.getPath();
			map.put("path",  path);
			 record.setView(record.getView() + 1);
			 record.setUpdateTime(DateUtil.getIntTime());
			ocenterNewsMapper.updateByPrimaryKey(record);			
		 }
		 return map;
	}

}
