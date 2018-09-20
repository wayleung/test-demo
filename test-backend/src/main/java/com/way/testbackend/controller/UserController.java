package com.way.testbackend.controller;

import com.way.testbackend.dto.User;
import com.way.testbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/20/2018 10:39
 * @Description:
 */
@Controller
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/users")
    public List<User> users(){
        return userService.selectAllUsers();
    }
}
