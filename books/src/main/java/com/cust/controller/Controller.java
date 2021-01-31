package com.cust.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙术强
 * @date 2021/1/31 17:57
 */
@RestController
@RefreshScope //自动刷新配置必加注解
public class Controller {

    @GetMapping("book/test")
    public String test(){
        return "hello";
    }

}
