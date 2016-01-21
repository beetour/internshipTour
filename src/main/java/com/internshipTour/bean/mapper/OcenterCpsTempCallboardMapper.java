package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterCpsTempCallboard;
import com.internshipTour.bean.OcenterCpsTempCallboardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterCpsTempCallboardMapper {
    int countByExample(OcenterCpsTempCallboardExample example);

    int deleteByExample(OcenterCpsTempCallboardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterCpsTempCallboard record);

    int insertSelective(OcenterCpsTempCallboard record);

    List<OcenterCpsTempCallboard> selectByExample(OcenterCpsTempCallboardExample example);

    OcenterCpsTempCallboard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterCpsTempCallboard record, @Param("example") OcenterCpsTempCallboardExample example);

    int updateByExample(@Param("record") OcenterCpsTempCallboard record, @Param("example") OcenterCpsTempCallboardExample example);

    int updateByPrimaryKeySelective(OcenterCpsTempCallboard record);

    int updateByPrimaryKey(OcenterCpsTempCallboard record);

	OcenterCpsTempCallboard selectByClassId(Integer classId);
}