package com.yang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //EurekaServer服务器端启动类,接受其它微服务注册进来
//本服务启动后，会自动注册进 eureka 服务中
//eureka的服务端
public class EurekaServer7082_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7082_App.class,args);
    }
}
