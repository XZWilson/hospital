package com.g1.hospital.mapper;

import com.g1.hospital.pojo.Patient;
import com.g1.hospital.pojo.PatientExample;
import java.util.List;

public interface PatientMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    Patient selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    Patient selectByIdCard(String idCard);
}