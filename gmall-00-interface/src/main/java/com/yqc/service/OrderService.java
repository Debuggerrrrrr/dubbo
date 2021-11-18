package com.yqc.service;

import com.yqc.bean.User;

public interface OrderService {
    /**
     * 下订单方法
     * @param id：下订单的用户id
     */
    User order(int id);
}
