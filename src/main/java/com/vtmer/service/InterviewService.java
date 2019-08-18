package com.vtmer.service;

import com.vtmer.domain.Interview;

import java.util.List;

public interface InterviewService {
    // 添加评价
    boolean insert(Interview record);

    // 添加评价并记录添加操作
    boolean insertFlag(Interview record, Integer userId, Integer adminId);

    // 查询所有评价
    List<Interview> selectAll();

    // 根据用户id查询所有评价
    Interview selectInterviewById(Integer id);

    // 更新评价
    boolean update(Interview record);

    // 更新评价并记录更新操作
    boolean updateFlag(Interview record,Integer userId, Integer adminId);

    // 删除评价
    boolean delete(Integer id);

    // 删除评价并记录删除操作
    boolean deleteFlag(Integer id,Integer userId, Integer adminId);
}
