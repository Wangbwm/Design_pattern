package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern;

import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.color.ColorFactory;
import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.shape.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}