package com.g1.hospital.controller;

import com.g1.hospital.dto.RoomDto;
import com.g1.hospital.service.RoomService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/room/")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping("getRoomBySchedule")
    @ResponseBody
    public Result getRoomBySchedule(Long departmentId, Byte sign, Long userId){
        try {
            RoomDto roomBySch = this.roomService.getRoomBySchedule(departmentId, sign, userId);
            if (roomBySch != null){
                return new Result<RoomDto>("1","通过值班信息查询房间成功",roomBySch);
            }else{
                return new Result<>("0","通过值班信息查询房间失败");
            }
        } catch (Exception e) {
            return new Result<>("0","通过值班信息查询房间异常，原因：" + e.getMessage());
        }
    }
}
