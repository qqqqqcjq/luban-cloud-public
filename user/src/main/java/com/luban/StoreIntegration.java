package com.luban;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Map;

//单独使用Hystrix， 而不是使用Feign整合的Hystrix
@Component
public class StoreIntegration {

    @HystrixCommand(fallbackMethod = "defaultStores")
    public Object getStores(Map<String, Object> parameters) throws  Exception{
        throw new Exception();
        //do stuff that might fail
    }

    public Object defaultStores(Map<String, Object> parameters) {
        return null;/* something useful */
    }
}