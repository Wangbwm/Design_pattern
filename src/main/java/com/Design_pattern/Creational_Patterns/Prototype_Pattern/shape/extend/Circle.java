package com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend;

import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.Shape;

public class Circle extends Shape {
 
   public Circle(){
     type = "Circle";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}