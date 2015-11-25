package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterNews;
import com.internshipTour.bean.OcenterNewsExample;
import com.internshipTour.requesrBean.News;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterNewsMapper {
    int countByExample(OcenterNewsExample example);

    int deleteByExample(OcenterNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterNews record);

    int insertSelective(OcenterNews record);

    List<OcenterNews> selectByExample(OcenterNewsExample example);

    OcenterNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterNews record, @Param("example") OcenterNewsExample example);

    int updateByExample(@Param("record") OcenterNews record, @Param("example") OcenterNewsExample example);

    int updateByPrimaryKeySelective(OcenterNews record);

    int updateByPrimaryKey(OcenterNews record);
    
    /**
     * 获取所有启用的新闻
     * @param id
     * @return
     */
    OcenterNews selectByCategory(Integer id);
    
    /**
     * 获取分页新闻
     * @param page
     * @param limit
     * @return
     */
	List<OcenterNews> selectByPage(News news);
}