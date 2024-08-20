package com.jdbc.studentcontroller;

import com.jdbc.studentdao.StudentDao;
import com.jdbc.studentdao.StudentDaoImpl;
import com.jdbc.studentdto.Student;

public class StudentService 
{
	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
 
		//dao.create();
//		Student student=new Student();
//		student.setStudentId(3);
//		student.setStudentName("Shubham");
//		student.setStudentAddress("Banglore");
//		
//		dao.insert(student);
		
//		
//		Student student=new Student();
//		student.setStudentId(2);
//		student.setStudentName("Shrikant Surve");
//		student.setStudentAddress("Mumbai");
//		
//		dao.update(student);
		
		
		
//		Student student=new Student();
//		
//		dao.delete(1);
		
//		Student student=new Student();
//		dao.readAll();
		
		Student student=new Student();
		dao.read(2);
		
	}
}
