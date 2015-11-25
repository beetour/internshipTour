package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterNewsDetail;
import com.internshipTour.bean.OcenterNewsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterNewsDetailMapper {
    int countByExample(OcenterNewsDetailExample example);

    int deleteByExample(OcenterNewsDetailExample example);

    int deleteByPrimaryKey(Integer newsId);

    int insert(OcenterNewsDetail record);

    int insertSelective(OcenterNewsDetail record);

    List<OcenterNewsDetail> selectByExampleWithBLOBs(OcenterNewsDetailExample example);

    List<OcenterNewsDetail> selectByExample(OcenterNewsDetailExample example);

    OcenterNewsDetail selectByPrimaryKey(Integer newsId);

    int updateByExampleSelective(@Param("record") OcenterNewsDetail record, @Param("example") OcenterNewsDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterNewsDetail record, @Param("example") OcenterNewsDetailExample example);

    int updateByExample(@Param("record") OcenterNewsDetail record, @Param("example") OcenterNewsDetailExample example);

    int updateByPrimaryKeySelective(OcenterNewsDetail record);

    int updateByPrimaryKeyWithBLOBs(OcenterNewsDetail record);

    int updateByPrimaryKey(OcenterNewsDetail record);
}