package com.springcore.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PuneNarheService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/autowiring/xml/punenarhe.xml");
		
		Pune pune = context.getBean("pune1",Pune.class);
		
		System.out.println(pune);
	}
}
