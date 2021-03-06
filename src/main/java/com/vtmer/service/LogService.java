package com.vtmer.service;

import com.vtmer.domain.Log;

import java.util.ArrayList;
import java.util.List;

public interface LogService {
    // 添加操作记录
    int insert (Log record);

    // 查看所有操作记录
    List<Log> selectAll();

    // 根据管理员id查看操作记录
    List<Object> selectLogByAdmiId(Integer admiId);

    // 根据用户ID查看被操作记录
    List<Log> selectLogByUserId(Integer userId);
}
