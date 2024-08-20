package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 
{
	public static void main(String[] args) 
	{
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//crete the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			System.out.println("Connection created successfully");
			
			//create the table
			
			String q="create table company(compId int(20) primary key auto_increment,compName varchar(50) not null,compAddress varchar(100) not null)";
			
			Statement stmt=connection.createStatement();
			stmt.executeUpdate(q);
			
			System.out.println("Table created successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
