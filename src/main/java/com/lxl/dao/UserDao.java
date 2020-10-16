package com.lxl.dao;

import com.lxl.entity.User;

public interface  UserDao {

    User findUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    int setUser(User user);
}
