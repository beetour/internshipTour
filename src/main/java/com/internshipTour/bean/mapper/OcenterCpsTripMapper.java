package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterCpsTrip;
import com.internshipTour.bean.OcenterCpsTripExample;
import com.internshipTour.bean.OcenterCpsTripWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterCpsTripMapper {
    int countByExample(OcenterCpsTripExample example);

    int deleteByExample(OcenterCpsTripExample example);

    int deleteByPrimaryKey(Integer tripId);

    int insert(OcenterCpsTripWithBLOBs record);

    int insertSelective(OcenterCpsTripWithBLOBs record);

    List<OcenterCpsTripWithBLOBs> selectByExampleWithBLOBs(OcenterCpsTripExample example);

    List<OcenterCpsTrip> selectByExample(OcenterCpsTripExample example);

    OcenterCpsTripWithBLOBs selectByPrimaryKey(Integer tripId);

    int updateByExampleSelective(@Param("record") OcenterCpsTripWithBLOBs record, @Param("example") OcenterCpsTripExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterCpsTripWithBLOBs record, @Param("example") OcenterCpsTripExample example);

    int updateByExample(@Param("record") OcenterCpsTrip record, @Param("example") OcenterCpsTripExample example);

    int updateByPrimaryKeySelective(OcenterCpsTripWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OcenterCpsTripWithBLOBs record);

    int updateByPrimaryKey(OcenterCpsTrip record);
}