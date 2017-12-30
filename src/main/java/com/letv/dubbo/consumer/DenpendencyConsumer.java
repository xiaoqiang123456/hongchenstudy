package com.letv.dubbo.consumer;

import com.letv.dubbo.provider.DependencyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DenpendencyConsumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dependency-consumer.xml"});
        context.start();

        DependencyService dependencyService = (DependencyService) context.getBean("dependencyService");

        dependencyService.dependency();

        System.in.read();
    }
}
