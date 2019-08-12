package com.vtmer.mapper;

import com.vtmer.domain.Interview;
import com.vtmer.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterviewMapper {
    /**
     * 添加
     */
    void insert(Interview record);

    /**
     * 查询所有
     */
    List<Interview> selectAll();

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新
     * @param record
     */
    void update(Interview record);

    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    List<Interview> selectInterviewById(int id);

    
}