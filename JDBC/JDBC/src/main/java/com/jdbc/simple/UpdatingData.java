package com.jdbc.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatingData 
{
	public static void main(String[] args) 
	{
		try
		{
			Connection connection=ConnectionProvider.getConnection();
			
			String q="update employee set empName=?,empCity=? where empId=?";
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the New Name:- ");
			String name=reader.readLine();
			
			System.out.println("Enter the New City:- ");
			String city=reader.readLine();
			
			System.out.println("Enter the Id:- ");
			int id=Integer.parseInt(reader.readLine());
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			
			System.out.println("Data Updated Successfully.......");
			
			connection.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
