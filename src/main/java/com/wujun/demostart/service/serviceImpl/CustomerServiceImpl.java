package com.wujun.demostart.service.serviceImpl;

import com.wujun.demostart.entity.Customer;
import com.wujun.demostart.mapper.CustomerMapper;
import com.wujun.demostart.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @auther wujun
 * @date 2019/11/29
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.getAllCustomers();
    }

    @Override
    public List<Customer> selectCustomerFuzzy(Customer customer) {
        return  customerMapper.selectCustomerFuzzy(customer);
    }

    @Override
    public Customer getCustomersBycustId(Integer custId) {
        return customerMapper.getCustomersBycustId(custId);
    }

    @Override

    public boolean insertCustomer(Customer customer) {

        int i  = customerMapper.insertCustomer(customer);
        if(i!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCustmerBycustId(Integer custId) {
        int i = customerMapper.deleteCustmerBycustId(custId);
        if(i!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCustomerBycustId(Customer customer) {
        int i = customerMapper.updateCustomerBycustId(customer);
        if(i!=0){
            return true;
        }
        return false;
    }


}
