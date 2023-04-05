package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}