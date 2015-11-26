package com.internshipTour.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterNews;
import com.internshipTour.bean.OcenterNewsCategory;
import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.mapper.OcenterNewsMapper;
import com.internshipTour.requesrBean.News;
import com.internshipTour.service.OcenterNewsCategoryService;
import com.internshipTour.service.OcenterNewsService;
import com.internshipTour.service.OcenterPictureService;
import com.internshipTour.util.common.DateUtil;
import com.internshipTour.util.common.ImgUtil;
import com.internshipTour.util.common.SystemConf;


@Service("ocenterNewsService")
@Transactional
public class OcenterNewsServiceImpl extends BaseServiceImpl<OcenterNews> implements OcenterNewsService {

	@Autowired
	private OcenterNewsMapper ocenterNewsMapper;

	@Resource(name = "ocenterNewsCategoryService")
	OcenterNewsCategoryService ocenterNewsCategoryService;
	
	@Resource(name = "ocenterPictureService")
	OcenterPictureService ocenterPictureService;
	private static final String PATHSCROLLNEWS = "widget://image/default.jpg";
	private static final String PATHNEWS = "../image/default.jpg";
	
	public Map<String, OcenterNews> getScrollNews() {
		List<OcenterNewsCategory> allCategory = ocenterNewsCategoryService.getAll();
		Map<String, OcenterNews> map = new HashMap<String, OcenterNews>();//key为新闻种类  value为新闻
		int i = 0;
		for(OcenterNewsCategory o : allCategory){
			OcenterNews selectByCategory = ocenterNewsMapper.selectByCategory(o.getId());
			if(selectByCategory != null){
				if(selectByCategory.getDeadLine() > DateUtil.getIntTime()){
					OcenterPicture ocenterPicture = ocenterPictureService.getById(selectByCategory.getCover());
					String path = "";
					if(ocenterPicture != null){
						path = SystemConf.getServerIP() + ImgUtil.getPicturePath(ocenterPicture.getPath(), "_200_146") + "%|#" + i;
					} else {
						path = PATHSCROLLNEWS + "%|#" + i;
					}
					map.put(path, selectByCategory);
				}
			}
			i++;
		}
		return map;
	}

	public Map<String, OcenterNews> getNews(News news) {
		 List<OcenterNews> list = ocenterNewsMapper.selectByPage(news);
		 Map<String, OcenterNews> map = new HashMap<String, OcenterNews>();//key为新闻种类  value为新闻
		 if(list != null && list.size() > 0){
			 int i = 0;
			 for(OcenterNews o : list){
				 if(o.getDeadLine() > DateUtil.getIntTime()){					 
					 OcenterPicture ocenterPicture = ocenterPictureService.getById(o.getCover());
					 String path = "";
					 if(ocenterPicture != null){
						 path = SystemConf.getServerIP() + ImgUtil.getPicturePath(ocenterPicture.getPath(), "_100_70") + "%|#" + i;
					 } else {
						 path = PATHNEWS + "%|#" + i;
					 }
					 map.put(path, o);
				 }
				 i++;
			 }
		 }
		 return map;
	}

}
