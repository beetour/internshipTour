package com.internshipTour.service;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterMember;

public interface OcenterMemberService extends BaseService<OcenterMember> {
	
	/**
	 * 更新会员表
	 * @param ocenterMember
	 */
	void updateOcenterMember(OcenterMember ocenterMember);
	
	/**
	 * 根据id查
	 * @param uid
	 * @return
	 */
	OcenterMember findById(Integer uid);

	/**
	 * 创建会员账户
	 * @param ocenterMember
	 */
	void insertOcenterMember(OcenterMember ocenterMember);


}
