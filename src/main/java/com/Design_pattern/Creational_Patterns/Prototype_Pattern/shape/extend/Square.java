package com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend;

import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.Shape;

public class Square extends Shape {
 
   public Square(){
     type = "Square";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}