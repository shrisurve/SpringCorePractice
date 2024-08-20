package com.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataInTable 
{
	public static void main(String[] args) 
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//query for inserting data
			
			String q="insert into employee(empName,empCity) values(?,?)";
			
			//get the PreparedStatement object
			PreparedStatement pstmt = connection.prepareStatement(q);
			
			//set the values to the query
			
			pstmt.setString(1, "Shubham Puri");
			pstmt.setString(2, "Pune");
			
			pstmt.executeUpdate();
			
			System.out.println("All files are check and error free"
					+ "\nData inserted Successfully.......Thank u!!!!");
			
			connection.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
