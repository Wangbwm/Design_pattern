package com.Design_pattern.Creational_Patterns.Prototype_Pattern;

import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.Shape;
import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend.Circle;
import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend.Rectangle;
import com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape.extend.Square;

import java.util.Hashtable;
 
public class ShapeCache {
    
   private static Hashtable<String, Shape> shapeMap
      = new Hashtable<String, Shape>();
 
   public static Shape getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);
      return (Shape) cachedShape.clone();
   }
 
   // ��ÿ����״���������ݿ��ѯ������������״
   // shapeMap.put(shapeKey, shape);
   // ���磬����Ҫ���������״
   public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);
 
      Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);
 
      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(),rectangle);
   }
}