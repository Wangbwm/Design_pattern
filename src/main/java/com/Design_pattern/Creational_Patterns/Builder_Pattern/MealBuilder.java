package com.Design_pattern.Creational_Patterns.Builder_Pattern;

import com.Design_pattern.Creational_Patterns.Builder_Pattern.extend.ChickenBurger;
import com.Design_pattern.Creational_Patterns.Builder_Pattern.extend.Coke;
import com.Design_pattern.Creational_Patterns.Builder_Pattern.extend.Pepsi;
import com.Design_pattern.Creational_Patterns.Builder_Pattern.extend.VegBurger;

public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}