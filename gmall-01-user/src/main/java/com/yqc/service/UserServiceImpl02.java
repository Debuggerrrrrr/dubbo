package com.yqc.service;

import com.yqc.bean.User;

public class UserServiceImpl02 implements UserService {
    @Override
    public User selectUserById(int id) {
        System.out.println("新版本");
        // 假设以下创建的User对象就是从数据库中查询的结果
        User user = new User();
        user.setId(id);
        user.setUserName("jack");
        user.setAddress("兰州大学");
        user.setTel("17378040169");
        return user;
    }
}
