<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dao;

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


import ${basepackage}.model.${className};
import ${basepackage}.dao.${className}Dao;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: ${className}Mapper单元测试<br>
 * 开发时间: ${now?string('yyyy/MM/dd')}<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-context.xml","classpath*:spring-mvc.xml"})
@Transactional // 事务必须要Junit看得见才能回滚
public class ${className}DaoTest {

    private Log logger = LogFactory.getLog(this.getClass());

    @Resource
    ${className}Dao ${classNameLower}Dao;

    @Before
    public void setUp(){
        Assert.notNull(${classNameLower}Dao, "${classNameLower}Mapper 不能为 null");
        // 此处可以做一些初始化操作
    }
    @After
    public void tearDown(){
    	${classNameLower}Dao = null;
        // 此处可以做一些清理操作
    }

    @Test
    public void countTest(){
        long count = ${classNameLower}Dao.count();
        System.out.println(count);
    }

}
