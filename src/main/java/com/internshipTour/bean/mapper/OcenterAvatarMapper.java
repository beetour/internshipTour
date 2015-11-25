package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterAvatar;
import com.internshipTour.bean.OcenterAvatarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterAvatarMapper {
    int countByExample(OcenterAvatarExample example);

    int deleteByExample(OcenterAvatarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterAvatar record);

    int insertSelective(OcenterAvatar record);

    List<OcenterAvatar> selectByExample(OcenterAvatarExample example);

    OcenterAvatar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterAvatar record, @Param("example") OcenterAvatarExample example);

    int updateByExample(@Param("record") OcenterAvatar record, @Param("example") OcenterAvatarExample example);

    int updateByPrimaryKeySelective(OcenterAvatar record);

    int updateByPrimaryKey(OcenterAvatar record);
    
    /**
     * 根据uid查
     * @param uid
     * @return
     */
	OcenterAvatar findByUid(Integer uid);
}