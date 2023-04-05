package com.Design_pattern.J2EE.Data_Access_Object_Pattern;

import com.Design_pattern.J2EE.Data_Access_Object_Pattern.impl.StudentDaoImpl;

public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();
 
      //������е�ѧ��
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : "
            +student.getRollNo()+", Name : "+student.getName()+" ]");
      }
 
 
      //����ѧ��
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);
 
      //��ȡѧ��
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : "
         +student.getRollNo()+", Name : "+student.getName()+" ]");      
   }
}