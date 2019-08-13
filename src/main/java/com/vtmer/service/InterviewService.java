package com.vtmer.service;

import com.vtmer.domain.Interview;

import java.util.List;

public interface InterviewService {
    // 添加评价
    int insert(Interview record);

    // 查询所有评价
    List<Interview> selectAll();

    // 根据用户id查询所有评价
    Interview selectInterviewById(int id);

    // 更新评价
    boolean update(Interview record , int id);

    // 删除评价
    boolean delete(int id);
}
