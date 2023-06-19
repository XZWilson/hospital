package com.g1.hospital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class RegDetailDto {
    private String pName;
    private String pSex;
    private String pidCard;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date pBirthday;
    private String pAddress;
    private Long rgId;
    private String dName;
    private String rmName;
    private String regDocName;
    private String OpaDocName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regConSulTime;
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT +8")
    private Date createTime;
    private Long maId;
    private String chiefComplaint;
    private String diagnosis;

    public RegDetailDto() {
    }

    public RegDetailDto(String pName, String pSex, String pidCard, Date pBirthday, String pAddress, Long rgId, String dName, String rmName, String regDocName, String OpaDocName, Date regTime, Date regConSulTime, Date createTime, Long maId, String chiefComplaint, String diagnosis) {
        this.pName = pName;
        this.pSex = pSex;
        this.pidCard = pidCard;
        this.pBirthday = pBirthday;
        this.pAddress = pAddress;
        this.rgId = rgId;
        this.dName = dName;
        this.rmName = rmName;
        this.regDocName = regDocName;
        this.OpaDocName = OpaDocName;
        this.regTime = regTime;
        this.regConSulTime = regConSulTime;
        this.createTime = createTime;
        this.maId = maId;
        this.chiefComplaint = chiefComplaint;
        this.diagnosis = diagnosis;
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
    public String getPSex() {
        return pSex;
    }

    /**
     * 设置
     * @param pSex
     */
    public void setPSex(String pSex) {
        this.pSex = pSex;
    }

    /**
     * 获取
     * @return pidCard
     */
    public String getPidCard() {
        return pidCard;
    }

    /**
     * 设置
     * @param pidCard
     */
    public void setPidCard(String pidCard) {
        this.pidCard = pidCard;
    }

    /**
     * 获取
     * @return pBirthday
     */
    public Date getPBirthday() {
        return pBirthday;
    }

    /**
     * 设置
     * @param pBirthday
     */
    public void setPBirthday(Date pBirthday) {
        this.pBirthday = pBirthday;
    }

    /**
     * 获取
     * @return pAddress
     */
    public String getPAddress() {
        return pAddress;
    }

    /**
     * 设置
     * @param pAddress
     */
    public void setPAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    /**
     * 获取
     * @return rgId
     */
    public Long getRgId() {
        return rgId;
    }

    /**
     * 设置
     * @param rgId
     */
    public void setRgId(Long rgId) {
        this.rgId = rgId;
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
     * @return rmName
     */
    public String getRmName() {
        return rmName;
    }

    /**
     * 设置
     * @param rmName
     */
    public void setRmName(String rmName) {
        this.rmName = rmName;
    }

    /**
     * 获取
     * @return regDocName
     */
    public String getRegDocName() {
        return regDocName;
    }

    /**
     * 设置
     * @param regDocName
     */
    public void setRegDocName(String regDocName) {
        this.regDocName = regDocName;
    }

    /**
     * 获取
     * @return OpaDocName
     */
    public String getOpaDocName() {
        return OpaDocName;
    }

    /**
     * 设置
     * @param OpaDocName
     */
    public void setOpaDocName(String OpaDocName) {
        this.OpaDocName = OpaDocName;
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

    /**
     * 获取
     * @return regConSulTime
     */
    public Date getRegConSulTime() {
        return regConSulTime;
    }

    /**
     * 设置
     * @param regConSulTime
     */
    public void setRegConSulTime(Date regConSulTime) {
        this.regConSulTime = regConSulTime;
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
     * @return maId
     */
    public Long getMaId() {
        return maId;
    }

    /**
     * 设置
     * @param maId
     */
    public void setMaId(Long maId) {
        this.maId = maId;
    }

    /**
     * 获取
     * @return chiefComplaint
     */
    public String getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * 设置
     * @param chiefComplaint
     */
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    /**
     * 获取
     * @return diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 设置
     * @param diagnosis
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String toString() {
        return "RegDetailDto{pName = " + pName + ", pSex = " + pSex + ", pidCard = " + pidCard + ", pBirthday = " + pBirthday + ", pAddress = " + pAddress + ", rgId = " + rgId + ", dName = " + dName + ", rmName = " + rmName + ", regDocName = " + regDocName + ", OpaDocName = " + OpaDocName + ", regTime = " + regTime + ", regConSulTime = " + regConSulTime + ", createTime = " + createTime + ", maId = " + maId + ", chiefComplaint = " + chiefComplaint + ", diagnosis = " + diagnosis + "}";
    }
}
