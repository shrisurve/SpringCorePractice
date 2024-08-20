package com.springcore.injection.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/injection/property/student.xml");
		
		Student student=context.getBean("student1",Student.class);
		
		System.out.println(student);
	}
}
