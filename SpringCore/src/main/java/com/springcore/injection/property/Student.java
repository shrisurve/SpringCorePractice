package com.springcore.injection.property;

public class Student 
{
	private String studentName;
	private int studentId;
	private String coursefield;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCoursefield() {
		return coursefield;
	}
	public void setCoursefield(String coursefield) {
		this.coursefield = coursefield;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", coursefield=" + coursefield
				+ "]";
	}
	
	
}
