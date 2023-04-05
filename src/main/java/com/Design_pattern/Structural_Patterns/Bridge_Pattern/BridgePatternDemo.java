package com.Design_pattern.Structural_Patterns.Bridge_Pattern;

import com.Design_pattern.Structural_Patterns.Bridge_Pattern.extend.Circle;
import com.Design_pattern.Structural_Patterns.Bridge_Pattern.impl.GreenCircle;
import com.Design_pattern.Structural_Patterns.Bridge_Pattern.impl.RedCircle;

public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
 
      redCircle.draw();
      greenCircle.draw();
   }
}