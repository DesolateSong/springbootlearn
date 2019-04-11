package com.suxs.web.modules.sys.controller;

import com.suxs.common.base.BaseController;
import com.suxs.web.modules.sys.entity.User;
import com.suxs.web.modules.sys.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class UserController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public User saveUser(){

        User user = new User();

        user.setLoginName("admin");
        user.setPassword("123456");

        user = userService.save(user);

        return user;
    }

}
