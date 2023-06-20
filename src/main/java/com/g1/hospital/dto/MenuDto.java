package com.g1.hospital.dto;

import java.util.Date;
import java.util.List;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class MenuDto {
    private Long id;

    private String menuName;

    private String menuUrl;

    private Byte menuType;

    private Long parentId;

    private List<MenuDto> menuDtos;

    public MenuDto() {
    }

    public MenuDto(Long id, String menuName, String menuUrl, Byte menuType, Long parentId, List<MenuDto> menuDtos) {
        this.id = id;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuType = menuType;
        this.parentId = parentId;
        this.menuDtos = menuDtos;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取
     * @return menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 设置
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 获取
     * @return menuType
     */
    public Byte getMenuType() {
        return menuType;
    }

    /**
     * 设置
     * @param menuType
     */
    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
    }

    /**
     * 获取
     * @return parentId
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * @return menuDtos
     */
    public List<MenuDto> getMenuDtos() {
        return menuDtos;
    }

    /**
     * 设置
     * @param menuDtos
     */
    public void setMenuDtos(List<MenuDto> menuDtos) {
        this.menuDtos = menuDtos;
    }

    public String toString() {
        return "MenuDto{id = " + id + ", menuName = " + menuName + ", menuUrl = " + menuUrl + ", menuType = " + menuType + ", parentId = " + parentId + ", menuDtos = " + menuDtos + "}";
    }
}
