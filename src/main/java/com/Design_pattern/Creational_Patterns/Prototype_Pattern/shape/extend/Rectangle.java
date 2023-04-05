package com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend;


import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.Shape;

public class Rectangle extends Shape {
 
   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}