package com.atiguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @title: OrderMain80
 * @Author jinhw
 * @Date: 2021/6/7 15:46
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class);
    }
}
