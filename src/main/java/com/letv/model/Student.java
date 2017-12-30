package com.letv.model;

import java.io.Serializable;

import java.util.Date;

/**
 * 系统版本: v1.0<br>
 * 开发人员: @author huadi<br>
 * 功能说明: Student<br>
 * 开发时间: 2017/11/25<br>
 */
public class Student implements Serializable {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * name
	 */
	private String name;


    /**
     * 获取id
     */
    public Integer getId() {
        return this.id;
    }

	/**
	 * 设置id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

    /**
     * 获取name
     */
    public String getName() {
        return this.name;
    }

	/**
	 * 设置name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}