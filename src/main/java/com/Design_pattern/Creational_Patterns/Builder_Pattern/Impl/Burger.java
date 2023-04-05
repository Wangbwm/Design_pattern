package com.Design_pattern.Creational_Patterns.Builder_Pattern.Impl;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.Item;
import com.Design_pattern.Creational_Patterns.Builder_Pattern.Packing;

public abstract class Burger implements Item {
 
   @Override
   public Packing packing() {
      return new Wrapper();
   }
 
   @Override
   public abstract float price();
   @Override
   public abstract String name();
}