package com.g1.hospital.mapper;

import com.g1.hospital.pojo.DrugBatch;
import com.g1.hospital.pojo.DrugBatchExample;
import java.util.List;

public interface DrugBatchMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugBatch record);

    int insertSelective(DrugBatch record);

    List<DrugBatch> selectByExample(DrugBatchExample example);

    DrugBatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugBatch record);

    int updateByPrimaryKey(DrugBatch record);
}