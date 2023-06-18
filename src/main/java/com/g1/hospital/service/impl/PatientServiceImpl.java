package com.g1.hospital.service.impl;

import com.g1.hospital.mapper.PatientMapper;
import com.g1.hospital.pojo.Patient;
import com.g1.hospital.service.PatientService;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<Patient> getPatients(PageParameter pageParameter) {
        //开启分页
        PageHelper.startPage(pageParameter.getPageIndex(), pageParameter.getPageIndex());
        //调用可持续操作查询分页数据

        //创建并返回pageInfo对象
        return null;
    }

    @Override
    public Patient getPatientByIdCard(String idCard) {
        return this.patientMapper.selectByIdCard(idCard);
    }

    @Override
    public int addPatient(Patient patient) {
        return this.patientMapper.insertSelective(patient);
    }
}
