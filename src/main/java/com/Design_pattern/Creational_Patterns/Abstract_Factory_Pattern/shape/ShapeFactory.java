package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.shape;

import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.AbstractFactory;
import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.color.Color;

public class ShapeFactory extends AbstractFactory {

   @Override
   public Color getColor(String color) {
      return null;
   }
   @Override
   //使用 getShape 方法获取形状类型的对象
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      switch (shapeType){
         case "CIRCLE":
            return new Circle();
         case "RECTANGLE":
            return new Rectangle();
         case "SQUARE":
            return new Square();
         default:
            return null;
      }

   }
}