package com.Design_pattern.Creational_Patterns.Factory_Pattern;

public class ShapeFactory {
    
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