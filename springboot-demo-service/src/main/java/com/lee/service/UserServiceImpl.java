package com.lee.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lee.api.UserService;
import com.lee.dao.UserDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Service(interfaceClass = UserService.class, version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public long getUserTotalCount() {
        return userDao.getUserTotalCount();
    }
}
