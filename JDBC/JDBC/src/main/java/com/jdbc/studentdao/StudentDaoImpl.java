package com.jdbc.studentdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.studentdto.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void create() {
		try {

			Connection connection = getConnection();
			String q = "create table student(studId int(20) primary key,studName varchar(50) not null,studAddress varchar(100) not null)";

			Statement statement = connection.createStatement();
			statement.execute(q);
			
			System.out.println("Table created...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insert(Student student)
	{
		Connection connection=getConnection();
		String q="insert into student(studId,studName,studAddress) value(?,?,?)";
		
		try {
			
			PreparedStatement statement=connection.prepareStatement(q);
			
			statement.setInt(1, student.getStudentId());
			statement.setString(2, student.getStudentName());
			statement.setString(3, student.getStudentAddress());
			
			statement.executeUpdate();
			
			System.out.println("Data inserted successfully....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Student student) 
	{
	   try {
		   Connection connection=getConnection();
		   String q="update student set studName=?,studAddress=? where studId=?";
		   
		   PreparedStatement statement=connection.prepareStatement(q);
		   statement.setString(1, student.getStudentName());
		   statement.setString(2, student.getStudentAddress());
		   statement.setInt(3, student.getStudentId());
		   
		   statement.executeUpdate();
		   
		   System.out.println("Data Updated Successfully...");
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
		

	}

	@Override
	public void read(int id) 
	{
		Connection connection=getConnection();
		String q="select * from student where studId=?";
		try
		{
		  PreparedStatement statement=connection.prepareStatement(q);
		  statement.setInt(1, id);
		  ResultSet set=statement.executeQuery();
			while(set.next())
			{
				int id1=set.getInt(1);
				String name=set.getString(2);
				String address=set.getString(3);
				
				System.out.println(id1+" : "+name+" : "+address);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void readAll() 
	{
		Connection connection=getConnection();
		String q="select * from student";
		try
		{
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery(q);
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String address=set.getString(3);
				
				System.out.println(id+" : "+name+" : "+address);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) 
	{
		Connection connection=getConnection();
		String q="delete from student where studId=?";
		try
		{
			PreparedStatement statement=connection.prepareStatement(q);
			statement.setInt(1, id);
			
			statement.executeUpdate();
			System.out.println("Data deleted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public Connection getConnection() {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("Connected....");
			return connection;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;

	}

}
