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
import com.internshipTour.bean.OcenterCpsProductEntityEn;
import com.internshipTour.bean.OcenterCpsProductEntityWithBLOBs;
import com.internshipTour.bean.OcenterCpsSign;
import com.internshipTour.bean.OcenterCpsTempCallboard;
import com.internshipTour.bean.OcenterCpsTopicWithBLOBs;
import com.internshipTour.bean.OcenterCpsTripWithBLOBs;
import com.internshipTour.bean.OcenterIndustryClassify;
import com.internshipTour.bean.OcenterJob;
import com.internshipTour.bean.OcenterJobEnus;
import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.OcenterSchoolWithBLOBs;
import com.internshipTour.bean.OcenterShixixiu;
import com.internshipTour.bean.mapper.OcenterCpsCatalogMapper;
import com.internshipTour.bean.mapper.OcenterCpsProductEntityEnMapper;
import com.internshipTour.bean.mapper.OcenterCpsProductEntityMapper;
import com.internshipTour.bean.mapper.OcenterCpsSignMapper;
import com.internshipTour.bean.mapper.OcenterCpsTempCallboardMapper;
import com.internshipTour.bean.mapper.OcenterCpsTopicMapper;
import com.internshipTour.bean.mapper.OcenterCpsTripMapper;
import com.internshipTour.bean.mapper.OcenterIndustryClassifyMapper;
import com.internshipTour.bean.mapper.OcenterJobEnusMapper;
import com.internshipTour.bean.mapper.OcenterJobMapper;
import com.internshipTour.bean.mapper.OcenterPictureMapper;
import com.internshipTour.bean.mapper.OcenterSchoolMapper;
import com.internshipTour.bean.mapper.OcenterShixixiuMapper;
import com.internshipTour.otherBean.SubjectJob;
import com.internshipTour.otherBean.Tour;
import com.internshipTour.requesrBean.IsRegister;
import com.internshipTour.service.SubjectService;
import com.internshipTour.util.common.DateUtil;

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

	@Autowired
	private OcenterSchoolMapper ocenterSchoolMapper;
	
	@Autowired
	private OcenterCpsSignMapper ocenterCpsSignMapper;
	
	@Autowired
	private OcenterCpsProductEntityMapper ocenterCpsProductEntityMapper;
	
	@Autowired
	private OcenterCpsProductEntityEnMapper ocenterCpsProductEntityEnMapper;
	@Override
	public Map<String, Object> getInternshipData() {
		Map<String, Object> map = new HashMap<String, Object>();
		OcenterCpsCatalog catalog = ocenterCpsCatalogMapper.getInternshipData(1);
		if(null == catalog){//无数据，不显示
			return null;
		}
		Integer classId = catalog.getClassId();
		try {			
			//取轮播图
			OcenterCpsTempCallboard cpsTempCallboard = ocenterCpsTempCallboardMapper.selectByClassId(classId);
			String bannerUrl = cpsTempCallboard.getBannerUrl();
			OcenterPicture ocenterPicture = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrl));
			String scollPic = ocenterPicture.getPath();//中文轮播图
			map.put("scollPic", scollPic);
			String bannerUrlEn = cpsTempCallboard.getBannerUrlEn();
			OcenterPicture ocenterPictureEn = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrlEn));
			String scollPicEn = ocenterPictureEn.getPath();//英文轮播图
			map.put("scollPicEn", scollPicEn);
		
		
		
		
		//trip表数据 实习介绍，本期实习企业介绍
		OcenterCpsTripWithBLOBs trip = ocenterCpsTripMapper.selectByClassId(classId);
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
			
			
			//实习企业logo
			String picUrl = trip.getPicUrl();
			OcenterPicture ocenterPicture1 = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(picUrl));
			map.put("picUrl", ocenterPicture1.getPath());
			
			
			//学校
			String schoolId = trip.getSchoolId();
			String[] split = schoolId.split(",");
			List<OcenterSchoolWithBLOBs> school = new ArrayList<OcenterSchoolWithBLOBs>();
			for(int i = 0;i < split.length; i++){
				OcenterSchoolWithBLOBs ocenterSchool = ocenterSchoolMapper.selectByPrimaryKey(Integer.parseInt(split[i]));
				school.add(ocenterSchool);
			}
			map.put("school", school);			
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
		
		} catch (Exception e) {
			log.error("获取实习实践数据出错");
			return null;
		}
		
		return map;
		
	}
	@Override
	public Map<String, Object> getTourData() {
		Map<String, Object> map = new HashMap<String, Object>();
		OcenterCpsCatalog catalog = ocenterCpsCatalogMapper.getInternshipData(2);
		if(null == catalog){//无数据，不显示
			return null;
		}
		Integer classId = catalog.getClassId();
		try {			
			//取轮播图
			OcenterCpsTempCallboard cpsTempCallboard = ocenterCpsTempCallboardMapper.selectByClassId(classId);
			String bannerUrl = cpsTempCallboard.getBannerUrl();
			OcenterPicture ocenterPicture = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrl));
			String scollPic = ocenterPicture.getPath();//中文轮播图
			map.put("scollPic", scollPic);
			String bannerUrlEn = cpsTempCallboard.getBannerUrlEn();
			OcenterPicture ocenterPictureEn = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(bannerUrlEn));
			String scollPicEn = ocenterPictureEn.getPath();//英文轮播图
			map.put("scollPicEn", scollPicEn);
			
			//topic
			OcenterCpsTopicWithBLOBs cpsTopic = ocenterCpsTopicMapper.selectByPrimaryKey(classId);
			if(null != cpsTopic){
				List<Tour> tour = new ArrayList<Tour>();
				List<OcenterCpsProductEntityWithBLOBs> subId = ocenterCpsProductEntityMapper.selectBySubId(classId);
				if(subId != null && subId.size() > 0){
					for(OcenterCpsProductEntityWithBLOBs o : subId){
						Tour t = new Tour();
						t.setClassid(o.getEntityId());
						t.setEntityName(o.getEntityName());
						t.setUnsaleTime(o.getUnsaleTime());
						t.setActiveEtime(o.getActiveEtime());
						t.setActiveStime(o.getActiveStime());
						OcenterPicture picture = ocenterPictureMapper.selectByPrimaryKey(Integer.parseInt(o.getSubSpic()));
						t.setSubSpic(picture.getPath());
						t.setOptions(o.getOptions());
						t.setEntityContent(o.getEntityContext());
						OcenterCpsProductEntityEn EntityEN = ocenterCpsProductEntityEnMapper.selectByEntityId(o.getEntityId());
						t.setOptionsEN(EntityEN.getOptions());
						t.setEntityContentEN(EntityEN.getEntityContext());
						t.setEntityNameEN(EntityEN.getEntityName());
						t.setEntityInfo(o.getEntityInfo());
						t.setEntityInfoEN(EntityEN.getEntityInfo());
						tour.add(t);
					}
					map.put("tour", tour);
				}
				map.put("topic", cpsTopic);
			}
			
			
		} catch (Exception e) {
			log.error("获取文化体验数据出错");
			return null;
		}
		return map;
	}
	@Override
	public boolean isRegister(IsRegister isRegister) {
		OcenterCpsSign cpsSign = ocenterCpsSignMapper.selectByUidAndClassId(isRegister.getUid(),isRegister.getClassid());
		if(null == cpsSign){
			return false;
		}
		return true;
	}
	@Override
	public boolean registerNow(OcenterCpsSign ocenterCpsSign) {
		ocenterCpsSign.setAddtime(DateUtil.getIntTime());
		ocenterCpsSign.setType(2);
		ocenterCpsSign.setIsPc(true);
		System.out.println(ocenterCpsSign);
		int i = ocenterCpsSignMapper.insertSelective(ocenterCpsSign);
		if(i < 1){
			return false;
		}

		return true;
	}


}
