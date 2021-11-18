package com.yqc.test;

import com.yqc.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestDubbo {
    // 创建容器相当于当前应用启动，当前服务消费者会去注册中心订阅自己需要的服务
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.start();
        OrderService service = context.getBean(OrderService.class);
        service.order(1);
        //System.in.read();// 阻塞，一直运行
    }
}
