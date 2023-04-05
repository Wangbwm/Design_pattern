package com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern;

import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.color.Color;
import com.Design_pattern.Creational_Patterns.Abstract_Factory_Pattern.shape.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}