package com.jdbc.employeedao;

import java.sql.Connection;

import com.jdbc.employeedto.Employee;

public interface EmployeeDao 
{
	public Connection getConnection();
	public void create();
	public void insert(Employee employee);
	public void update(Employee employee);
	public void read(int id);
	public void readAll();
	public void delete(int id);
	
}
