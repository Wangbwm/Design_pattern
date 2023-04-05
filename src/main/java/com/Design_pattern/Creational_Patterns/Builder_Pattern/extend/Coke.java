package com.Design_pattern.Creational_Patterns.Builder_Pattern.extend;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl.ColdDrink;

public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}