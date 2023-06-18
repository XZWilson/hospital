package com.g1.hospital.controller;

import com.g1.hospital.dto.RegCondition;
import com.g1.hospital.dto.RegDetailDto;
import com.g1.hospital.dto.RegistryDto;
import com.g1.hospital.pojo.Department;
import com.g1.hospital.pojo.Patient;
import com.g1.hospital.pojo.Registry;
import com.g1.hospital.pojo.Schedule;
import com.g1.hospital.service.DepartmentService;
import com.g1.hospital.service.PatientService;
import com.g1.hospital.service.RegistryService;
import com.g1.hospital.service.ScheduleService;
import com.g1.hospital.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/registry/")
public class RegistryController {
    @Autowired
    private RegistryService registryService;

    @RequestMapping("addRegistry")
    @ResponseBody
    public Result addRegistry(@RequestBody Registry registry){
        registry.setRegistryTime(new Date());
        registry.setCreatedTime(registry.getRegistryTime());
        registry.setUpdatedTime(registry.getRegistryTime());
        Integer ret = 0;
        try {
            ret = this.registryService.addRegistry(registry);
            if (ret > 0){
                return new Result("1", "添加挂号信息成功");
            }else{
                return new Result("0", "添加挂号信息失败");
            }
        } catch (Exception e) {
            return new Result("0", "添加挂号信息异常,原因：" + e.getMessage());
        }
    }

    @RequestMapping("searchByConAndPage")
    @ResponseBody
    public Result searchByConAndPage(@RequestBody RegCondition regCondition){
        Map<String,Object> map = new HashMap<>();
        try {
            PageInfo<RegistryDto> pageInfo = this.registryService.searchRegistry(regCondition);
            map.put("list",pageInfo.getList());
            map.put("total",pageInfo.getTotal());
            return new Result<Map<String,Object>>("1","分页查询挂号信息成功",map);
        } catch (Exception e) {
            return new Result("0","分页查询挂号信息异常，原因：" + e.getMessage());
        }
    }

    @RequestMapping("regDetailById")
    @ResponseBody
    public Result regDetailById(Long id){
        try {
            return new Result<RegDetailDto>("1",
                                             "查询挂号详情成功",
                                                  this.registryService.searchRegDetailById(id));
        } catch (Exception e) {
            return new Result("0","查询挂号详情异常，原因：" + e.getMessage());
        }
    }
}
