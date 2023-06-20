package com.g1.hospital.service.impl;

import com.g1.hospital.dto.MenuDto;
import com.g1.hospital.mapper.SysMenusMapper;
import com.g1.hospital.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private SysMenusMapper menusMapper;

    @Override
    public List<MenuDto> getMainSubMenuByUId(Long uId) {
        return this.menusMapper.selectByUId(uId);
    }
}
