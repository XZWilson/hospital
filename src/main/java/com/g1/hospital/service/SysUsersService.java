package com.g1.hospital.service;

import com.g1.hospital.dto.UserDto;
import com.g1.hospital.pojo.SysUsers;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysUsersService {
    public SysUsers checkLogin(String account,String password);
    public PageInfo<SysUsers> getSysUsers(PageParameter pageParameter);
    public int addSysUser(SysUsers sysUsers);
    public List<SysUsers> getUsersBySchedule(Long departmentId, Byte sign);
    List<UserDto> getDoctorByDepartment(Long departmentId,Byte userType);
}
