package com.springcore.injection.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PuneStandalone 
{
	private Set<Integer>numbers;
	private List<String>names;
	private Map<Integer,String>map;
	public Set<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "PuneStandalone [numbers=" + numbers + ", names=" + names + ", map=" + map + "]";
	}
	
	
	
}
