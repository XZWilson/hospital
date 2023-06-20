package com.g1.hospital.service;

import com.g1.hospital.dto.MenuDto;

import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public interface MenuService {
    List<MenuDto> getMainSubMenuByUId(Long uId);
}
