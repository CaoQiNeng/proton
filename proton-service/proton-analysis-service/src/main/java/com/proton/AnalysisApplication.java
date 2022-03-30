package com.proton;

import com.proton.conf.DataSourceProxyAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * <h1>授权中心启动入口</h1>
 * */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@Import(DataSourceProxyAutoConfiguration.class)
public class AnalysisApplication {

    public static void main(String[] args) {

        SpringApplication.run(AnalysisApplication.class, args);
    }
}
