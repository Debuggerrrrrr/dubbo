package com.yqc.boot.service;

import com.yqc.bean.User;
import com.yqc.service.UserService;
import org.springframework.stereotype.Service;

@com.alibaba.dubbo.config.annotation.Service// 这是dubbo中的注解，用于暴露服务
@Service// 这是spring中的注解，用于添加组件
public class UserServiceImpl implements UserService {
    @Override
    public User selectUserById(int id) {
        // 假设以下创建的User对象就是从数据库中查询的结果
        User user = new User();
        user.setId(id);
        user.setUserName("jack");
        user.setAddress("兰州大学");
        user.setTel("17378040169");
        return user;
    }
}
