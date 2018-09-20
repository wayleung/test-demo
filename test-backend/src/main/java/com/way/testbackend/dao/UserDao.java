package com.way.testbackend.dao;

import com.way.testbackend.dto.User;

import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/20/2018 10:42
 * @Description:
 */
public interface UserDao {
    List<User> selectAllUsers();
}
