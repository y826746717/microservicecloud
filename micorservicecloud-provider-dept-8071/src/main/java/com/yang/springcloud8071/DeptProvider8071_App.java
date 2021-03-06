package com.yang.springcloud8071;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//用于服务发现
@EnableDiscoveryClient
public class DeptProvider8071_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8071_App.class,args);
    }
}
