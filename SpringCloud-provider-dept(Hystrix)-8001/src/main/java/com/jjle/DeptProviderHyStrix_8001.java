package com.jjle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient   //  自动注册到eureka当中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//添加对熔断的支持
public class DeptProviderHyStrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHyStrix_8001.class,args);
    }
}
