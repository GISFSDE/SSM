package com.lxl.service;

import com.lxl.dao.UserDao;
import com.lxl.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public int addUser(User user) {return userDao.addUser(user);}

    public int deleteUserById(Integer id) {return userDao.deleteUserById(id);}

    public int setUser(User user) {return userDao.setUser(user);}
}
