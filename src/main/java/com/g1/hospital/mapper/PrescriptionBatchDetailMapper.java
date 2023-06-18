package com.g1.hospital.mapper;

import com.g1.hospital.pojo.PrescriptionBatchDetail;
import com.g1.hospital.pojo.PrescriptionBatchDetailExample;
import java.util.List;

public interface PrescriptionBatchDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrescriptionBatchDetail record);

    int insertSelective(PrescriptionBatchDetail record);

    List<PrescriptionBatchDetail> selectByExample(PrescriptionBatchDetailExample example);

    PrescriptionBatchDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrescriptionBatchDetail record);

    int updateByPrimaryKey(PrescriptionBatchDetail record);
}