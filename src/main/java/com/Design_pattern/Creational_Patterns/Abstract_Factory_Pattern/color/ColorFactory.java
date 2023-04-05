package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.color;

import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.AbstractFactory;
import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }
      switch (color){
         case "RED":
            return new Red();
         case "GREEN":
            return new Green();
         case "BLUE":
            return new Blue();
         default:
            return null;
      }
   }
}