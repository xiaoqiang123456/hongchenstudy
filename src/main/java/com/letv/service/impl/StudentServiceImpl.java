package com.letv.service.impl;

import com.letv.dao.StudentDao;
import com.letv.model.Student;
import com.letv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("student")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }
}
