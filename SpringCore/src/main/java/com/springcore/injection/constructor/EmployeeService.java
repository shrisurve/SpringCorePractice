package com.springcore.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/constructor/employee.xml");
		Employee employee=context.getBean("employee1",Employee.class);
		
		System.out.println(employee);
	}
}
