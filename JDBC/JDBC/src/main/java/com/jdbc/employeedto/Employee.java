package com.jdbc.employeedto;

import java.util.Objects;

public class Employee 
{
	private int empId;
	private String empName;
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	public int hashCode()
	{
		return Objects.hash(empId,empName,empAddress);
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee)
		{
			Employee employee=(Employee)obj;
			
			if(this.empId==empId && this.empName.equalsIgnoreCase(this.empName))
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
