package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterNewsCategory;
import com.internshipTour.bean.OcenterNewsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterNewsCategoryMapper {
    int countByExample(OcenterNewsCategoryExample example);

    int deleteByExample(OcenterNewsCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterNewsCategory record);

    int insertSelective(OcenterNewsCategory record);

    List<OcenterNewsCategory> selectByExample(OcenterNewsCategoryExample example);

    OcenterNewsCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterNewsCategory record, @Param("example") OcenterNewsCategoryExample example);

    int updateByExample(@Param("record") OcenterNewsCategory record, @Param("example") OcenterNewsCategoryExample example);

    int updateByPrimaryKeySelective(OcenterNewsCategory record);

    int updateByPrimaryKey(OcenterNewsCategory record);
    
    /**
     * 获取所有的种类
     * @return
     */
	List<OcenterNewsCategory> getAll();
}