package com.atiguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atiguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @title: PaymentController
 * @Author jinhw
 * @Date: 2021/6/6 21:19
 * @Version 1.0
 */
@Controller
@Slf4j
@ResponseBody
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        System.out.println(payment.toString());
        int result = paymentService.create(payment);
        log.info("——————插入结果——————"+result);
        if(result >0 ){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(444,"插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("——————插入结果——————"+payment);
        if(null != payment){
            return new CommonResult(200,"查询数据成功",payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询id"+id);
        }
    }


}
