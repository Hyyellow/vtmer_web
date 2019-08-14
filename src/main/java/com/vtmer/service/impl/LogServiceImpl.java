package com.vtmer.service.impl;

import com.vtmer.domain.Log;
import com.vtmer.mapper.LogMapper;
import com.vtmer.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

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

//    /**
//     * 根据管理员id查看操作记录
//     * @param admiId
//     * @return
//     */
//    @Override
//    public List<Log> selectLogByAdmiId(Integer admiId) {
//
//    }

}
