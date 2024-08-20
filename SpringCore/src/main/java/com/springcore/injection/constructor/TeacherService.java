package com.springcore.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherService 
{
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/constructor/teacher.xml");
		
		Teacher teacher=context.getBean("teacher1",Teacher.class);
		
		System.out.println(teacher);
	}
}
