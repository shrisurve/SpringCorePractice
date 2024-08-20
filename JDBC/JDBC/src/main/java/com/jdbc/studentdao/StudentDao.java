package com.jdbc.studentdao;

import java.sql.Connection;

import com.jdbc.studentdto.Student;

public interface StudentDao 
{
	public Connection getConnection();
	public void create();
	public void insert(Student student);
	public void update(Student student);
	public void read(int id);
	public void readAll();
	public void delete(int id);
	
}
