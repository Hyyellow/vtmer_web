package com.vtmer.mapper;

import com.vtmer.domain.Log;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface LogMapper {

    /**
     * 添加操作记录
     */
    int insert(Log record);

    /**
     * 查看所有操作记录
     */
    List<Log> selectAll();

    /**
     *  根据管理员id查看操作记录
     */
    ArrayList<Log> selectLogByAdmiId(Integer admiId);

    /**
     *  根据用户id查看被操作记录
     */
    ArrayList<Log> selectLogByUserId(Integer userId);

    /**
     *  根据用户Id删除用户；记录删除操作
     */
    boolean insertDeleteUser(Integer userId, Integer admiId);

    /**
     *  根据用户Id移组用户；记录移组操作
     */
    boolean insertRemoveUser(Integer userId, Integer admiId);

    /**
     *  根据用户Id添加面试评价；记录添加操作
     */
    boolean insertAddInterview(Integer userId, Integer admiId);

    /**
     *  根据用户Id更新面试评价；记录修改操作
     */
    boolean insertUpdateInterview(Integer userId, Integer admiId);

    /**
     *  根据用户Id删除面试评价；记录删除操作
     */
    boolean insertDeleteInterview(Integer userId, Integer admiId);
}