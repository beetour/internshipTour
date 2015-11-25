package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.bean.OcenterUcenterMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterUcenterMemberMapper {
    int countByExample(OcenterUcenterMemberExample example);

    int deleteByExample(OcenterUcenterMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterUcenterMember record);

    int insertSelective(OcenterUcenterMember record);

    List<OcenterUcenterMember> selectByExample(OcenterUcenterMemberExample example);

    OcenterUcenterMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterUcenterMember record, @Param("example") OcenterUcenterMemberExample example);

    int updateByExample(@Param("record") OcenterUcenterMember record, @Param("example") OcenterUcenterMemberExample example);

    int updateByPrimaryKeySelective(OcenterUcenterMember record);

    int updateByPrimaryKey(OcenterUcenterMember record);
    
    /**
     * 根据用户名或邮箱 密码查询
     * @param username
     * @param password
     * @return
     */
	OcenterUcenterMember selectByEmailAndPassword(String username, String password);
	
	/**
	 * 根据邮箱查
	 * @param email
	 * @return
	 */
	OcenterUcenterMember selectByEmail(String email);
}