package com.itcast.mall.service.impl;

import com.itcast.mall.common.ServerResponse;
import com.itcast.mall.entity.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
