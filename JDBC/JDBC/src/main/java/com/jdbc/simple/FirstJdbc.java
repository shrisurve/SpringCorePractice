package com.jdbc.simple;
import java.lang.*;
import java.sql.*;
public class FirstJdbc 
{
	public static void main(String[] args) 
	{
		try
		{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//connection.close();
			
			if(connection.isClosed())
			{
				System.out.println("closed connection");
			}
			else 
			{
				System.out.println("create connection");
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
