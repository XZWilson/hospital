package com.g1.hospital.mapper;

import com.g1.hospital.pojo.Drug;
import com.g1.hospital.pojo.DrugExample;
import java.util.List;

public interface DrugMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Drug record);

    int insertSelective(Drug record);

    List<Drug> selectByExample(DrugExample example);

    Drug selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
}