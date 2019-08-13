package com.vtmer.service.impl;

import com.vtmer.domain.Interview;
import com.vtmer.domain.User;
import com.vtmer.mapper.InterviewMapper;
import com.vtmer.mapper.UserMapper;
import com.vtmer.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper interviewMapper;
    private UserMapper userMapper;

    /**
     * 添加评价
     * @param record
     * @return
     */
    @Override
    public int insert(Interview record) {
        return 0;
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Interview> selectAll() {
        return null;
    }

    /**
     * 根据用户Id查询评价
     * @param id
     * @return
     */
    @Override
    public Interview selectInterviewById(int id) {
        return interviewMapper.selectInterviewById(id);
    }

    /**
     * 根据用户id更新评价
     * @param record
     * @param id
     * @return
     */
    @Override
    public boolean update(Interview record , int id) {
        User user = userMapper.selectUserById(id);
        if(user != null){
            boolean flag = interviewMapper.update(record);
            return  flag;
        }
        return false;
    }

    /**
     * 根据用户id删除评价
     * @param id
     * @return
     */
    @Override
    public boolean delete(int id) {
        User user = userMapper.selectUserById(id);
        if(user != null){
            boolean flag = interviewMapper.delete(id);
            return  flag;
        }
        return false;
    }
}
