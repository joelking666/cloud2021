package com.atiguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @title: paymentMain8001
 * @Author jinhw
 * @Date: 2021/6/6 20:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class paymentMain8001 {
    public static void main (String[] args){
        SpringApplication.run(paymentMain8001.class);
    }
}
