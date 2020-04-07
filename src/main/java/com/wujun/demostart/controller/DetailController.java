package com.wujun.demostart.controller;

import com.github.pagehelper.PageHelper;
import com.wujun.demostart.entity.Detail;
import com.wujun.demostart.service.DetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 该类是明细控制类
 * @author WuJun
 * @date 2019/12/1
 */
@Api(description ="明细相关接口")
@RestController
public class DetailController {
    @Autowired
    private DetailService detailService;
    @GetMapping("/detail/allDetail")
    @ApiOperation("获取所有明细信息")
    public List<Detail> getAllDetail(Integer pagenum,Integer pageSize){
        if(pagenum==null&&pageSize==null){
            pageSize=0;
            pagenum=0;
        }

        PageHelper.startPage(pagenum,pageSize);
        return detailService.SelectAllDetails();
    }

    @GetMapping("/detail/{transId}")
    @ApiOperation("根据交易id获取明细")
     public Detail selectDetailByTransId(@PathVariable("transId")int transId){
        return detailService.selectDetailByTransId(transId);
    }
    @GetMapping("/detail/fuzzy")
    @ApiOperation("按照条件查询明细")
    List<Detail> selectDetailFuzzySerch(Detail detail,Integer pagenum,Integer pageSize){
        if(pagenum==null&&pageSize==null){
            pageSize=0;
            pagenum=0;
        }
        PageHelper.startPage(pagenum,pageSize);
        return detailService.selectDetailFuzzySerch(detail);
    }

    @PostMapping("/insert")
    @ApiOperation("插入一条明细记录")
    public boolean insertDetail(Detail detail){
//        detail.setTransId(6);
//        detail.setAccount("1");
//        detail.setBill(new BigDecimal(11.12));
//        detail.setCardNbr("3");
//        detail.setCustId(5);
//        detail.setTransType("支付宝");
//        detail.setMonthNbr(12);
//        detail.setTransType("hah");
        detail.setTxnDatetime(new Date());
        return detailService.insertDetail(detail);
    }

    @DeleteMapping("/detail/delete/{transId}")
    @ApiOperation("根据交易id删除明细的信息")
    boolean deleteDetailByTransId(@PathVariable("transId")int transId){
        return detailService.deleteDetailByTransId(transId);
    }

    @PutMapping("/detail/update/{transId}")
    @ApiOperation("修改明细信息")
    boolean updateDetailByTransId(Detail detail){
        detail.setTxnDatetime(new Date());
        return detailService.updateDetailByTransId(detail);
    }
}
