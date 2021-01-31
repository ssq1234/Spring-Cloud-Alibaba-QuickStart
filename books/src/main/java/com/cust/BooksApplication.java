package com.cust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 孙术强
 * @date 2021/1/31 17:32
 */
@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient
public class BooksApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class,args);
    }
}
