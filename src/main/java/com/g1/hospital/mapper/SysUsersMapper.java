package com.g1.hospital.mapper;

import com.g1.hospital.dto.UserDto;
import com.g1.hospital.pojo.SysUsers;
import com.g1.hospital.pojo.SysUsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    List<SysUsers> selectByExample(SysUsersExample example);

    SysUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);

    List<SysUsers> SelectSysUsersByPage();

    List<SysUsers> selectBySchedule(@Param("departmentId") Long departmentId,
                                    @Param("sign") Byte sign);

    List<UserDto> selectByDpIdAndType(@Param("departmentId") Long departmentId,
                                      @Param("userType") Byte userType);
}