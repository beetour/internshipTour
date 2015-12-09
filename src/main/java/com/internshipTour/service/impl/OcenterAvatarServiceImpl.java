package com.internshipTour.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.internshipTour.base.BaseServiceImpl;
import com.internshipTour.bean.OcenterAvatar;
import com.internshipTour.bean.mapper.OcenterAvatarMapper;
import com.internshipTour.service.OcenterAvatarService;
import com.internshipTour.util.common.DateUtil;
import com.internshipTour.util.common.SystemConf;

@Service("ocenterAvatarService")
@Transactional
public class OcenterAvatarServiceImpl extends BaseServiceImpl<OcenterAvatar> implements OcenterAvatarService {

	@Autowired
	private OcenterAvatarMapper ocenterAvatarMapper;

	public OcenterAvatar findByUid(Integer uid) {
		 OcenterAvatar ocenterAvatar = ocenterAvatarMapper.findByUid(uid);
		 if(ocenterAvatar == null){
			 	ocenterAvatar = new OcenterAvatar();
				ocenterAvatar.setUid(uid);
				ocenterAvatar.setCreateTime(DateUtil.getIntTime());
				ocenterAvatar.setIsTemp(0);
				ocenterAvatar.setDriver("local");
				ocenterAvatar.setStatus(1);
				ocenterAvatarMapper.insertSelective(ocenterAvatar);
		 }
		 return ocenterAvatar;
	}

	public OcenterAvatar update(Integer uid, String originalFilename) {
		String path = "/" +uid + "/"+  originalFilename;
		OcenterAvatar ocenterAvatar = null;
		ocenterAvatar = ocenterAvatarMapper.findByUid(uid);
		if (ocenterAvatar != null) {
			ocenterAvatar.setPath(path);
			ocenterAvatarMapper.updateByPrimaryKey(ocenterAvatar);
		} else {
			ocenterAvatar = new OcenterAvatar();
			ocenterAvatar.setUid(uid);
			ocenterAvatar.setCreateTime(DateUtil.getIntTime());
			ocenterAvatar.setPath(path);
			ocenterAvatar.setIsTemp(0);
			ocenterAvatar.setDriver("local");
			ocenterAvatar.setStatus(1);
			ocenterAvatarMapper.insertSelective(ocenterAvatar);
		}
		OcenterAvatar ocenterAvatar2 = ocenterAvatarMapper.findByUid(uid);
		if(!StringUtils.isEmpty(ocenterAvatar2.getPath())){	
			ocenterAvatar2.setPath(SystemConf.getServerIP() +SystemConf.getImgPath()+ ocenterAvatar2.getPath());

		}
		return ocenterAvatar2;
	}

}
