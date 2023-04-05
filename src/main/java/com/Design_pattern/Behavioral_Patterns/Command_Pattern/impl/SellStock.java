package com.Design_pattern.Behavioral_Patterns.Command_Pattern.impl;

import com.Design_pattern.Behavioral_Patterns.Command_Pattern.Order;
import com.Design_pattern.Behavioral_Patterns.Command_Pattern.Stock;

public class SellStock implements Order {
   private Stock abcStock;
 
   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }
 
   public void execute() {
      abcStock.sell();
   }
}