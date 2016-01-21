package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterJob;
import com.internshipTour.bean.OcenterJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterJobMapper {
    int countByExample(OcenterJobExample example);

    int deleteByExample(OcenterJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterJob record);

    int insertSelective(OcenterJob record);

    List<OcenterJob> selectByExampleWithBLOBs(OcenterJobExample example);

    List<OcenterJob> selectByExample(OcenterJobExample example);

    OcenterJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterJob record, @Param("example") OcenterJobExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterJob record, @Param("example") OcenterJobExample example);

    int updateByExample(@Param("record") OcenterJob record, @Param("example") OcenterJobExample example);

    int updateByPrimaryKeySelective(OcenterJob record);

    int updateByPrimaryKeyWithBLOBs(OcenterJob record);

    int updateByPrimaryKey(OcenterJob record);
}