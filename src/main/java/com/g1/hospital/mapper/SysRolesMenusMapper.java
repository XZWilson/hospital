package com.g1.hospital.mapper;

import com.g1.hospital.pojo.SysRolesMenus;
import com.g1.hospital.pojo.SysRolesMenusExample;
import java.util.List;

public interface SysRolesMenusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolesMenus record);

    int insertSelective(SysRolesMenus record);

    List<SysRolesMenus> selectByExample(SysRolesMenusExample example);

    SysRolesMenus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolesMenus record);

    int updateByPrimaryKey(SysRolesMenus record);
}