package com.letv.dubbo.consumer;

import com.letv.dubbo.provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring-consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
//        String hello = demoService.sayHello("日向雏田");
        String hello = demoService.sayHello("tom");
        System.out.println(hello);
        List users = demoService.getUsers();
        if (users != null || users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));
            }
        }


        System.in.read();
    }
}
