package com.yqc.service;

import com.yqc.bean.User;

public interface UserService {
    /**
     * 从数据库根据用户id查询用户信息方法
     * @param id：待查询用户id
     * @return：指定id的用户对象
     */
    User selectUserById(int id);
}
