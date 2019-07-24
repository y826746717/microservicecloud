package com.yang.springcloud8073;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//用于服务发现
@EnableDiscoveryClient
public class DeptProvider8073_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8073_App.class,args);
    }
}
