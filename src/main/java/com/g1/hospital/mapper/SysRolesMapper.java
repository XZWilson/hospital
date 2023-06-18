package com.g1.hospital.mapper;

import com.g1.hospital.pojo.SysRoles;
import com.g1.hospital.pojo.SysRolesExample;
import java.util.List;

public interface SysRolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoles record);

    int insertSelective(SysRoles record);

    List<SysRoles> selectByExample(SysRolesExample example);

    SysRoles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRoles record);

    int updateByPrimaryKey(SysRoles record);
}