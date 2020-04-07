package com.wujun.demostart.controller;

import com.wujun.demostart.entity.Customer;
import com.wujun.demostart.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
/**
 * 该类是一个测试类
 * @auther 吴俊
 * @date 2019/12/1
 */
class CustomerControllerTest {
    @Autowired
    CustomerService customerService;
    @Test
    void all() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        System.out.println(allCustomers);

    }

    @Test
    void addCustomers() {
        Customer customer = new Customer(11,"吴俊","男","大学本科","未婚",19980826,"孝感");
        Boolean b = customerService.insertCustomer(customer);
        System.out.println(b);

    }

}