package com.letv.service;


import com.letv.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有字段
     */
    List<Student> selectAll();
}
