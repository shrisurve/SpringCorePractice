package com.springcore.injection.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionService 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/injection/collection/collection.xml");
		
		CollectionInjection injection=context.getBean("collection1",CollectionInjection.class);
		
	 Set<String> names = injection.getNames();
	 Iterator itr=names.iterator();
	 while(itr.hasNext())
	 {
		 String string=itr.next().toString();
		 
		 System.out.println(string);
	 }
	 
	 List<String> numbers = injection.getNumbers();
	 for(String num:numbers)
	 {
		 System.out.println(num);
	 }
	 
	 Map<String, String> map = injection.getMap();
	 Set  <Entry<String,String>> entrySet = map.entrySet();
	 Iterator <Entry<String,String>> iterator = entrySet.iterator();
	 while(iterator.hasNext())
	 {
		 Entry<String,String>e=(Entry<String,String>)iterator.next();
		 System.out.println(e.getKey()+"    "+e.getValue());
	 }
 	}
}
