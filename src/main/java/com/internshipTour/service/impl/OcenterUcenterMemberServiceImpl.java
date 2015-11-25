package com.internshipTour.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterAvatar;
import com.internshipTour.bean.OcenterMember;
import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.bean.mapper.OcenterMemberMapper;
import com.internshipTour.bean.mapper.OcenterUcenterMemberMapper;
import com.internshipTour.requesrBean.Login;
import com.internshipTour.requesrBean.Register;
import com.internshipTour.service.OcenterAvatarService;
import com.internshipTour.service.OcenterMemberService;
import com.internshipTour.service.OcenterUcenterMemberService;
import com.internshipTour.util.common.DateUtil;
import com.internshipTour.util.common.IPv4Util;
import com.internshipTour.util.common.SystemConf;


@Service("ocenterUcenterMemberService")
@Transactional
public class OcenterUcenterMemberServiceImpl extends BaseServiceImpl<OcenterUcenterMember> implements OcenterUcenterMemberService {
	
	@Autowired
	private OcenterUcenterMemberMapper ocenterUcenterMemberMapper;
	
	@Autowired
	private OcenterMemberMapper ocenterMemberMapper;
	
	@Resource(name = "ocenterMemberService")
	OcenterMemberService ocenterMemberService;
	
	@Resource(name = "ocenterAvatarService")
	OcenterAvatarService ocenterAvatarService;
	
	
	
	public Map<String, Object> login(Login login) {
		String username = login.getUsername();
		String password = login.getPassword();
		OcenterUcenterMember ocenterUcenterMember  = ocenterUcenterMemberMapper.selectByEmailAndPassword(username,password);		
		Map<String, Object> map = null;
		//更新登录ip和时间
		if(ocenterUcenterMember != null){
			map = new HashMap<String, Object>();
			map.put("ocenterUcenterMember", ocenterUcenterMember);
			OcenterUcenterMember record = new OcenterUcenterMember();
			Integer uid = ocenterUcenterMember.getId();
			record.setId(uid);
			String ip =login.getIp();
			long ipToInt = IPv4Util.ipToInt(ip);
			record.setLastLoginIp(ipToInt);
			Integer time = DateUtil.getIntTime();
			record.setLastLoginTime(time);
			record.setUpdateTime(time);
			//更新用户表
			ocenterUcenterMemberMapper.updateByPrimaryKeySelective(record);
			
			//获取会员表信息
			OcenterMember ocenterMember = ocenterMemberService.findById(uid);
			map.put("ocenterMember", ocenterMember);
			OcenterMember member = new OcenterMember();
			member.setUid(uid);
			member.setLogin(ocenterMember.getLogin() + 1);
			member.setLastLoginIp(ipToInt);
			member.setLastLoginTime(time);
			//更新会员表
			ocenterMemberService.updateOcenterMember(ocenterMember);
			
			
			//获取头像信息
			OcenterAvatar ocenterAvatar = ocenterAvatarService.findByUid(uid);
			if(ocenterAvatar != null){				
				if(!StringUtils.isEmpty(ocenterAvatar.getPath())){	
					ocenterAvatar.setPath(SystemConf.getServerIP() + SystemConf.getImgPath()+ ocenterAvatar.getPath());
				}
				map.put("ocenterAvatar", ocenterAvatar);
			} else {
				ocenterAvatar = new OcenterAvatar();
				ocenterAvatar.setPath(SystemConf.getServerIP() +"/Public/images/default_avatar.jpg");
				map.put("ocenterAvatar", ocenterAvatar);
			}
		}
		return map;
	}



	public boolean checkEmail(String email) {
		OcenterUcenterMember selectByEmail = ocenterUcenterMemberMapper.selectByEmail(email);
		if(selectByEmail == null){
			return true;
		}
		return false;
	}



	public void register(Register register) {
		OcenterUcenterMember record = new OcenterUcenterMember();
		record.setEmail(register.getUsername());
		record.setPassword(register.getPassword());
		record.setUsername(register.getNickname());
		String ip =register.getIp();
		long ipToInt = IPv4Util.ipToInt(ip);
		record.setRegIp(ipToInt);
		int time = DateUtil.getIntTime();
		record.setRegTime(time);
		record.setUpdateTime(time);
		record.setStatus((byte) 1);
		record.setType((byte) 3);
		ocenterUcenterMemberMapper.insertSelective(record);
		System.out.println();
		OcenterUcenterMember selectByEmailAndPassword = ocenterUcenterMemberMapper.selectByEmailAndPassword(register.getUsername(), register.getPassword());
		OcenterMember ocenterMember = new OcenterMember();
		ocenterMember.setUid(selectByEmailAndPassword.getId());
		ocenterMember.setNickname(register.getNickname());
		ocenterMember.setRegIp(ipToInt);
		ocenterMember.setRegTime(time);
		ocenterMember.setStatus((byte) 1);
		ocenterMember.setShowRole(1);
		ocenterMember.setLastLoginRole(1);
		ocenterMember.setScore1(10F);
		ocenterMember.setSignature("");
		ocenterMember.setPosCity(0);
		ocenterMember.setPosCommunity(0);
		ocenterMember.setPosDistrict(0);
		ocenterMember.setPosProvince(0);
		ocenterMemberService.insertOcenterMember(ocenterMember);
	}



	public boolean checkNickname(String nickname) {
		OcenterMember selectByNickname = ocenterMemberMapper.selectByNickname(nickname);
		if(selectByNickname == null){
			return true;
		}
		return false;
	}	   
}
