package com.vtmer.service.impl;

import com.vtmer.domain.Interview;
import com.vtmer.mapper.InterviewMapper;
import com.vtmer.mapper.UserMapper;
import com.vtmer.service.InterviewService;
import com.vtmer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("interviewService")
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper interviewMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Interview> selectInterviewById(int id) {

        return interviewMapper.selectInterviewById(id);
    }
}
