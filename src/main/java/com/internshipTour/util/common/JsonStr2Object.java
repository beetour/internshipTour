package com.internshipTour.util.common;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;

public class JsonStr2Object {
	

	public static <T>  T json2Bean(Class<T> clz,String jsonStr) throws Exception{
		if(SystemConf.getEnvironment().equals("formal")){
			jsonStr=Base64.decode(jsonStr);
		}
		if (StringUtils.isEmpty(jsonStr)) {
			return null;
		}
		return   JSON.parseObject(jsonStr,clz);//将建json对象转换为对象  
	}


}
