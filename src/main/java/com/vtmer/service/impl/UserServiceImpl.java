package com.vtmer.service.impl;

import com.vtmer.domain.User;
import com.vtmer.mapper.StateMapper;
import com.vtmer.mapper.UserMapper;
import com.vtmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StateMapper stateMapper;

/*    @Override*/
/*    public boolean delete(User record) {
        boolean flag = userMapper.delete();
        return false;
    }*/

    @Override
    public boolean swopVolunteer(int userId) {
        String first = userMapper.selectFirst(userId);
        String second = userMapper.selectSecond(userId);
        String state = stateMapper.selectSecond(userId);
//      0表示不录取状态；只有在第二志愿未淘汰此成员情况下可移组至第二志愿
        if (state != "0") {
            boolean flag = userMapper.swopVolunteer(first,second);
            return flag;
        }
        return false;
    }

    /*    @Override*/
/*    public boolean addUser(User user) {
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
    }*/
}
