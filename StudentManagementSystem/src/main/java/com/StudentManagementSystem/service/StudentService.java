package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.entity.Student;

public interface StudentService 
{

	//List<Student> getAllStudents();
   public List<Student> getAllStudents();

   public Student saveStudent(Student student);
   
   public Student getById(int id);
   
   public void deleteById(int id);
}
