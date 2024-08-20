package com.springcore.injection.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PuneStandaloneService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/collection/standalone/punestandalone.xml");
		
		PuneStandalone standalone=context.getBean("pune1",PuneStandalone.class);
		
		System.out.println(standalone);
	}
}
