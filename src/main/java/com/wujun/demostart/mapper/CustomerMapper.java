package com.wujun.demostart.mapper;

import com.wujun.demostart.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    /**
     * 查询所有顾客
     * @return 返回所有的顾客
     */
    List<Customer> getAllCustomers();

    /**
     * 按照条件查询客户信息以及模糊查询
     * @param customer
     * @return
     */
    List<Customer> selectCustomerFuzzy(Customer customer);


    /**
     * 该方法是插入顾客的方法
     * @param customer
     * @return 返回一个整数
     */
    int insertCustomer(Customer customer);

    /**
     * 通过id查询顾客的信息
     * @param custId
     * @return
     */
    Customer getCustomersBycustId(Integer custId);

    /**
     * 通过id删除顾客
     * @param custId
     * @return
     */
    int deleteCustmerBycustId(Integer custId);

    /**
     * 通过id修改对应的顾客
     * @param customer
     * @return
     */
    int updateCustomerBycustId(Customer customer);


}
