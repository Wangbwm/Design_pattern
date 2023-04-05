package com.Design_pattern.Creational_Patterns.Builder_Pattern.extend;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl.ColdDrink;

public class Pepsi extends ColdDrink {
 
   @Override
   public float price() {
      return 35.0f;
   }
 
   @Override
   public String name() {
      return "Pepsi";
   }
}