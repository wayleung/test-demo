package com.way.testbackend.service;

import com.way.testbackend.dto.User;

import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/20/2018 10:48
 * @Description:
 */
public interface UserService {
    List<User> selectAllUsers();
}
