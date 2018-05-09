package com.lee.test;

import com.lee.application.SpringBootDemoServiceApplication;
import com.lee.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootDemoServiceApplication.class)
public class UserServiceTest {

      @Resource
      private UserDao userDao;

      @Test
      public void testGetUserTotalCount(){
          System.out.println(userDao.getUserTotalCount());
      }
}
