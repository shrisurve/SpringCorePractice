package com.springcore.injection.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjection 
{
	private Set<String>names;
	private List<String>numbers;
	private Map<String, String>map;
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "CollectionInjection [names=" + names + ", numbers=" + numbers + ", map=" + map + "]";
	}
	
	
}
