package com.internshipTour.service;

import java.util.Map;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterUcenterMember;
import com.internshipTour.requesrBean.Login;
import com.internshipTour.requesrBean.Register;

public interface OcenterUcenterMemberService extends BaseService<OcenterUcenterMember> {

	/**
	 * 登录
	 * @param login
	 * @return
	 */
	Map<String, Object> login(Login login);
	
	/**
	 * 检查邮箱
	 * @param email
	 * @return
	 */
	boolean checkEmail(String email);
	
	/**
	 * 注册
	 * @param register
	 */
	boolean register(Register register);
	
	/**
	 * 检查昵称
	 * @param nickname
	 * @return
	 */
	boolean checkNickname(String nickname);

}
