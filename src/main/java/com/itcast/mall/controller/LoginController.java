package com.itcast.mall.controller;

import com.itcast.mall.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value="/login.do",method = RequestMethod.POST)
    public void login(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        loginService.login(name,pwd);
    }

}
