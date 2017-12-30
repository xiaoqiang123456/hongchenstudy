<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dao;

import ${basepackage}.model.${className};
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: ${className}仓库<br>
 * 开发时间: <#if now??>${now?string('yyyy/MM/dd')}</#if><br>
 */
@Repository
public interface ${className}Dao {

<#if (table.pkColumns)?size gt 1 >
    /**
     * 根据联合主键获取${classNameLower}
     */
    ${className} findByPK(<#list table.pkColumns as column>@Param("${column.columnNameFirstLower}") ${column.simpleJavaType} ${column.columnNameFirstLower}<#if column_has_next>, </#if></#list>);
<#elseif (table.pkColumns)?size == 1 >
    /**
     * 根据${table.pkColumn.columnNameFirstLower}获取${classNameLower}
     */
    ${className} findBy${table.pkColumn.columnName}(${table.pkColumn.simpleJavaType} ${table.pkColumn.columnNameFirstLower});
</#if>

    /**
     * 插入${classNameLower}
     */
    int insert(${className} ${classNameLower});

    /**
     * 插入${classNameLower}中有效字段
     */
    int insertSelective(${className} ${classNameLower});

<#if (table.pkColumns)?size gt 1 >
    /**
     * 根据联合主键删除${classNameLower}
     */
    int deleteByPK(<#list table.pkColumns as column>${column.simpleJavaType} ${column.columnNameFirstLower}<#if column_has_next>, </#if></#list>);
<#elseif (table.pkColumns)?size == 1 >
    /**
     * 根据${table.pkColumn.columnNameFirstLower}删除${classNameLower}
     */
    int deleteBy${table.pkColumn.columnName}(${table.pkColumn.simpleJavaType} ${table.pkColumn.columnNameFirstLower});
</#if>

    /**
     * 更新${classNameLower}
     */
    int update(${className} ${classNameLower});

    /**
     * 更新${classNameLower}中有效字段
     */
    int updateSelective(${className} ${classNameLower});

    /**
     * 统计总数
     */
    long count();

}