package com.g1.hospital.controller;

import com.g1.hospital.pojo.Department;
import com.g1.hospital.service.DepartmentService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/department/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /**
     * @Description //TODO
     * 获取就诊科室信息
     * @Param []
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/13 18:15
     * @Author sugarmelon
     **/
    @RequestMapping("getDepartments")
    @ResponseBody
    public Result getDepartments(){
        List<Department> departments = this.departmentService.getDepartments();
        if (departments != null){
            return new Result<>("1","就诊科室查询成功",departments);
        }else{
            return new Result<>("0","就诊科室查询失败");
        }
    }
}
