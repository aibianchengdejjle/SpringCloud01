package com.jjle;

import com.myConfig.MyRandomRule;
import com.myConfig.jjlRuel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候自动加载ribbon类
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = MyRandomRule.class)
public class SpringBootConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumer_80.class,args);
    }
}
