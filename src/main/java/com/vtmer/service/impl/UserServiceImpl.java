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
        User user1 = userMapper.selectOneByName(user.getUserName());
        if (user1!=null){  // 如果根据姓名查询得到学生，更新学生信息
            boolean b = userMapper.updateUserByName(user);
            if (!b) { // 如果更新失败
                return false;
            }
        }else {  // 插入学生信息
            boolean flag = userMapper.insert(user);
            return flag;
        }
        return false;
    }
}
