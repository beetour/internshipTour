package com.internshipTour.service;

import com.internshipTour.base.BaseService;
import com.internshipTour.bean.OcenterAvatar;

public interface OcenterAvatarService extends BaseService<OcenterAvatar> {
	
	/**
	 * 根据uid查
	 * @param uid
	 * @return
	 */
	OcenterAvatar findByUid(Integer uid);
	
	/**
	 * 更新用户头像
	 * @param uid
	 * @param originalFilename
	 * @return
	 */
	OcenterAvatar update(Integer uid, String originalFilename);


}
