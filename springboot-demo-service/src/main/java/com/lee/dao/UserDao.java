package com.lee.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    long getUserTotalCount();
}
