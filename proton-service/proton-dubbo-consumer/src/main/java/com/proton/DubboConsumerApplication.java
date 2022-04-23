package com.proton;

//import com.proton.conf.DataSourceProxyAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h1>授权中心启动入口</h1>
 * */
@SpringBootApplication
@EnableDiscoveryClient
//@Import(DataSourceProxyAutoConfiguration.class)
public class DubboConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
