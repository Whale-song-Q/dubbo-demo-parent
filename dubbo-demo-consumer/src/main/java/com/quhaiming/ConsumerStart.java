package com.quhaiming;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quhaiming.pojo.Student;
import com.quhaiming.service.StudentsService;

public class ConsumerStart {

	public static void main(String[] args) throws IOException {
		
		//加载上下文
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("classpath:Applicationcontext.xml");
		
		StudentsService studentsService = context.getBean(StudentsService.class);
/*		System.out.println("原来学生信息："+studentsService.getById(20));
		Student addAge = studentsService.addAge(studentsService.getById(20), 5);
		System.out.println("年龄增加后的学会："+addAge);*/
		
		Integer addSome = studentsService.addSome(5, "-", 10);
		System.out.println("运算结果："+addSome);
		
	}
	
	
	
}
