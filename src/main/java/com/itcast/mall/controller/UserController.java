package com.itcast.mall.controller;

import com.itcast.mall.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public void login(@RequestParam("username") String username, @RequestParam("password") String password){
        userService.login(username,password);
    }

}
