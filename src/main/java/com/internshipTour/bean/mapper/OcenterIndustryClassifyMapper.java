package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterIndustryClassify;
import com.internshipTour.bean.OcenterIndustryClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterIndustryClassifyMapper {
    int countByExample(OcenterIndustryClassifyExample example);

    int deleteByExample(OcenterIndustryClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterIndustryClassify record);

    int insertSelective(OcenterIndustryClassify record);

    List<OcenterIndustryClassify> selectByExample(OcenterIndustryClassifyExample example);

    OcenterIndustryClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterIndustryClassify record, @Param("example") OcenterIndustryClassifyExample example);

    int updateByExample(@Param("record") OcenterIndustryClassify record, @Param("example") OcenterIndustryClassifyExample example);

    int updateByPrimaryKeySelective(OcenterIndustryClassify record);

    int updateByPrimaryKey(OcenterIndustryClassify record);
}