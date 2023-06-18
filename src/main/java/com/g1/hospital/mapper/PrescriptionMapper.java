package com.g1.hospital.mapper;

import com.g1.hospital.pojo.Prescription;
import com.g1.hospital.pojo.PrescriptionExample;
import java.util.List;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    List<Prescription> selectByExample(PrescriptionExample example);

    Prescription selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
}