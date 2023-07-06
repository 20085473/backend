package com.itcast.mall.service;

import com.itcast.mall.common.ServerResponse;
import com.itcast.mall.dao.UserMapper;
import com.itcast.mall.entity.User;
import com.itcast.mall.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    public ServerResponse<User> login(String username, String password){
        User user1 = userMapper.checkUsername(username);
        if(user1==null){
            return ServerResponse.createErrorMsg("用户名不存在");
        }
        User user2 = userMapper.login(username, password);
        if(user2==null){
            return ServerResponse.createErrorMsg("密码错误");
        }
        return ServerResponse.createSuccessMsg("登录成功");
    }

}
