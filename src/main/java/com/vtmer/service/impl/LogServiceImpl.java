package com.vtmer.service.impl;

import com.vtmer.domain.Administrator;
import com.vtmer.domain.Log;
import com.vtmer.mapper.AdministratorMapper;
import com.vtmer.mapper.LogMapper;
import com.vtmer.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;
    @Autowired
    private AdministratorMapper administratorMapper;

    /**
     * 添加操作记录
     * @param record
     * @return
     */
    @Override
    public int insert(Log record) {
        return 0;
    }

    /**
     * 查看所有操作记录
     * @return
     */
    @Override
    public List<Log> selectAll() {
        return null;
    }

    /**
     * 根据管理员id查看操作记录
     * @param adminId
     * @return
     */
    @Override
    public List<Object> selectLogByAdmiId(Integer adminId) {
        ArrayList<Log> logs = logMapper.selectLogByAdmiId(adminId);
        Administrator administrator = administratorMapper.selectAdmiById(logs.get(0).getAdmiId());
        List<Object> list = new ArrayList<>();
        list.add(administrator);
        list.add(logs);
        return list;
    }

    /**
     * 根据用户id查看被操作记录
     * @param userId
     * @return
     */
    @Override
    public List<Log> selectLogByUserId(Integer userId) {
        return logMapper.selectLogByUserId(userId);
    }

}
