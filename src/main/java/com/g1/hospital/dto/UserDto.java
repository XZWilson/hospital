package com.g1.hospital.dto;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class UserDto {
    private Long id;
    private String userName;

    public UserDto() {
    }

    public UserDto(Long id, String userName) {
        this.id = id;
        this.userName = userName;
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
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString() {
        return "UserDto{id = " + id + ", userName = " + userName + "}";
    }
}
