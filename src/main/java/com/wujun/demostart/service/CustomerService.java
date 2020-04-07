package com.wujun.demostart.service;

import com.wujun.demostart.entity.Customer;

import java.util.List;

public interface CustomerService {
    /**
     * 查询所有顾客
     * @return 返回一个客户集合
     */
    List<Customer> getAllCustomers();

    /**
     * 按照条件查询客户信息以及模糊查询
     * @param customer
     * @return
     */
    List<Customer> selectCustomerFuzzy(Customer customer);
    /**
     * 通过id查询
     * @param custId
     * @return
     */
    Customer getCustomersBycustId(Integer custId);
    /**
     * 插入一个顾客的信息
     * @param customer
     * @return 返回是否插入成功
     */
    boolean insertCustomer(Customer customer);
    /**
     * 通过id删除顾客
     * @param custId
     * @return
     */
    boolean deleteCustmerBycustId(Integer custId);

    /**
     * 通过id修改对应的顾客
     * @param customer
     * @return
     */
    boolean updateCustomerBycustId(Customer customer);
}
