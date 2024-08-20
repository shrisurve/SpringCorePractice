package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Jdbc2 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
//			String q="create table Teacher(tid int(10) primary key not null auto_increment, tname varchar(50) not null, taddress varchar(50) not null)";
//			
//			Statement statement=connection.createStatement();
//			statement.executeUpdate(q);
//			System.out.println("Table created.....");
//			
			
			String q1="insert into Teacher(tname,taddress) values(?,?)";
			PreparedStatement pstmt=connection.prepareStatement(q1);
			pstmt.setString(1, "Kudale");
			pstmt.setString(2, "SinhgadCollege");
			
			pstmt.executeUpdate();
			
			System.out.println("Data inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
