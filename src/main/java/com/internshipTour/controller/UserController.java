package com.internshipTour.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.internshipTour.base.BaseController;
import com.internshipTour.bean.OcenterAvatar;
import com.internshipTour.dto.base.ReturnBean;
import com.internshipTour.enums.EnumRegisterStatus;
import com.internshipTour.enums.EnumResultCode;
import com.internshipTour.enums.ImgUploadStatus;
import com.internshipTour.enums.LoginResultStatus;
import com.internshipTour.requesrBean.Login;
import com.internshipTour.requesrBean.Register;
import com.internshipTour.requesrBean.UserImgPhoto;
import com.internshipTour.service.OcenterAvatarService;
import com.internshipTour.service.OcenterMemberService;
import com.internshipTour.service.OcenterUcenterMemberService;
import com.internshipTour.util.common.ImgUtil;
import com.internshipTour.util.common.IpUtils;
import com.internshipTour.util.common.JsonStr2Object;

@Controller
@RequestMapping(value = "/user/{userType}")
public class UserController extends BaseController {

	@Resource(name = "ocenterUcenterMemberService")
	OcenterUcenterMemberService ocenterUcenterMemberService;

	@Resource(name = "ocenterMemberService")
	OcenterMemberService ocenterMemberService;
	
	@Resource(name = "ocenterAvatarService")
	OcenterAvatarService ocenterAvatarService;
	
	/**
	 * 登录
	 * 
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/login")
	public ReturnBean login(HttpServletRequest request, @PathVariable String userType, @RequestParam String params) {
		Login login = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			login = JsonStr2Object.json2Bean(Login.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		if (login == null || StringUtils.isEmpty(login.getUsername()) || StringUtils.isEmpty(login.getPassword())) {
			log.error("用户名或密码为空!");
			map.put("msg", "用户名或密码为空!");
			map.put("status", LoginResultStatus.PARAMSISNULL.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		// 获取ip
		String ipAddr = IpUtils.getIpAddr(request);
		login.setIp(ipAddr);
		Map<String, Object> mapRet = ocenterUcenterMemberService.login(login);
		if (mapRet == null) {
			log.error("用户名或密码错误!");
			map.put("msg", "用户名或密码错误!");
			map.put("status", LoginResultStatus.USERNAMEPASSWORDMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		request.getSession().setAttribute("ocenterUcenterMember", mapRet.get("ocenterUcenterMember"));
		map.put("msg", mapRet);
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		returnBean.setResultMsg(map);
		return returnBean;
	}

	
	/**
	 * 上传头像
	 * @param request733.73
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/uploadUserPhoto")
	public ReturnBean uploadUserPhoto(HttpServletRequest request, @PathVariable String userType,
			@RequestParam String params) {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		MultipartFile mFile = multipartRequest.getFile("imgFile"); // 得到上传的文件
		Map<String, Object> map = new HashMap<String, Object>();
		UserImgPhoto userImgPhoto = null;
		try {
			userImgPhoto = JsonStr2Object.json2Bean(UserImgPhoto.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", LoginResultStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		String saveImgName = null;
		if (mFile != null) {// 若上传了图片
			try {
				if (mFile.getSize() > 524288) {
					log.error("图片大于524288!");
					map.put("msg", "图片大于524288");
					map.put("status", ImgUploadStatus.IMGBIG.getValue());
					returnBean.setResultMsg(map);
					returnBean.setResultCode(EnumResultCode.FAIL.toString());
					return returnBean;
				}
				OcenterAvatar ocenterAvatar = ocenterAvatarService.findByUid(userImgPhoto.getUid());
				String getpath = ocenterAvatar.getPath();
				if(getpath != null){					
					ImgUtil.deleteImg(ocenterAvatar.getPath(),userImgPhoto.getUid());
				}
				saveImgName = ImgUtil.saveImg(mFile,userImgPhoto.getUid());
			} catch (Exception e) {
				e.printStackTrace();
				log.error("头像存储出错!");
				map.put("msg", "头像存储出错");
				map.put("status", ImgUploadStatus.IMGSAVEFAIL.getValue());
				returnBean.setResultMsg(map);
				returnBean.setResultCode(EnumResultCode.FAIL.toString());
				return returnBean;
			}
			OcenterAvatar ocenterAvatar = ocenterAvatarService.update(userImgPhoto.getUid(),saveImgName);
			map.put("ocenterAvatar", ocenterAvatar);
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		}
		return returnBean;
	}
	
	/**
	 * 注册
	 * @param request
	 * @param userType
	 * @param params
	 * @return
	 */
	@RequestMapping("/register")
	public ReturnBean register(HttpServletRequest request, @PathVariable String userType,
			@RequestParam String params) {
		Map<String, Object> map = new HashMap<String, Object>();
		Register register = null;
		try {
			register = JsonStr2Object.json2Bean(Register.class, params);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("参数错误!");
			map.put("msg", "参数错误");
			map.put("status", EnumRegisterStatus.PARAMSMISTAKE.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		boolean checkEmail = ocenterUcenterMemberService.checkEmail(register.getUsername());
		if(!checkEmail){
			log.error("邮箱已存在");
			map.put("msg", "邮箱已存在");
			map.put("status", EnumRegisterStatus.EMAILEXIST.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		if(!register.getPassword().equals(register.getRepassword())){
			log.error("两次输入密码不一致!password=" + register.getPassword() + " repassword=" + register.getRepassword());
			map.put("msg", "两次输入密码不一致");
			map.put("status", EnumRegisterStatus.PASSWORDDIFFERENT.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		boolean checkNickname = ocenterUcenterMemberService.checkNickname(register.getNickname());
		if(!checkNickname){
			log.error("昵称已存在");
			map.put("msg", "昵称已存在");
			map.put("status", EnumRegisterStatus.NICKNAMEEXIST.getValue());
			returnBean.setResultMsg(map);
			returnBean.setResultCode(EnumResultCode.FAIL.toString());
			return returnBean;
		}
		String ipAddr = IpUtils.getIpAddr(request);
		register.setIp(ipAddr);
		ocenterUcenterMemberService.register(register);
		
		map.put("msg", "注册成功");
		returnBean.setResultCode(EnumResultCode.SUCCESS.toString());
		returnBean.setResultMsg(map);
		return returnBean;}
}
