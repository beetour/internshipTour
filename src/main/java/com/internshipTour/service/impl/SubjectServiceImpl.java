package com.internshipTour.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterCpsCatalog;
import com.internshipTour.bean.OcenterCpsTempCallboard;
import com.internshipTour.bean.OcenterCpsTopicWithBLOBs;
import com.internshipTour.bean.OcenterCpsTripWithBLOBs;
import com.internshipTour.bean.OcenterIndustryClassify;
import com.internshipTour.bean.OcenterJob;
import com.internshipTour.bean.OcenterJobEnus;
import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.OcenterShixixiu;
import com.internshipTour.bean.mapper.OcenterCpsCatalogMapper;
import com.internshipTour.bean.mapper.OcenterCpsTempCallboardMapper;
import com.internshipTour.bean.mapper.OcenterCpsTopicMapper;
import com.internshipTour.bean.mapper.OcenterCpsTripMapper;
import com.internshipTour.bean.mapper.OcenterIndustryClassifyMapper;
import com.internshipTour.bean.mapper.OcenterJobEnusMapper;
import com.internshipTour.bean.mapper.OcenterJobMapper;
import com.internshipTour.bean.mapper.OcenterPictureMapper;
import com.internshipTour.bean.mapper.OcenterShixixiuMapper;
import com.internshipTour.otherBean.SubjectJob;
import com.internshipTour.service.SubjectService;

@Service("subjectService")
@Transactional
public class SubjectServiceImpl extends BaseServiceImpl<OcenterCpsCatalog> implements SubjectService {

	@Autowired
	private OcenterCpsCatalogMapper ocenterCpsCatalogMapper;
	
	@Autowired
	private OcenterCpsTopicMapper ocenterCpsTopicMapper;
	
	@Autowired
	private OcenterShixixiuMapper ocenterShixixiuMapper;
	
	@Autowired
	private OcenterCpsTripMapper ocenterCpsTripMapper;
	
	@Autowired
	private OcenterCpsTempCallboardMapper ocenterCpsTempCallboardMapper;
	
	@Autowired
	private OcenterPictureMapper ocenterPictureMapper;
	
	@Autowired
	private OcenterJobMapper ocenterJobMapper;
	
	@Autowired
	private OcenterIndustryClassifyMapper ocenterIndustryClassifyMapper;
	
	@Autowired
	private OcenterJobEnusMapper ocenterJobEnusMapper;

	@Override
	public Map<String, Object> getInternshipData() {
		Map<String, Object> map = new HashMap<String, Object>();
		OcenterCpsCatalog catalog = ocenterCpsCatalogMapper.getInternshipData(1);
		if(null == catalog){//无数据，不显示
			return null;
		}
		Integer classId = catalog.getClassId();
		//取轮播图
		try {			
			OcenterCpsTempCallboard cpsTempCallboard = ocenterCpsTempCallboardMapper.selectByClassId(classId);
			String bannerUrl = cpsTempCallboard.getBannerUrl();
			OcenterPicture ocenterPicture = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrl));
			String scollPic = ocenterPicture.getPath();//中文轮播图
			map.put("scollPic", scollPic);
			String bannerUrlEn = cpsTempCallboard.getBannerUrlEn();
			OcenterPicture ocenterPictureEn = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrlEn));
			String scollPicEn = ocenterPictureEn.getPath();//英文轮播图
			map.put("scollPicEn", scollPicEn);
		} catch (Exception e) {
			log.error("获取轮播图出错");
		}
		
		
		
		//trip表数据 实习介绍，本期实习企业介绍
		OcenterCpsTripWithBLOBs trip = ocenterCpsTripMapper.selectByPrimaryKey(classId);
		map.put("trip", trip);
		
		//实习岗位
		if(null != trip){
			String jobId = trip.getJobId();
			String[] strings = jobId.split(",");
			List<SubjectJob> subjectJob = new ArrayList<SubjectJob>();
			for(int i = 0;i < strings.length;i++){
				SubjectJob Job= new SubjectJob();
				String id = strings[i];
				OcenterJob ocenterJob = ocenterJobMapper.selectByPrimaryKey(Integer.parseInt(id));
				Job.setJobNameZN(ocenterJob.getJobName());
				OcenterJobEnus jobEnus = ocenterJobEnusMapper.selectByJid(ocenterJob.getId());
				Job.setJobNameEN(jobEnus.getJobName());
				Integer categoryId = ocenterJob.getCategoryId();
				OcenterIndustryClassify industryClassify = ocenterIndustryClassifyMapper.selectByPrimaryKey(categoryId);
				Job.setJobZN(industryClassify.getName());
				Job.setJobEN(industryClassify.getEnus());
				subjectJob.add(Job);
			}
			map.put("subjectJob", subjectJob);
		}
		
		
		
		//topic
		OcenterCpsTopicWithBLOBs cpsTopic = ocenterCpsTopicMapper.selectByPrimaryKey(classId);
		if(null != cpsTopic){
			Integer videoId = cpsTopic.getVideoId();
			//实习秀视频
			OcenterShixixiu shixixiu = ocenterShixixiuMapper.selectByPrimaryKey(videoId);
			map.put("shixixiu", shixixiu);
			
			//
			Integer fId = cpsTopic.getfId();
			OcenterIndustryClassify industryClassify = ocenterIndustryClassifyMapper.selectByPrimaryKey(fId);
			map.put("companyJob", industryClassify);
		}
		return map;
		
	}


}
