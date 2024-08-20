package com.jdbc.employeecontroller;

import com.jdbc.employeedao.EmployeeDao;
import com.jdbc.employeedao.EmployeeDaoImpl;
import com.jdbc.employeedto.Employee;

public class EmployeeService 
{
	public static void main(String[] args) 
	{
		EmployeeDao dao=new EmployeeDaoImpl();
		//dao.getConnection();
		
//		dao.create();
		
//		Employee employee=new Employee();
//		employee.setEmpId(4);
//		employee.setEmpName("Ajay");
//		employee.setEmpAddress("Latur");
//		
//		dao.insert(employee);
//		
//		Employee employee=new Employee();
//		employee.setEmpId(4);
//		employee.setEmpName("Vijay");
//		employee.setEmpAddress("Chakan");
//		
//		dao.update(employee);
		
		
		
		
//		Employee employee=new Employee();
//		dao.readAll();
		
		
//		
//		Employee employee=new Employee();
//		dao.read(1);
		
		
		Employee employee=new Employee();
		dao.delete(4);
		
	}
}
