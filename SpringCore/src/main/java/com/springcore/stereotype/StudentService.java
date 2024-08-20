package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/stereotype/studentstereotype.xml");
		
		Student student1 = context.getBean("student",Student.class);
		
		System.out.println(student1);
	}
}
