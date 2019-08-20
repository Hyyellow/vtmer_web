package com.vtmer.mapper;

import com.vtmer.domain.State;
import com.vtmer.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StateMapper {
    /**
     * 添加
     */
    void insert(State record);

    /**
     * 查询所有
     */
    List<State> selectAll();

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新
     * @param record
     */
    boolean update(State record);

//    查询第二志愿录取状态
    String selectSecond(int userId);

}