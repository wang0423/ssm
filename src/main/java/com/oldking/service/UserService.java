package com.oldking.service;

import com.oldking.base.BaseService;
import com.oldking.dao.UserMapper;
import com.oldking.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserMapper userMapper;

}
