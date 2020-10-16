package com.lxl.service;

import com.lxl.entity.User;

public interface  UserService{
    // 根据 id 寻找对应的 User
    public User findUserById(int id);
}
