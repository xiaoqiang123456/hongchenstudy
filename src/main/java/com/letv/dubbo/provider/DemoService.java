package com.letv.dubbo.provider;

import com.letv.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DemoService {
    String sayHello(String name);

    public List getUsers();
}
