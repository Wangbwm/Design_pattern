package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.color;

public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}