package com.g1.hospital.mapper;

import com.g1.hospital.pojo.PrescriptionDetail;
import com.g1.hospital.pojo.PrescriptionDetailExample;
import java.util.List;

public interface PrescriptionDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrescriptionDetail record);

    int insertSelective(PrescriptionDetail record);

    List<PrescriptionDetail> selectByExample(PrescriptionDetailExample example);

    PrescriptionDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrescriptionDetail record);

    int updateByPrimaryKey(PrescriptionDetail record);
}