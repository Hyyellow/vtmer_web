package com.vtmer.service.impl;

import com.vtmer.domain.Interview;
import com.vtmer.mapper.InterviewMapper;
import com.vtmer.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("interviewService")
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper interviewMapper;

    @Override
    public List<Interview> selectInterviewById(int id) {
        return interviewMapper.selectInterviewById(id);
    }
}
