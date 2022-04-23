package com.proton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h1>授权中心启动入口</h1>
 * */
//@EnableDiscoveryClient
@SpringBootApplication
@EnableDiscoveryClient
public class ReportDubboApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReportDubboApplication.class, args);
    }
}
