package com.vtmer.service.impl;

import com.vtmer.domain.Interview;
import com.vtmer.domain.User;
import com.vtmer.mapper.InterviewMapper;
import com.vtmer.mapper.LogMapper;
import com.vtmer.mapper.UserMapper;
import com.vtmer.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper interviewMapper;
    private UserMapper userMapper;
    private LogMapper logMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Interview> selectAll() {
        return null;
    }

    @Override
    public Interview selectInterviewById(Integer id) {
        return null;
    }

    /**
     * 添加评价
     * @param record
     * @return
     */
    @Override
    public boolean insert(Interview record) {
        boolean flag = interviewMapper.insert(record);
        return flag;
    }

    /**
     * 添加评价并记录添加操作
     * @param record
     * @return
     */
    @Override
    public boolean insertFlag(Interview record, Integer userId, Integer adminId) {
        boolean flag = interviewMapper.insert(record);
        if(flag){
            flag = logMapper.insertAddInterview(userId, adminId);
            return flag;
        }
        return false;
    }

    /**
     * 更新评价
     * @param record
     * @return
     */
    @Override
    public boolean update(Interview record) {
        boolean flag = interviewMapper.update(record);
        return flag;
    }

    /**
     * 更新评价并记录更新操作
     * @param record
     * @param userId
     * @param adminId
     * @return
     */
    @Override
    public boolean updateFlag(Interview record, Integer userId, Integer adminId) {
        boolean flag = interviewMapper.update(record);
        if(flag){
            logMapper.insertUpdateInterview(userId, adminId);
            return flag;
        }
        return flag;
    }

    /**
     * 删除评价
     * @param id
     * @return
     */
    @Override
    public boolean delete(Integer id) {
        boolean flag = interviewMapper.delete(id);
        return flag;
    }

    /**
     * 删除评价同时记录删除操作
     * @param id
     * @param userId
     * @param adminId
     * @return
     */
    @Override
    public boolean deleteFlag(Integer id, Integer userId, Integer adminId) {
        boolean flag = interviewMapper.delete(id);
        if(flag){
            flag = logMapper.insertDeleteInterview(userId, adminId);
            return flag;
        }
        return false;
    }

}
