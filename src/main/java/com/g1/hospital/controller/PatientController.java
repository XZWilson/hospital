package com.g1.hospital.controller;

import com.g1.hospital.pojo.Department;
import com.g1.hospital.pojo.Patient;
import com.g1.hospital.pojo.Schedule;
import com.g1.hospital.service.DepartmentService;
import com.g1.hospital.service.PatientService;
import com.g1.hospital.service.ScheduleService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/patient/")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * 添加就诊卡
     * @param patient
     * @return Result
     */
    @RequestMapping("addPatient")
    @ResponseBody
    public Result addPatient(@RequestBody Patient patient){
        //补全前端没有涉及的就诊卡信息
        //创建时间
        patient.setCreatedTime(new Date());
        //更新时间，首次与创建时间一致
        patient.setUpdatedTime(patient.getCreatedTime());
        //调用业务层方法执行添加操作，将执行结果返回前端
        try {
            if (this.patientService.addPatient(patient) > 0){
                return new Result("1","添加成功");
            }else{
                return new Result("0","添加失败");
            }
        } catch (Exception e) {
            return new Result("2","添加就诊卡异常，原因：" + e.getMessage());
        }
    }

    /**
     * @Description
     * 通过身份证号查询就诊卡信息
     * @Param [idCard]
     * @return com.g1.hospital.utils.Result
     * @Date 2023/6/16 8:21
     * @Author sugarmelon
     **/
    @RequestMapping("getPatByIdCard")
    @ResponseBody
    public Result getPatByIdCard(String idCard){
        //通过身份证号查询就诊卡信息
        Patient pa = this.patientService.getPatientByIdCard(idCard);
        //返回查询信息
        if (pa != null){
            return new Result<Patient>("1","就诊卡查询成功",pa);
        }else{
            return new Result("0","就诊卡查询失败");
        }
    }
}
