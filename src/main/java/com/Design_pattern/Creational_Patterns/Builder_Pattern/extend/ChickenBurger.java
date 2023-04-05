package com.Design_pattern.Creational_Patterns.Builder_Pattern.extend;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl.Burger;

public class ChickenBurger extends Burger {
 
   @Override
   public float price() {
      return 50.5f;
   }
 
   @Override
   public String name() {
      return "Chicken Burger";
   }
}