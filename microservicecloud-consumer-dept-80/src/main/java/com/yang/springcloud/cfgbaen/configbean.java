package com.yang.springcloud.cfgbaen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configbean {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
