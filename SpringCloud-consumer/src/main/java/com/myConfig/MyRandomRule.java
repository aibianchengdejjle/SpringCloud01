package com.myConfig;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRandomRule {
    @Bean
    public IRule myRondom(){
        return  new jjlRuel();
    }
}
