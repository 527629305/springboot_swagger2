package com.wujun.demostart.entity;

/**
 * @author WuJun
 * @date 2019/11/29
 * 该类是一个客户实体类
 */

public class Customer {
    /**
     * 客户号
     */
    private Integer custId;
    /**
     * 客户姓名
     */
    private String surName;
    /**
     * 性别
     */
    private String gender;
    /**
     * 教育状况
     */
    private String educaDes;
    /**
     * 婚姻状况
     */
    private String marDes;
    /**
     * 生日
     */
    private Integer birthday;
    /**
     * 住址
     */
    private String address;


    public Customer() {

    }

    public Customer(Integer custId, String surName, String gender, String educaDes, String marDes, Integer birthday, String address) {
        this.custId = custId;
        this.surName = surName;
        this.gender = gender;
        this.educaDes = educaDes;
        this.marDes = marDes;
        this.birthday = birthday;
        this.address = address;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducaDes() {
        return educaDes;
    }

    public void setEducaDes(String educaDes) {
        this.educaDes = educaDes;
    }

    public String getMarDes() {
        return marDes;
    }

    public void setMarDes(String marDes) {
        this.marDes = marDes;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", educaDes='" + educaDes + '\'' +
                ", marDes='" + marDes + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
