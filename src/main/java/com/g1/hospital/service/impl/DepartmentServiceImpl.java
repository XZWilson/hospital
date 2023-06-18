package com.g1.hospital.service.impl;

import com.g1.hospital.mapper.DepartmentMapper;
import com.g1.hospital.pojo.Department;
import com.g1.hospital.pojo.DepartmentExample;
import com.g1.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return this.departmentMapper.selectByExample(new DepartmentExample());
    }
}
