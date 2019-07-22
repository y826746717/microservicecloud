package com.yang.springcloud.controller;

import com.yang.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    // 在业务没有落地的时候，我们只能使用本地的环境进行测试

    private static final String REST_URL_PREFIX = "http://localhost:8071";
//    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

//    private static final String REST_URL_PREFIX  = "micorservicecloud-provider-dept-8071";

    // 使用 restTemplate 可以完成rest接口调用

    /**
     * 使用 restTemplate 访问restful接口非常的简单粗暴无脑。 只需要：(url, requestMap,ResponseBean.class)
     * 这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
//    @RequestMapping(value = "/consumer/dept/discovery")
//    public Object discovery()
//    {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
//    }

}
