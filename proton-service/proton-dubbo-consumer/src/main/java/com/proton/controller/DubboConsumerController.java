package com.proton.controller;

import com.proton.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>订单服务对外 HTTP 接口</h1>
 * */
@Slf4j
@RestController
@RequestMapping("/analysis")
public class DubboConsumerController {

    @Reference
    private HelloService helloService;

    @PostMapping("/hello")
    public String hello() {
        return helloService.hello();
    }
}
