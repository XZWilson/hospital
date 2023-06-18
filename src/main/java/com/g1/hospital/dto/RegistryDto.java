package com.g1.hospital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class RegistryDto {
    private Long id;
    private String pName;
    private Byte pSex;
    private String pCardId;
    private String dName;
    private Byte status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regTime;

    public RegistryDto() {
    }

    public RegistryDto(Long id, String pName, Byte pSex, String pCardId, String dName, Byte status, Date createTime, Date regTime) {
        this.id = id;
        this.pName = pName;
        this.pSex = pSex;
        this.pCardId = pCardId;
        this.dName = dName;
        this.status = status;
        this.createTime = createTime;
        this.regTime = regTime;
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
     * @return pName
     */
    public String getPName() {
        return pName;
    }

    /**
     * 设置
     * @param pName
     */
    public void setPName(String pName) {
        this.pName = pName;
    }

    /**
     * 获取
     * @return pSex
     */
    public Byte getPSex() {
        return pSex;
    }

    /**
     * 设置
     * @param pSex
     */
    public void setPSex(Byte pSex) {
        this.pSex = pSex;
    }

    /**
     * 获取
     * @return pCardId
     */
    public String getPCardId() {
        return pCardId;
    }

    /**
     * 设置
     * @param pCardId
     */
    public void setPCardId(String pCardId) {
        this.pCardId = pCardId;
    }

    /**
     * 获取
     * @return dName
     */
    public String getDName() {
        return dName;
    }

    /**
     * 设置
     * @param dName
     */
    public void setDName(String dName) {
        this.dName = dName;
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
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return regTime
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * 设置
     * @param regTime
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String toString() {
        return "RegistryDto{id = " + id + ", pName = " + pName + ", pSex = " + pSex + ", pCardId = " + pCardId + ", dName = " + dName + ", status = " + status + ", createTime = " + createTime + ", regTime = " + regTime + "}";
    }
}
