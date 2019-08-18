package com.vtmer.mapper;

import com.vtmer.domain.Interview;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterviewMapper {
    /**
     * 添加评价
     * @return
     */
    boolean insert(Interview record);

    /**
     * 查询所有评价
     */
    List<Interview> selectAll();

    /**
     * 根据用户id查询评价
     */
    Interview selectInterviewById(int id);

    /**
     *  更新评价
     */
    boolean update(Interview record);

    /**
     *  删除评价
     */
    boolean delete(int id);
}