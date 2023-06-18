package com.g1.hospital.utils;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
public class PageParameter {
    private Integer pageIndex=1;
    private Integer pageSize=4;

    public PageParameter() {
    }

    public PageParameter(Integer pageIndex, Integer pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    /**
     * 获取
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * 获取
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return "PageParameter{pageIndex = " + pageIndex + ", pageSize = " + pageSize + "}";
    }
}
