package com.atiguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @title: EureakMain7001
 * @Author jinhw
 * @Date: 2021/6/7 21:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EureakMain7001 {
    public static void main (String[] args){
        SpringApplication.run(EureakMain7001.class);
    }
}
