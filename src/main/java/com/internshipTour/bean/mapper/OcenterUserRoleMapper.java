package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterUserRole;
import com.internshipTour.bean.OcenterUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterUserRoleMapper {
    int countByExample(OcenterUserRoleExample example);

    int deleteByExample(OcenterUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterUserRole record);

    int insertSelective(OcenterUserRole record);

    List<OcenterUserRole> selectByExample(OcenterUserRoleExample example);

    OcenterUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterUserRole record, @Param("example") OcenterUserRoleExample example);

    int updateByExample(@Param("record") OcenterUserRole record, @Param("example") OcenterUserRoleExample example);

    int updateByPrimaryKeySelective(OcenterUserRole record);

    int updateByPrimaryKey(OcenterUserRole record);
}