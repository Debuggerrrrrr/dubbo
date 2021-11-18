package com.yqc.service;

import com.yqc.bean.User;

public class UserServiceStub implements UserService {
    private final UserService userService;

    // 通过构造方法将远程代理对象传入，用来做远程调用
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User selectUserById(int id) {
        // 做参数验证，决定是否调用远程服务
        if (id == 0){
            System.out.println("参数错误，不进行远程调用");
            return null;
        }else {
            System.out.println("远程调用...");
            return userService.selectUserById(id);
        }
    }
}
