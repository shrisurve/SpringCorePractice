package com.jdbc.simple;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDynamicallyData 
{
	public static void main(String[] args) 
	{
		try {
				//loading the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				//creating a connection
				Connection connection=
						DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
				//create query
				
				String q="insert into employee(empName,empCity) values(?,?)";
				
				//get the Prepared Object
				
				PreparedStatement pstmt=connection.prepareStatement(q);
				
				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter the Name: ");
				String name=reader.readLine();
				
				System.out.println("Enter the City: ");
				String city=reader.readLine();
				
				
				//set the value to query
				
				pstmt.setString(1, name);
				pstmt.setString(2, city);
				
				pstmt.executeUpdate();
				
				System.out.println("Data Inseting Successfully");
				
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
