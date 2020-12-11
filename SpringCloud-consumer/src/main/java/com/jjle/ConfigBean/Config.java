package com.jjle.ConfigBean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//
@Configuration
public class Config {
    @Bean
    @LoadBalanced //Ribbon配置一个负载均衡的redistmeplate ribbon 是一个集成在客户端
    public RestTemplate getrestTemplate(){
        return  new RestTemplate();
    }

}
