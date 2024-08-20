package com.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TableForImage 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			String q="create  table images(id int(10) primary key auto_increment, pic blob)";
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			pstmt.executeUpdate();
			System.out.println("Table created....!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
