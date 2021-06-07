package com.atiguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @title: ApplicationContextConfig
 * @Author jinhw
 * @Date: 2021/6/7 15:55
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig  {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
