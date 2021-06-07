package com.atiguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @title: OrderController
 * @Author jinhw
 * @Date: 2021/6/7 15:50
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PYAMENT_URL = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        System.out.println(payment.toString());
        return restTemplate.postForObject(PYAMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/Payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PYAMENT_URL+"/payment/get/"+id,CommonResult.class);

    }
}
