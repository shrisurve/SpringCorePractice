package com.jdbc.simple;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageInsert 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			FileInputStream inputStream=new FileInputStream("/home/shrikant/Pictures/shri.jpg");
			pstmt.setBinaryStream(1, inputStream,inputStream.available());
			pstmt.executeUpdate();
			
			System.out.println("Picture inserted Successfully......");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
