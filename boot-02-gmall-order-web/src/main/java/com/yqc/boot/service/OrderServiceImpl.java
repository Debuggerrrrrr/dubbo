package com.yqc.boot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yqc.bean.User;
import com.yqc.service.OrderService;
import com.yqc.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service// spring下的注解
public class OrderServiceImpl implements OrderService {
    @Reference()// 直接引用注册中心中的UserService类型对象
    UserService userService;

    @Override
    public User order(int id) {
        // 先调用用户模块的服务查询出用户信息
        return userService.selectUserById(id);
    }
}
