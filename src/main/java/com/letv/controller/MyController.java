package com.letv.controller;

import com.letv.dao.StudentDao;
import com.letv.model.Student;
import com.letv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
//public class MyController extends BaseController{
public class MyController{

    @Autowired
    StudentService studentService;

    @Autowired
    StudentDao studentDao;
//    @RequestMapping("register.do")
//    public String doRegister(int age) throws Exception {
//
//        System.out.println("执行doRegister()方法");
//        return "views/success";
//    }

    @ResponseBody
    @RequestMapping("selectAll")
    public String selectAll(){
        List<Student> students = studentService.selectAll();
        System.out.println(students);
        return students.toString();
    }

}
