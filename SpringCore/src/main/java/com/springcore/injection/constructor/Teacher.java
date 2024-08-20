package com.springcore.injection.constructor;

public class Teacher 
{
	private int teacherId;
	private String teacherName;
	private double teacherSalary;
	public Teacher(int teacherId, String teacherName, double teacherSalary) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherSalary = teacherSalary;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSalary=" + teacherSalary
				+ "]";
	}
	
	
}
