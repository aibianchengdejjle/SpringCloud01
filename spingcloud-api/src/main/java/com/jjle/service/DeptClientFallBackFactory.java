package com.jjle.service;

import com.jjle.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientFallBackFactory implements FallbackFactory {


    @Override
    public Object create(Throwable throwable) {
        return null;
    }
}
