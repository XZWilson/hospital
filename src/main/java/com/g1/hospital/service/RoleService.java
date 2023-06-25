package com.g1.hospital.service;

import com.g1.hospital.pojo.SysRoles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<SysRoles> getAllRoles();
    List<Long> getRolesByUserId(Long userId);
}
