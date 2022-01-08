package com.zhoufly.springcloudshopp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author adanmint@163.com
 * @Date 2022-01-08 11:51 AM
 */

@RestController
public class IndexController {

    /*@Autowired
    private RestTemplate restTemplate;


    @RequestMapping("getIndex")
    public String getIndex(){
        String res = restTemplate.getForObject("http://user-service/show", String.class);
        return  res;
    }*/
}
