package com.g1.hospital.service.impl;

import com.g1.hospital.dto.UserDto;
import com.g1.hospital.mapper.SysUsersMapper;
import com.g1.hospital.pojo.SysUsers;
import com.g1.hospital.pojo.SysUsersExample;
import com.g1.hospital.service.SysUsersService;
import com.g1.hospital.utils.MD5Utils;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
@Transactional
public class SysUsersServiceImpl implements SysUsersService {
    @Autowired
    private SysUsersMapper sysUsersMapper;
    /***
     * @Description //TODO 
     * 
     * @Param [account, password]
     * @return com.g1.hospital.pojo.SysUsers
     * @Date 2023/6/11 15:25
     * @Author sugarmelon
     **/
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public SysUsers checkLogin(String account, String password) {
        SysUsersExample sysUsersExample = new SysUsersExample();

        SysUsersExample.Criteria criteria = sysUsersExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(MD5Utils.md5Encrypt(password));

        List<SysUsers> sysUsers = this.sysUsersMapper.selectByExample(sysUsersExample);

        if (sysUsers != null && sysUsers.size()==1){
            return sysUsers.get(0);
        }
        return null;
    }
    
    /***
     * @Description //TODO 
     * 
     * @Param [pageParameter]
     * @return com.github.pagehelper.PageInfo<com.g1.hospital.pojo.SysUsers>
     * @Date 2023/6/11 10:16
     * @Author sugarmelon
     **/
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<SysUsers> getSysUsers(PageParameter pageParameter) {
        //开启分页
        PageHelper.startPage(pageParameter.getPageIndex(), pageParameter.getPageSize());
        //调用mapper持续化操作查询出当前页结果
        List<SysUsers> sysUsers = this.sysUsersMapper.SelectSysUsersByPage();
        //定义PageInfo对象，并将查询结果返回给该对象的list属性
        PageInfo<SysUsers> sysUsersPageInfo = new PageInfo<>(sysUsers);
        //返回PageInfo对象
        return sysUsersPageInfo;
    }
    /**
     * @Description //TODO 
     * 
     * @Param [sysUsers]
     * @return int
     * @Date 2023/6/16 15:57
     * @Author sugarmelon
     **/
    @Override
    public int addSysUser(SysUsers sysUsers) {
        return this.sysUsersMapper.insertSelective(sysUsers);
    }

    
    /***
     * @Description //TODO 
     * 
     * @Param [id]
     * @return com.g1.hospital.pojo.SysUsers
     * @Date 2023/6/21 8:26
     * @Author sugarmelon
     **/
    @Override
    public SysUsers getUserById(Long id) {
        return this.sysUsersMapper.selectByPrimaryKey(id);
    }

    /**
     * @Description //TODO 
     * 
     * @Param [departmentId, sign]
     * @return java.util.List<com.g1.hospital.pojo.SysUsers>
     * @Date 2023/6/16 15:57
     * @Author sugarmelon
     **/
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public List<SysUsers> getUsersBySchedule(Long departmentId, Byte sign) {
        return this.sysUsersMapper.selectBySchedule(departmentId, sign);
    }
    
    /**
     * @Description //TODO 
     * 
     * @Param [departmentId]
     * @return java.util.List<com.g1.hospital.dto.UserDto>
     * @Date 2023/6/16 15:57
     * @Author sugarmelon
     **/
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Override
    public List<UserDto> getDoctorByDepartment(Long departmentId, Byte userType) {
        return this.sysUsersMapper.selectByDpIdAndType(departmentId, userType);
    }
}
