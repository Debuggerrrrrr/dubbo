package com.yqc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestDubbo {
    // 创建容器相当于当前应用启动，当前服务提供者会去注册中心注册自己提供的服务
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.start();
        System.in.read();// 阻塞，一直运行
    }
}
