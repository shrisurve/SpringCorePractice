package com.jdbc.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertIntoStudent 
{
	public static void main(String[] args) 
	{
		try {
			

			Connection connection=ConnectionProvider.getConnection();
			
			String q="insert into student(id,name,address) values(?,?,?)";
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the Id: ");
			int id=reader.read();
			reader.readLine();
			System.out.println("Enter the Name:- ");
			String name=reader.readLine();
			System.out.println("Enter the City:- ");
			String city=reader.readLine();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Data Inserted Successfully........");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
