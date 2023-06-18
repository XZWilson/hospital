package com.g1.hospital.controller;

import com.g1.hospital.service.ScheduleService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/schedule/")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping("getScheduleIdByReg")
    @ResponseBody
    public Result getScheduleIdByReg(Long departmentId, Byte sign, Long userId, Long roomId){
        Long scheduleId = this.scheduleService.getScheduleId(departmentId, sign, userId, roomId);
        if (scheduleId != null && scheduleId > 0){
            return new Result<Long>("1","通过挂号查询排班号成功",scheduleId);
        }else{
            return new Result("0","通过挂号查询排班号失败");
        }
    }
}
