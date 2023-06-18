package com.g1.hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Registry {
    private Long id;

    private Long patientId;

    private Long scheduleId;

    private Long userId;

    private Long departmentId;

    private Long roomId;

    private Byte status;

    private BigDecimal fee;

    private BigDecimal payFee;

    private BigDecimal medicareFee;

    private Byte isMedicare;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date registryTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date consultationTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatedTime;

    public Registry() {
    }


    public Registry(Long id, Long patientId, Long scheduleId, Long userId, Long departmentId, Long roomId, Byte status, BigDecimal fee, BigDecimal payFee, BigDecimal medicareFee, Byte isMedicare, Date registryTime, Date consultationTime, Date createdTime, Date updatedTime) {
        this.id = id;
        this.patientId = patientId;
        this.scheduleId = scheduleId;
        this.userId = userId;
        this.departmentId = departmentId;
        this.roomId = roomId;
        this.status = status;
        this.fee = fee;
        this.payFee = payFee;
        this.medicareFee = medicareFee;
        this.isMedicare = isMedicare;
        this.registryTime = registryTime;
        this.consultationTime = consultationTime;
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
     * @return patientId
     */
    public Long getPatientId() {
        return patientId;
    }

    /**
     * 设置
     * @param patientId
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * 获取
     * @return scheduleId
     */
    public Long getScheduleId() {
        return scheduleId;
    }

    /**
     * 设置
     * @param scheduleId
     */
    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
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
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取
     * @return fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置
     * @param fee
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取
     * @return payFee
     */
    public BigDecimal getPayFee() {
        return payFee;
    }

    /**
     * 设置
     * @param payFee
     */
    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    /**
     * 获取
     * @return medicareFee
     */
    public BigDecimal getMedicareFee() {
        return medicareFee;
    }

    /**
     * 设置
     * @param medicareFee
     */
    public void setMedicareFee(BigDecimal medicareFee) {
        this.medicareFee = medicareFee;
    }

    /**
     * 获取
     * @return isMedicare
     */
    public Byte getIsMedicare() {
        return isMedicare;
    }

    /**
     * 设置
     * @param isMedicare
     */
    public void setIsMedicare(Byte isMedicare) {
        this.isMedicare = isMedicare;
    }

    /**
     * 获取
     * @return registryTime
     */
    public Date getRegistryTime() {
        return registryTime;
    }

    /**
     * 设置
     * @param registryTime
     */
    public void setRegistryTime(Date registryTime) {
        this.registryTime = registryTime;
    }

    /**
     * 获取
     * @return consultationTime
     */
    public Date getConsultationTime() {
        return consultationTime;
    }

    /**
     * 设置
     * @param consultationTime
     */
    public void setConsultationTime(Date consultationTime) {
        this.consultationTime = consultationTime;
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
        return "Registry{id = " + id + ", patientId = " + patientId + ", scheduleId = " + scheduleId + ", userId = " + userId + ", departmentId = " + departmentId + ", roomId = " + roomId + ", status = " + status + ", fee = " + fee + ", payFee = " + payFee + ", medicareFee = " + medicareFee + ", isMedicare = " + isMedicare + ", registryTime = " + registryTime + ", consultationTime = " + consultationTime + ", createdTime = " + createdTime + ", updatedTime = " + updatedTime + "}";
    }
}