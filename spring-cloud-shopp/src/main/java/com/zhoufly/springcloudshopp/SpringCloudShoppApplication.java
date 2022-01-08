package com.zhoufly.springcloudshopp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudShoppApplication {

    public static void main(String[] args) {

        try {
            SpringApplication.run(SpringCloudShoppApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
