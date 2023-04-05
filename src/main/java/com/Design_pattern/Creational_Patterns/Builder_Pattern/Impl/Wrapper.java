package com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Packing;

public class Wrapper implements Packing {
 
   @Override
   public String pack() {
      return "Wrapper";
   }
}