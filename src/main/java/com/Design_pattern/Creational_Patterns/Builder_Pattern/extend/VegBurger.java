package com.Design_pattern.Creational_Patterns.Builder_Pattern.extend;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl.Burger;

public class VegBurger extends Burger {
 
   @Override
   public float price() {
      return 25.0f;
   }
 
   @Override
   public String name() {
      return "Veg Burger";
   }
}