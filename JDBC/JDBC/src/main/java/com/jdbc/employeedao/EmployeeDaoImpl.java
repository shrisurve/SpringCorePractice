package com.jdbc.employeedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.employeedto.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{

	@Override
	public Connection getConnection() 
	{
		Connection connection=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
			System.out.println("connected....");
			return connection;
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
		
	}

	@Override
	public void create() 
	{
		try
		{
			Connection connection=getConnection();
			String q="create table employee(empId int(20) primary key,empName varchar(50) not null,empAddress varchar(100)not null)";
			Statement statement=connection.createStatement();
			statement.execute(q);
			System.out.println("Table Created....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void insert(Employee employee) 
	{
		Connection connection=getConnection();
		String q="insert into employee(empId,empName,empAddress) values(?,?,?)";
		try
		{
			PreparedStatement statement=connection.prepareStatement(q);
			
			statement.setInt(1, employee.getEmpId());
			statement.setString(2, employee.getEmpName());
			statement.setString(3, employee.getEmpAddress());
			
			statement.executeUpdate();
			
			System.out.println("Data inserted successfully....");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Employee employee) 
	{
		Connection connection=getConnection();
		String q="update employee set empName=?,empAddress=? where empId=?";
		try 
		{
			PreparedStatement statement=connection.prepareStatement(q);
			statement.setString(1, employee.getEmpName());
			statement.setString(2, employee.getEmpAddress());
			statement.setInt(3, employee.getEmpId());
			
			statement.executeUpdate();
			System.out.println("Data update successfully....");
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void read(int id) 
	{
		Connection connection=getConnection();
		String q="select * from employee where empId=?";
		try {
			   PreparedStatement statement=connection.prepareStatement(q);
			   statement.setInt(1, id);
			   
			   ResultSet set=statement.executeQuery();
			   while(set.next())
			   {
				   int id1=set.getInt(1);
				   String name=set.getString(2);
				   String address=set.getString(3);
				   
				   System.out.println(id+" : "+name+" : "+address);
				   
			   }
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void readAll() 
	{
		Connection connection=getConnection();
		String q="select * from employee";
		try {
			   Statement statement=connection.createStatement();
			   ResultSet set=statement.executeQuery(q);
			   while(set.next())
			   {
				   int id=set.getInt(1);
				   String name=set.getString(2);
				   String address=set.getString(3);
				   
				   System.out.println(id+" : "+name+" : "+address);
			   }
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) 
	{
		Connection connection=getConnection();
		String q="delete from employee where empId=?";
		try {
				PreparedStatement statement=connection.prepareStatement(q);
				statement.setInt(1, id);
				statement.executeUpdate();
				System.out.println("deleted successfully....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
