package com.lxl.controller;

import com.lxl.service.UserService;
import com.lxl.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(Model model) {
        int id = 1;
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        user.setUsername("大武当");
        this.userService.addUser(user);
        return "index";
    }

    @RequestMapping("/deleteUserById")
    public String deleteUserById(Integer id){
        id=2;
        userService.deleteUserById(id);
        return "index";
    }

    @RequestMapping("/setUser")
    public String setUser(User user){
        user.setUsername("小武当");
        user.setId(2);
        this.userService.setUser(user);
        return "index";
    }
}