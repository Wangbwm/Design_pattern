package com.Design_pattern.Structural_Patterns.Bridge_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Bridge_Pattern.DrawAPI;

public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: "
         + radius +", x: " +x+", "+ y +"]");
   }
}