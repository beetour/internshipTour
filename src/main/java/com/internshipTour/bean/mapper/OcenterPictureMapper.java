package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterPicture;
import com.internshipTour.bean.OcenterPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterPictureMapper {
    int countByExample(OcenterPictureExample example);

    int deleteByExample(OcenterPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterPicture record);

    int insertSelective(OcenterPicture record);

    List<OcenterPicture> selectByExample(OcenterPictureExample example);

    OcenterPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterPicture record, @Param("example") OcenterPictureExample example);

    int updateByExample(@Param("record") OcenterPicture record, @Param("example") OcenterPictureExample example);

    int updateByPrimaryKeySelective(OcenterPicture record);

    int updateByPrimaryKey(OcenterPicture record);
}