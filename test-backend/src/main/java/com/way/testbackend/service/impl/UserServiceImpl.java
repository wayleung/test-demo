package com.way.testbackend.service.impl;

import com.way.testbackend.dao.UserDao;
import com.way.testbackend.dto.User;
import com.way.testbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/20/2018 10:49
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectAllUsers() {
        return userDao.selectAllUsers();
    }
}
