package com.wujun.demostart.controller;

import com.github.pagehelper.PageHelper;
import com.wujun.demostart.entity.Customer;
import com.wujun.demostart.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(description = "用户相关接口")
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/all")
    @ApiOperation("获取所有用户")
    public List<Customer> all(Integer pagenum,Integer pageSize){
        if(pagenum==null&&pageSize==null){
            pageSize=0;
            pagenum=0;
        }
        PageHelper.startPage(pagenum,pageSize);
        return  customerService.getAllCustomers();

    }
    @GetMapping("/customer/fuzzySerch")
    @ApiOperation("按照条件以及模糊查询明细的数据")
    public List<Customer> selectCustomerFuzzy(Customer customer,Integer pagenum,Integer pageSize){
        if(pagenum==null&&pageSize==null){
            pageSize=0;
            pagenum=0;
        }
        PageHelper.startPage(pagenum,pageSize);
        return  customerService.selectCustomerFuzzy(customer);
    }
    @GetMapping("/customer/{custId}")
    @ApiOperation("根据id获取用户")
    public Customer getCustomersBycustId(@PathVariable("custId")int custId){
        return customerService.getCustomersBycustId(custId);
    }

    @PostMapping("/customer/add")
    @ApiOperation("添加用户")
    public boolean addCustomers(Customer customer){
//       customer.setAddress("孝感");
//       customer.setBirthday(19980826);
//       customer.setCustId(52);
//       customer.setEducaDes("大学本科");
//       customer.setGender("男");
//       customer.setSurName("吴俊");
//       customer.setMarDes("未婚");
       return customerService.insertCustomer(customer);
    }
    @DeleteMapping("/customer/delete/{custId}")
    @ApiOperation("根据custId删除用户")
    public boolean deleteCustmerBycustId(@PathVariable("custId")int custId){
        return customerService.deleteCustmerBycustId(custId);
    }
    @PutMapping("/customer/update")
    @ApiOperation("更新用户")
    public boolean updateCustomerBycustId(Customer customer){

        return customerService.updateCustomerBycustId(customer);
    }


}
