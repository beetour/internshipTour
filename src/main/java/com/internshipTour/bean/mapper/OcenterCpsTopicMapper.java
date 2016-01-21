package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterCpsTopic;
import com.internshipTour.bean.OcenterCpsTopicExample;
import com.internshipTour.bean.OcenterCpsTopicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterCpsTopicMapper {
    int countByExample(OcenterCpsTopicExample example);

    int deleteByExample(OcenterCpsTopicExample example);

    int deleteByPrimaryKey(Integer topId);

    int insert(OcenterCpsTopicWithBLOBs record);

    int insertSelective(OcenterCpsTopicWithBLOBs record);

    List<OcenterCpsTopicWithBLOBs> selectByExampleWithBLOBs(OcenterCpsTopicExample example);

    List<OcenterCpsTopic> selectByExample(OcenterCpsTopicExample example);

    OcenterCpsTopicWithBLOBs selectByPrimaryKey(Integer topId);

    int updateByExampleSelective(@Param("record") OcenterCpsTopicWithBLOBs record, @Param("example") OcenterCpsTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterCpsTopicWithBLOBs record, @Param("example") OcenterCpsTopicExample example);

    int updateByExample(@Param("record") OcenterCpsTopic record, @Param("example") OcenterCpsTopicExample example);

    int updateByPrimaryKeySelective(OcenterCpsTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OcenterCpsTopicWithBLOBs record);

    int updateByPrimaryKey(OcenterCpsTopic record);
}