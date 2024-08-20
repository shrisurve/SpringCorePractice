package com.springcore.autowiring.xml;

public class Narhe 
{
	private String name;
	private String place;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Narhe [name=" + name + ", place=" + place + "]";
	}
	
	
}
