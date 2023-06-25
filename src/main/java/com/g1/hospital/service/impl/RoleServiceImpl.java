package com.g1.hospital.service.impl;

import com.g1.hospital.mapper.SysRolesMapper;
import com.g1.hospital.mapper.SysUsersRolesMapper;
import com.g1.hospital.pojo.SysRoles;
import com.g1.hospital.pojo.SysRolesExample;
import com.g1.hospital.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private SysRolesMapper sysRolesMapper;
    @Autowired
    private SysUsersRolesMapper sysUsersRolesMapper;

    @Override
    public List<SysRoles> getAllRoles() {
        return sysRolesMapper.selectByExample(new SysRolesExample());
    }

    @Override
    public List<Long> getRolesByUserId(Long userId) {
        return sysUsersRolesMapper.selectRoleIdByUserId(userId);
    }
}
