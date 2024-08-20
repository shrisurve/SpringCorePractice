package com.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TableCreating 
{
	public static void main(String[] args) 
	{
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//query for creating a table
			
			String q="create table employee(empId int(20) primary key auto_increment,empName varchar(200) not null, empCity varchar(50) not null)";
			
			//create a statement
			
			Statement stmt=connection.createStatement();
			stmt.executeUpdate(q);
			
			System.out.println("table created in database");
			
			connection.close();
					
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
