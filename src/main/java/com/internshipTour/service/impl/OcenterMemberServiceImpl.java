package com.internshipTour.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterMember;
import com.internshipTour.bean.mapper.OcenterMemberMapper;
import com.internshipTour.service.OcenterMemberService;


@Service("ocenterMemberService")
@Transactional
public class OcenterMemberServiceImpl extends BaseServiceImpl<OcenterMember> implements OcenterMemberService {
	
	@Autowired
	private OcenterMemberMapper ocenterMemberMapper;

	public void updateOcenterMember(OcenterMember ocenterMember) {
		ocenterMemberMapper.updateByPrimaryKeySelective(ocenterMember);
	}

	public OcenterMember findById(Integer uid) {
		return ocenterMemberMapper.selectByPrimaryKey(uid);
	}

	public void insertOcenterMember(OcenterMember ocenterMember) {
		int insertSelective = 0;
		try {					
			insertSelective = ocenterMemberMapper.insertSelective(ocenterMember);
		} catch (Exception e) {
			log.error("insertOcenterMember 操作出错\r\n" + e.getMessage());
		}
		if(insertSelective != 1){
			log.error("insertOcenterMember 出错");
		}
	}
	   
}
