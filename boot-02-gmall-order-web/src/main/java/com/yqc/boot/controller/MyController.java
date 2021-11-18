package com.yqc.boot.controller;

import com.yqc.bean.User;
import com.yqc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    @ResponseBody
    public User order(int id){
        return orderService.order(id);
    }
}
