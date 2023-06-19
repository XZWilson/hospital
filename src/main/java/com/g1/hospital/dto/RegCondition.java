package com.g1.hospital.dto;

import com.g1.hospital.utils.PageParameter;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class RegCondition extends PageParameter {
    private String cardId;
    private Long departmentId;
    private Long userId;
    private Byte status;
    private Long regUserId;

    public RegCondition() {
    }

    public RegCondition(String cardId, Long departmentId, Long userId, Byte status, Long regUserId) {
        this.cardId = cardId;
        this.departmentId = departmentId;
        this.userId = userId;
        this.status = status;
        this.regUserId = regUserId;
    }

    /**
     * 获取
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
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
     * @return regUserId
     */
    public Long getRegUserId() {
        return regUserId;
    }

    /**
     * 设置
     * @param regUserId
     */
    public void setRegUserId(Long regUserId) {
        this.regUserId = regUserId;
    }

    public String toString() {
        return "RegCondition{cardId = " + cardId + ", departmentId = " + departmentId + ", userId = " + userId + ", status = " + status + ", regUserId = " + regUserId + "}";
    }
}
