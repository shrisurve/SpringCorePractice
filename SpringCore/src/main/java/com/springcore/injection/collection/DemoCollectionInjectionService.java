package com.springcore.injection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCollectionInjectionService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/collection/collectiondemo.xml");
		
		DemoCollectionInjection collectionInjection=context.getBean("collection2",DemoCollectionInjection.class);
		
		System.out.println(collectionInjection);
	}
}
