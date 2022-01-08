package com.zhoufly.springcloudshopp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author adanmint@163.com
 * @Date 2022-01-08 1:58 PM
 */

@FeignClient(value = "user-service",path = "user-service/")
public interface UserService {

    @RequestMapping("/show")
    public String getShow();
}
