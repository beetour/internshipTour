package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterConfig;
import com.internshipTour.bean.OcenterConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterConfigMapper {
    int countByExample(OcenterConfigExample example);

    int deleteByExample(OcenterConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OcenterConfig record);

    int insertSelective(OcenterConfig record);

    List<OcenterConfig> selectByExampleWithBLOBs(OcenterConfigExample example);

    List<OcenterConfig> selectByExample(OcenterConfigExample example);

    OcenterConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OcenterConfig record, @Param("example") OcenterConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") OcenterConfig record, @Param("example") OcenterConfigExample example);

    int updateByExample(@Param("record") OcenterConfig record, @Param("example") OcenterConfigExample example);

    int updateByPrimaryKeySelective(OcenterConfig record);

    int updateByPrimaryKeyWithBLOBs(OcenterConfig record);

    int updateByPrimaryKey(OcenterConfig record);
    
    /**
     * 根据name查
     * @param string
     * @return
     */
	OcenterConfig selectByName(String string);
}