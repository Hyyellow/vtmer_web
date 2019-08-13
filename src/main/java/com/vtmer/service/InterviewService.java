package com.vtmer.service;

import com.vtmer.domain.Interview;

import java.util.List;

public interface InterviewService {
    //根据用户ID查询面试评价
    List<Interview> selectInterviewById(int id);
}
