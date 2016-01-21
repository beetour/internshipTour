package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterShixixiu;
import com.internshipTour.bean.OcenterShixixiuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterShixixiuMapper {
    int countByExample(OcenterShixixiuExample example);

    int deleteByExample(OcenterShixixiuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterShixixiu record);

    int insertSelective(OcenterShixixiu record);

    List<OcenterShixixiu> selectByExampleWithBLOBs(OcenterShixixiuExample example);

    List<OcenterShixixiu> selectByExample(OcenterShixixiuExample example);

    OcenterShixixiu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterShixixiu record, @Param("example") OcenterShixixiuExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterShixixiu record, @Param("example") OcenterShixixiuExample example);

    int updateByExample(@Param("record") OcenterShixixiu record, @Param("example") OcenterShixixiuExample example);

    int updateByPrimaryKeySelective(OcenterShixixiu record);

    int updateByPrimaryKeyWithBLOBs(OcenterShixixiu record);

    int updateByPrimaryKey(OcenterShixixiu record);
}