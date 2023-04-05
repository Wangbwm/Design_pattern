package com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Packing;

public class Bottle implements Packing {
 
   @Override
   public String pack() {
      return "Bottle";
   }
}