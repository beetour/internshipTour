package com.internshipTour.bean.mapper;

import com.internshipTour.bean.OcenterCpsCatalog;
import com.internshipTour.bean.OcenterCpsCatalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OcenterCpsCatalogMapper {
    int countByExample(OcenterCpsCatalogExample example);

    int deleteByExample(OcenterCpsCatalogExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(OcenterCpsCatalog record);

    int insertSelective(OcenterCpsCatalog record);

    List<OcenterCpsCatalog> selectByExample(OcenterCpsCatalogExample example);

    OcenterCpsCatalog selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") OcenterCpsCatalog record, @Param("example") OcenterCpsCatalogExample example);

    int updateByExample(@Param("record") OcenterCpsCatalog record, @Param("example") OcenterCpsCatalogExample example);

    int updateByPrimaryKeySelective(OcenterCpsCatalog record);

    int updateByPrimaryKey(OcenterCpsCatalog record);

	OcenterCpsCatalog getInternshipData(int catalogType);
}