package com.quhaiming.service.Impl;

import com.quhaiming.pojo.Student;
import com.quhaiming.service.StudentsService;

public class StudentServiceImpl implements StudentsService{

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student=new Student(20,"张三"+id,id);
		return student;
	}

	@Override
	public Student addAge(Student stu,int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+n);
		
		return stu;
	}

	@Override
	public Integer addSome(Integer n, String arithmetic,Integer h) {
		// TODO Auto-generated method stub
		if(arithmetic.equals("+")){
			
			n+=h;
		}else if(arithmetic.equals("-")){
			
			n-=h;
			
		}else if(arithmetic.equals("*")){
			
			n*=h;
			
		}else if(arithmetic.equals("/")){
					
			n/=h;	
					
		}
		
		return n;
	}

	
}
