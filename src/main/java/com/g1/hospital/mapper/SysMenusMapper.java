package com.g1.hospital.mapper;

import com.g1.hospital.pojo.SysMenus;
import com.g1.hospital.pojo.SysMenusExample;
import java.util.List;

public interface SysMenusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysMenus record);

    int insertSelective(SysMenus record);

    List<SysMenus> selectByExample(SysMenusExample example);

    SysMenus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysMenus record);

    int updateByPrimaryKey(SysMenus record);
}