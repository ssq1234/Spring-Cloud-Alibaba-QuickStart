package com.cust.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 孙术强
 * @date 2021/1/31 18:22
 */
@FeignClient(value = "books")   //用来表示当前接口是一个fegin的组件 value 书写调用的服务
public interface BooksClient {
    @GetMapping("book/test")  //填写请求接口
    public String test(); //此处和原接口处保持一致
}
