package com.vtmer.service.impl;

import com.vtmer.domain.User;
import com.vtmer.mapper.UserMapper;
import com.vtmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        return false;
    }
}
