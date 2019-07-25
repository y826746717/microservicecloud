package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yang.springcloud"})
@ComponentScan("com.yang.springcloud")
public class DeptConsumerFeign_app {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_app.class,args);
    }
}
