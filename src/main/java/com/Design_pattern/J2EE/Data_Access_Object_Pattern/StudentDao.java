package com.Design_pattern.J2EE.Data_Access_Object_Pattern;

import java.util.List;
 
public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}