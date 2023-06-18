package com.g1.hospital.service;

import com.g1.hospital.pojo.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
    List<Department> getDepartments();
}
