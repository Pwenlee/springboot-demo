package com.lee.application;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages="com.lee")
@EnableDubboConfiguration
@EnableTransactionManagement
@MapperScan(basePackages="com.lee.dao")
public class SpringBootDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoServiceApplication.class, args);
    }
}
