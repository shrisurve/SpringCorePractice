package com.jdbc.simple;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class LargeImageInsert 
{
	public static void main(String[] args) 
	{
		try
		{
			Connection connection=ConnectionProvider.getConnection();
			
//			System.out.println("created connection");
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			JFileChooser chooser=new JFileChooser();
			chooser.showOpenDialog(null);
			
			File file=chooser.getSelectedFile();
			
			FileInputStream inputStream=new FileInputStream(file);
			
			pstmt.setBinaryStream(1, inputStream,inputStream.available());
			
			pstmt.executeUpdate();

			
//			System.out.println("Large image aslo inserted...........");
			
			
			JOptionPane.showMessageDialog(null, "successfully....");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
