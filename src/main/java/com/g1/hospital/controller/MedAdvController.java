package com.g1.hospital.controller;

import com.g1.hospital.pojo.MedicalAdvice;
import com.g1.hospital.service.MedAdvService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/advice/")
public class MedAdvController {
    @Autowired
    private MedAdvService medAdvService;

    @PostMapping("addMdAdvice")
    @ResponseBody
    public Result addMdAdvice(@RequestBody MedicalAdvice advice){
        try {
            this.medAdvService.addAdvice(advice);
            return new Result("1",advice.getId()==null?"添加医嘱成功":"修改医嘱成功");
        } catch (Exception e) {
            return new Result("0",(advice.getId()==null?"添加医嘱失败":"修改医嘱失败")+
                    " 原因：" + e.getMessage());
        }
    }
}
