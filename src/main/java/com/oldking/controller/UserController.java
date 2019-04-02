package com.oldking.controller;

import com.oldking.dao.UserMapper;
import com.oldking.po.User;
import com.oldking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Integer id) throws Exception {
        System.out.println("来了老弟");
        return userService.queryById(id);
    }
}
