package com.itcast.mall.dao;

import com.itcast.mall.entity.User;

public interface IUserDao {

    User getUserByName(String name);

}
