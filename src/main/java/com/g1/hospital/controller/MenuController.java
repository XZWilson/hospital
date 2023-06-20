package com.g1.hospital.controller;

import com.g1.hospital.dto.MenuDto;
import com.g1.hospital.service.MenuService;
import com.g1.hospital.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Controller
@RequestMapping("/menu/")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("getMenuByUId")
    @ResponseBody
    public Result getMenuByUId(Long uId){
        try {
            List<MenuDto> menus = this.menuService.getMainSubMenuByUId(uId);
            return new Result<List<MenuDto>>("1","通过用户id查询菜单权限成功",menus);
        } catch (Exception e) {
            return new Result<List<MenuDto>>("0","通过用户id查询菜单权限异常,原因：" + e.getMessage());
        }
    }
}
