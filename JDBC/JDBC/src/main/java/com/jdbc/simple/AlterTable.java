package com.jdbc.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AlterTable 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			String q="alter table images modify pic longblob";
			
			PreparedStatement statement=connection.prepareStatement(q);
			
			statement.executeUpdate();
			
			System.out.println("Data Updated successfully........");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
