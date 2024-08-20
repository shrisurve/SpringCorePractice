package com.jdbc.practice;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc3 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			String q="insert into company(compName,compAddress) values(?,?)";
			
			PreparedStatement statement=connection.prepareStatement(q);
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter compName: ");
			String name=reader.readLine();
			System.out.println("Enter compAddress: ");
			String address=reader.readLine();
			
			statement.setString(1, name);
			statement.setString(2, address);
			
			statement.executeUpdate();
			
			System.out.println("Data inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
