package com.quhaiming.service;

import com.quhaiming.pojo.Student;

/**
 * @author 72348
 *
 */
public interface StudentsService {

	
	/**
	 * 获取一个学生
	 * @param id
	 * @return
	 */
	Student getById(int id);
	/**
	 * 添加年龄
	 * @param n
	 * @return
	 */
	Student addAge(Student stu, int n);
	

	/**
	 * 输入数字进行数学操作
	 * @param n
	 * @return
	 */
	Integer addSome(Integer n,String arithmetic,Integer h);
	
	
	
	
}
