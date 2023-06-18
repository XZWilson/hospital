package com.g1.hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SysUsers {
    private Long id;

    private Long departmentId;

    private Byte userType;

    private String headUrl;

    private String account;

    private String userName;

    private String password;

    private String salt;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedTime;

    private Long createdUserId;

    private String userTypeName;

    public SysUsers() {
    }

    public SysUsers(Long id, Long departmentId, Byte userType, String headUrl, String account, String userName, String password, String salt, Date createdTime, Date updatedTime, Long createdUserId, String userTypeName) {
        this.id = id;
        this.departmentId = departmentId;
        this.userType = userType;
        this.headUrl = headUrl;
        this.account = account;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.createdUserId = createdUserId;
        this.userTypeName = userTypeName;
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
     * @return departmentId
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置
     * @param departmentId
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取
     * @return userType
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * 设置
     * @param userType
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * 获取
     * @return headUrl
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * 设置
     * @param headUrl
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    /**
     * 获取
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
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

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取
     * @return createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取
     * @return updatedTime
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取
     * @return createdUserId
     */
    public Long getCreatedUserId() {
        return createdUserId;
    }

    /**
     * 设置
     * @param createdUserId
     */
    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    /**
     * 获取
     * @return userTypeName
     */
    public String getUserTypeName() {
        return userTypeName;
    }

    /**
     * 设置
     * @param userTypeName
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String toString() {
        return "SysUsers{id = " + id + ", departmentId = " + departmentId + ", userType = " + userType + ", headUrl = " + headUrl + ", account = " + account + ", userName = " + userName + ", password = " + password + ", salt = " + salt + ", createdTime = " + createdTime + ", updatedTime = " + updatedTime + ", createdUserId = " + createdUserId + ", userTypeName = " + userTypeName + "}";
    }
}