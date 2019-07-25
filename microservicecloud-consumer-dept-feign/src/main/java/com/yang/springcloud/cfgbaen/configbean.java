package com.yang.springcloud.cfgbaen;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configbean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //显式的声明负载均衡策略
//    @Bean
    public IRule MyRule(){
//        /return new RoundRobinRule();
        return new RandomRule();
    }


}
