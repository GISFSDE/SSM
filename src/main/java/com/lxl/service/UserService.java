package com.lxl.service;

import com.lxl.entity.User;

public interface  UserService{
    // 根据 id 寻找对应的 User
    public User findUserById(int id);
    // 新增对应的 User
    public int addUser(User user);
    // 删除对应的 User
    public int deleteUserById(Integer id);
    // 修改对应的 User
    public int setUser(User user);
}
