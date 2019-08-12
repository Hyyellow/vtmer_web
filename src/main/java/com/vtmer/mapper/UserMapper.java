package com.vtmer.mapper;

import com.vtmer.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    /**
     * 添加
     */
    int insert(User record);

    /**
     * 查询所有
     */
    List<User> selectAll();

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新
     * @param record
     */
    void update(User record);
}