package com.letv.dao;

import com.letv.model.Student;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: Student仓库<br>
 * 开发时间: 2017/11/25<br>
 */
@Repository
public interface StudentDao {

    /**
     * 根据id获取student
     */
    Student findById(Integer id);

    /**
     * 插入student
     */
    int insert(Student student);

    /**
     * 插入student中有效字段
     */
    int insertSelective(Student student);

    /**
     * 根据id删除student
     */
    int deleteById(Integer id);

    /**
     * 更新student
     */
    int update(Student student);

    /**
     * 更新student中有效字段
     */
    int updateSelective(Student student);

    /**
     * 统计总数
     */
    long count();

    List<Student> selectAll();
}