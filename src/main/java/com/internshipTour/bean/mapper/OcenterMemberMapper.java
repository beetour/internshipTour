package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterMember;
import com.internshipTour.bean.OcenterMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterMemberMapper {
    int countByExample(OcenterMemberExample example);

    int deleteByExample(OcenterMemberExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(OcenterMember record);

    int insertSelective(OcenterMember record);

    List<OcenterMember> selectByExampleWithBLOBs(OcenterMemberExample example);

    List<OcenterMember> selectByExample(OcenterMemberExample example);

    OcenterMember selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") OcenterMember record, @Param("example") OcenterMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterMember record, @Param("example") OcenterMemberExample example);

    int updateByExample(@Param("record") OcenterMember record, @Param("example") OcenterMemberExample example);

    int updateByPrimaryKeySelective(OcenterMember record);

    int updateByPrimaryKeyWithBLOBs(OcenterMember record);

    int updateByPrimaryKey(OcenterMember record);
    
    OcenterMember selectByNickname(String nickname);
}