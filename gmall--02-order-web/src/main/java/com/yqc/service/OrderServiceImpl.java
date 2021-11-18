package com.yqc.service;

import com.yqc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;// 在声明需要消费的服务后，会往容器中添加一个服务接口的代理对象

    @Override
    public User order(int id) {
        // 先调用用户模块的服务查询出用户信息
        for (int i=0; i<3; ++i){
            userService.selectUserById(id);// 调三次
        }
        return userService.selectUserById(id);
    }
}
