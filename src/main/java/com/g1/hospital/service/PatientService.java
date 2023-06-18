package com.g1.hospital.service;

import com.g1.hospital.pojo.Patient;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface PatientService {
    PageInfo<Patient> getPatients(PageParameter pageParameter);
    Patient getPatientByIdCard(String idCard);
    int addPatient(Patient patient);
}
