package com.jdbc.simple;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDynamically 
{
	public static void main(String[] args) 
	{
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection
			
			Connection connection=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//write a query
			
			String q="insert into student(id,name,address) values(?,?,?)";
			
			//get the Prepared Object
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			
			//taking input
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the Id: ");
			int id=reader.read();
			reader.readLine();
			
			System.out.println("Enter the name: ");
			String name=reader.readLine();
			
			System.out.println("Enter the Address: ");
			String address=reader.readLine();
			
			//set values into query
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			
			pstmt.executeUpdate();
			
			System.out.println("Data Inserted Successfully......!!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
