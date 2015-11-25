package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterTravelRouteList;
import com.internshipTour.bean.OcenterTravelRouteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterTravelRouteListMapper {
    int countByExample(OcenterTravelRouteListExample example);

    int deleteByExample(OcenterTravelRouteListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterTravelRouteList record);

    int insertSelective(OcenterTravelRouteList record);

    List<OcenterTravelRouteList> selectByExample(OcenterTravelRouteListExample example);

    OcenterTravelRouteList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterTravelRouteList record, @Param("example") OcenterTravelRouteListExample example);

    int updateByExample(@Param("record") OcenterTravelRouteList record, @Param("example") OcenterTravelRouteListExample example);

    int updateByPrimaryKeySelective(OcenterTravelRouteList record);

    int updateByPrimaryKey(OcenterTravelRouteList record);

	List<OcenterTravelRouteList> getAll(Integer id);
}