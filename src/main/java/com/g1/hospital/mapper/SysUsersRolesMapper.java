package com.g1.hospital.mapper;

import com.g1.hospital.pojo.SysUsersRoles;
import com.g1.hospital.pojo.SysUsersRolesExample;
import java.util.List;

public interface SysUsersRolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUsersRoles record);

    int insertSelective(SysUsersRoles record);

    List<SysUsersRoles> selectByExample(SysUsersRolesExample example);

    SysUsersRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUsersRoles record);

    int updateByPrimaryKey(SysUsersRoles record);

    List<Long> selectRoleIdByUserId(Long UserId);

    int deleteByUserId(Long userId);
}