package com.lee.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lee.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public int test(){
        redisTemplate.opsForValue().set("xx", "testetst", 10L, TimeUnit.HOURS);
        System.out.println("----------------------------" + redisTemplate.opsForValue().get("xx"));
        return userService.getUserTotalCount();
    }
}
