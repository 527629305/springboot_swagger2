package com.wujun.demostart.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Charge {
    /**
     * 索引项
     * uuid_yyyyMMdd
     */
    private String  sIndex;
    /**
     * 客户号
     */
    private Integer custId;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 日期
     */
    private Date transDate;
    /**
     * 客户姓名
     */
    private String surName;
    /**
     * 最大单笔消费金额
     */
    private BigDecimal tranMaxAmt;
    /**
     * 当天还款总金额
     */
    private BigDecimal payAmt;
    /**
     * 当天消费笔数
     */
    private Integer tranCnt;
    /**
     * 当天还款笔数
     */
    private Integer payCnt;
    /**
     * 当天交易总金额

     */
    private BigDecimal tranAmt;


    public Charge(){

    }

    public Charge(String sIndex, Integer custId, Date updateTime, Date transDate, String surName, BigDecimal tranMaxAmt, BigDecimal payAmt, Integer tranCnt, Integer payCnt, BigDecimal tranAmt) {
        this.sIndex = sIndex;
        this.custId = custId;
        this.updateTime = updateTime;
        this.transDate = transDate;
        this.surName = surName;
        this.tranMaxAmt = tranMaxAmt;
        this.payAmt = payAmt;
        this.tranCnt = tranCnt;
        this.payCnt = payCnt;
        this.tranAmt = tranAmt;
    }

    public String getsIndex() {
        return sIndex;
    }

    public void setsIndex(String sIndex) {
        this.sIndex = sIndex;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public BigDecimal getTranMaxAmt() {
        return tranMaxAmt;
    }

    public void setTranMaxAmt(BigDecimal tranMaxAmt) {
        this.tranMaxAmt = tranMaxAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getTranCnt() {
        return tranCnt;
    }

    public void setTranCnt(Integer tranCnt) {
        this.tranCnt = tranCnt;
    }

    public Integer getPayCnt() {
        return payCnt;
    }

    public void setPayCnt(Integer payCnt) {
        this.payCnt = payCnt;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    @Override
    public String toString() {
        return "Charge{" +
                "sIndex='" + sIndex + '\'' +
                ", custId=" + custId +
                ", updateTime=" + updateTime +
                ", transDate=" + transDate +
                ", surName='" + surName + '\'' +
                ", tranMaxAmt=" + tranMaxAmt +
                ", payAmt=" + payAmt +
                ", tranCnt=" + tranCnt +
                ", payCnt=" + payCnt +
                ", tranAmt=" + tranAmt +
                '}';
    }
}
