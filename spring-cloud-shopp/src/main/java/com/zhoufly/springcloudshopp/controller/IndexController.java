package com.zhoufly.springcloudshopp.controller;

import com.zhoufly.springcloudshopp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

/*    @Autowired
    private RestTemplate restTemplate;*/


/*    @RequestMapping("getIndex")
    public String getIndex(){
        String res = restTemplate.getForObject("USER-SERVICE/show", String.class);
        return  res;
    }*/
    @Autowired
    private UserService userService;

    @RequestMapping("getIndex")
    public String getIndex(){
        String res = userService.getShow();
        return  res;
    }

    @GetMapping("index")
    public String index(){
        return "this is index";
    }
}
