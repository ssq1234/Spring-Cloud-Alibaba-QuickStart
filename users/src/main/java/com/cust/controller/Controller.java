package com.cust.controller;

import com.cust.controller.client.BooksClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孙术强
 * @date 2021/1/31 17:59
 */
@RestController
@RefreshScope
public class Controller {
    @Autowired
    private BooksClient booksClient;

    @GetMapping("user/test")
    public String test(){
        return booksClient.test();
    }
}
