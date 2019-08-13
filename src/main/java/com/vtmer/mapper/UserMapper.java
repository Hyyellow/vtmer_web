package com.vtmer.mapper;

import com.vtmer.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 添加用户
     */
    boolean insert(User record);

    /**
     * 根据用户姓名查询用户
     * @param username
     * @return
     */
    List<User> selectOneByName(String username);

    /**
     * 根据用户Id查询用户
     * @param id
     * @return
     */
    User selectUserById(int id);

    /**
     * 根据用户姓名更新用户
     * @param user
     * @return
     */
    boolean updateUserByName(User user);

    /**
     * 查询所有用户
     */
    List<User> selectAll();
}