<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: ${className}<br>
 * 开发时间: <#if now??>${now?string('yyyy/MM/dd')}</#if><br>
 */
public class ${className} implements Serializable {

	<#list table.columns as column>
	<#if column.remarks?exists && column.remarks != '' && column.remarks != 'null'>
	/**
	 * ${column.remarks}
	 */
	<#else>
	/**
	 * ${column.columnNameLower}
	 */
	</#if>
	private ${column.simpleJavaType} ${column.columnNameLower};

	</#list>

	<#list table.columns as column>
    /**
     * 获取${column.columnNameLower}
     */
    public ${column.simpleJavaType} get${column.columnName}() {
        return this.${column.columnNameLower};
    }

	/**
	 * 设置${column.columnNameLower}
	 */
	public void set${column.columnName}(${column.simpleJavaType} ${column.columnNameLower}) {
		this.${column.columnNameLower} = ${column.columnNameLower};
	}

	</#list>
}