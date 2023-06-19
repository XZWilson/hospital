package com.g1.hospital.controller;

import com.g1.hospital.dto.UserDto;
import com.g1.hospital.pojo.SysUsers;
import com.g1.hospital.service.SysUsersService;
import com.g1.hospital.utils.MD5Utils;
import com.g1.hospital.utils.OssFileUpload;
import com.g1.hospital.utils.PageParameter;
import com.g1.hospital.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/users/")
public class SysUsersController {
    @Autowired
    private SysUsersService sysUsersService;

    /***
     * @Description //TODO 
     * 
     * @Param [account, password, session]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/11 11:18
     * @Author sugarmelon
     **/
    @RequestMapping("checkLogin")
    @ResponseBody
    public Result checkLogin(String account, String password, HttpSession session){
        SysUsers sysUsers = this.sysUsersService.checkLogin(account, password);
        if (sysUsers != null){
            sysUsers.setPassword("");
            session.setAttribute("sysUser",sysUsers);
            session.setMaxInactiveInterval(18000);
            return new Result<SysUsers>("1000","登录成功",sysUsers);
        }else{
            return new Result("1001","登录失败");
        }
    }

    /***
     * @Description //TODO 
     * 
     * @Param [pageParameter]
     * @return com.g1.hospital.utils.Result<java.util.HashMap<java.lang.String,java.lang.Object>>
     * @Date 2023/6/12 16:21
     * @Author sugarmelon
     **/
    @RequestMapping("showSysUsersByPage")
    @ResponseBody
    public Result<HashMap<String, Object>> showSysUsersByPage(PageParameter pageParameter){
        //调用服务层分页方法，返回包含当前分页数据和分页信息的pageinfo对象
        PageInfo<SysUsers> sysUsers = this.sysUsersService.getSysUsers(pageParameter);
        //但前端只需要当前页数据和总条数,不需要其他数据，所以用map集合的键值对返回
        HashMap<String, Object> returnMap = new HashMap<>();
        returnMap.put("sysUsers",sysUsers.getList());
        returnMap.put("totalRecord",sysUsers.getTotal());
        return new Result<>("1000","分页查询用户信息成功",returnMap);
    }

    /***
     * @Description //TODO
     *
     * @Param [sysUsers]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/12 15:19
     * @Author sugarmelon
     **/
    @RequestMapping("addUser")
    @ResponseBody
    public Result addUser(@RequestBody SysUsers sysUsers){
        //创建用户信息时间
        sysUsers.setCreatedTime(new Date());
        //更新用户信息时间，第一次也算更新，
        sysUsers.setUpdatedTime(sysUsers.getCreatedTime());
        //密码加密
        sysUsers.setPassword(MD5Utils.md5Encrypt(sysUsers.getPassword()));
        //创建用户信息的id从session取
        sysUsers.setCreatedUserId(new Long(1));
        try {
            if(this.sysUsersService.addSysUser(sysUsers) > 0){
                return new Result("1","添加成功");
            }else{
                return new Result("0","添加失败！");
            }
        } catch (Exception e) {
            return new Result("0","添加异常，原因：" + e.getMessage());
        }
    }

    /***
     * @Description //TODO 
     * 
     * @Param [file]
     * @return com.g1.hospital.utils.Result<java.lang.String>
     * @Date 2023/6/12 16:21
     * @Author sugarmelon
     **/
    @RequestMapping("uploadPic")
    @ResponseBody
    public Result<String> uploadPic(@RequestParam(value = "file", required = false)CommonsMultipartFile file){
        //获取文件名称的拓展名
        String exName =  file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //获取当前时间戳，和拓展名生成唯一标识的文件名
        String uniFileName = System.currentTimeMillis() + exName;
        //然后调用文件上传方法将图片文件上传至Oss服务器
        String path = null;
        try {
            path = OssFileUpload.upload_File(uniFileName, file.getInputStream());
        } catch (IOException e) {
            return new Result<>("0","文件上传失败,原因："+ e.getMessage());
        }
        //上传成功附加返回图片在Oss服务器的访问路径，用于后面保存在数据库表
        return new Result<>("1","文件上传成功！",path);
    }
    
    /***
     * @Description //TODO 
     * 
     * @Param [session]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/12 19:35
     * @Author sugarmelon
     **/
    @RequestMapping("logout")
    @ResponseBody
    public Result logout(HttpSession session){
        try {
            if (session.getAttribute("sysUser") != null){
                session.removeAttribute("sysUser");
                return new Result("1","session清除成功！");
            }
        } catch (Exception e) {
            return new Result("0","session清除失败！失败原因："+e.getMessage());
        }

        return new Result("1002","无session清除");
    }

    /***
     * @Description
     * 通过就诊科室和时间段查询值班医生信息
     * @Param [departmentId, sign]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/13 18:14
     * @Author sugarmelon
     **/
    @RequestMapping("getDoctorInfo")
    @ResponseBody
    public Result getDoctorInfo(Long departmentId, Byte sign){
        List<SysUsers> docInfo = this.sysUsersService.getUsersBySchedule(departmentId, sign);
        if (docInfo != null){
            return new Result<>("1","值班医生查询成功",docInfo);
        }else{
            return new Result<>("0","值班医生查询失败");
        }
    }
    
    /**
     * @Description //TODO 
     * 
     * @Param [departmentId]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/16 16:10
     * @Author sugarmelon
     **/
    @RequestMapping("getDoctorByDpIdAndType")
    @ResponseBody
    public Result getDoctorByDpIdAndType(Long departmentId, Byte userType, HttpSession session){
        try {
            List<UserDto> doctors = this.sysUsersService.getDoctorByDepartment(departmentId, userType);
            return new Result<List<UserDto>>("1","通过就诊科室查询医师成功",doctors);
        } catch (Exception e) {
            return new Result("0","通过就诊科室查询医师异常，原因是：" + e.getMessage());
        }
    }
}
