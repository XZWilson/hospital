package com.g1.hospital.pojo;

import java.util.Date;

public class Schedule {
    private Long id;

    private Long userId;

    private Long departmentId;

    private Long roomId;

    private Byte sign;

    private Integer quantity;

    private Integer remainingQuantity;

    private Date inquiryTime;

    private Date createdTime;

    private Date updatedTime;

    public Schedule() {
    }

    public Schedule(Long id, Long userId, Long departmentId, Long roomId, Byte sign, Integer quantity, Integer remainingQuantity, Date inquiryTime, Date createdTime, Date updatedTime) {
        this.id = id;
        this.userId = userId;
        this.departmentId = departmentId;
        this.roomId = roomId;
        this.sign = sign;
        this.quantity = quantity;
        this.remainingQuantity = remainingQuantity;
        this.inquiryTime = inquiryTime;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
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
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * @return roomId
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取
     * @return sign
     */
    public Byte getSign() {
        return sign;
    }

    /**
     * 设置
     * @param sign
     */
    public void setSign(Byte sign) {
        this.sign = sign;
    }

    /**
     * 获取
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取
     * @return remainingQuantity
     */
    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * 设置
     * @param remainingQuantity
     */
    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    /**
     * 获取
     * @return inquiryTime
     */
    public Date getInquiryTime() {
        return inquiryTime;
    }

    /**
     * 设置
     * @param inquiryTime
     */
    public void setInquiryTime(Date inquiryTime) {
        this.inquiryTime = inquiryTime;
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

    public String toString() {
        return "Schedule{id = " + id + ", userId = " + userId + ", departmentId = " + departmentId + ", roomId = " + roomId + ", sign = " + sign + ", quantity = " + quantity + ", remainingQuantity = " + remainingQuantity + ", inquiryTime = " + inquiryTime + ", createdTime = " + createdTime + ", updatedTime = " + updatedTime + "}";
    }
}