package com.itcast.mall.service;

import com.itcast.mall.dao.IUserDao;
import com.itcast.mall.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl {

    @Autowired
    IUserDao userDao;

    public void login(String name,String pwd){
        User user = userDao.getUserByName(name);
        if(user==null){
            System.out.println("用户不存在");
        }else {
            System.out.println("登录成功");
        }
    }
}
