package com.proton.service.impl;

import com.proton.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(protocol = "dubbo")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
//        try {
//            Thread.sleep(4000);
        System.out.println("hello11111");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "hello";
    }
}
