package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterJobEnus;
import com.internshipTour.bean.OcenterJobEnusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterJobEnusMapper {
    int countByExample(OcenterJobEnusExample example);

    int deleteByExample(OcenterJobEnusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterJobEnus record);

    int insertSelective(OcenterJobEnus record);

    List<OcenterJobEnus> selectByExampleWithBLOBs(OcenterJobEnusExample example);

    List<OcenterJobEnus> selectByExample(OcenterJobEnusExample example);

    OcenterJobEnus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterJobEnus record, @Param("example") OcenterJobEnusExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterJobEnus record, @Param("example") OcenterJobEnusExample example);

    int updateByExample(@Param("record") OcenterJobEnus record, @Param("example") OcenterJobEnusExample example);

    int updateByPrimaryKeySelective(OcenterJobEnus record);

    int updateByPrimaryKeyWithBLOBs(OcenterJobEnus record);

    int updateByPrimaryKey(OcenterJobEnus record);

	OcenterJobEnus selectByJid(Integer id);
}