package com.jdbc.simple;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectingData2 
{
	public static void main(String[] args) 
	{
		try {
			
			Connection connection=ConnectionProvider.getConnection();
			
			String q="select * from student";
			
			Statement statement=connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery(q);
			while(resultSet.next())
			{
				int id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String city=resultSet.getString(3);
				
				System.out.println(id+" : "+name+" : "+city);
			}
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
