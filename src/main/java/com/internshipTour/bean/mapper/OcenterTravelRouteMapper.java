package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterTravelRoute;
import com.internshipTour.bean.OcenterTravelRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterTravelRouteMapper {
    int countByExample(OcenterTravelRouteExample example);

    int deleteByExample(OcenterTravelRouteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterTravelRoute record);

    int insertSelective(OcenterTravelRoute record);

    List<OcenterTravelRoute> selectByExample(OcenterTravelRouteExample example);

    OcenterTravelRoute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterTravelRoute record, @Param("example") OcenterTravelRouteExample example);

    int updateByExample(@Param("record") OcenterTravelRoute record, @Param("example") OcenterTravelRouteExample example);

    int updateByPrimaryKeySelective(OcenterTravelRoute record);

    int updateByPrimaryKey(OcenterTravelRoute record);

	
}