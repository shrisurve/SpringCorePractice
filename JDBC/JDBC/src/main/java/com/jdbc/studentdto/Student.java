package com.jdbc.studentdto;

import java.util.Objects;

public class Student 
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(studentAddress, studentId, studentName);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Student)
		{
			Student s1=(Student)obj;
			
			if(this.studentId==s1.studentId && this.studentName.equalsIgnoreCase(s1.studentName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
}
