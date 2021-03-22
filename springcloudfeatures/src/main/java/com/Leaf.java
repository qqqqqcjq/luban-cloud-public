package com;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @date 2020/7/23 20:22
 * @author chengjiaqing
 * @version : 0.1
 */ 
 
@RefreshScope
@Component
public class Leaf {

    public Leaf() {
        System.out.println("constructor leaf ");
    }
}