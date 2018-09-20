package com.way.testbackend.dao.impl;

import com.way.testbackend.dao.UserDao;
import com.way.testbackend.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/20/2018 10:43
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList();
        users.add(new User(1,"zhangsan","123","123456"));
        users.add(new User(2,"lisi","123","123456"));
        users.add(new User(3,"wangwu","123","123456"));
        users.add(new User(4,"xiaoming","123","123456"));
        users.add(new User(5,"xiaofang","123","123456"));
        return users;
    }
}
