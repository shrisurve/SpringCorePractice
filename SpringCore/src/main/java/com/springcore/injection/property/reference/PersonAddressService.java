package com.springcore.injection.property.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonAddressService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/property/reference/personaddress.xml");
		
		Person person = context.getBean("999",Person.class);
		
		System.out.println(person);
	}
}
