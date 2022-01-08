package com.zhoufly.springcloudshopp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudShoppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudShoppApplication.class, args);
    }

}
