package com.springcore.injection.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionStandalone 
{
	private List<Integer>numbers;
	private Set<String>names;
	private Map<Integer,String>map;
	public List<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public void start()
	{
		System.out.println("start");
	}
	public void end()
	{
		System.out.println("end");
	}
	@Override
	public String toString() {
		return "CollectionStandalone [numbers=" + numbers + ", names=" + names + ", map=" + map + "]";
	}
	
	
	
}
