package com.letv.dao;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import javax.annotation.Resource;


import com.letv.model.Student;
import com.letv.dao.StudentDao;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: StudentMapper单元测试<br>
 * 开发时间: 2017/11/25<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context.xml","classpath*:spring-mvc.xml"})
@Transactional // 事务必须要Junit看得见才能回滚
public class StudentDaoTest {

    private Log logger = LogFactory.getLog(this.getClass());

    @Resource
    StudentDao studentDao;

    @Before
    public void setUp(){
        Assert.notNull(studentDao, "studentMapper 不能为 null");
        // 此处可以做一些初始化操作
    }
    @After
    public void tearDown(){
    	studentDao = null;
        // 此处可以做一些清理操作
    }

    @Test
    public void countTest(){
        long count = studentDao.count();
        System.out.println(count);
    }

}
