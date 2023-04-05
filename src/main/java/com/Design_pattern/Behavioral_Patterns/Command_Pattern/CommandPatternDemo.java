package com.Design_pattern.Behavioral_Patterns.Command_Pattern;

import com.Design_pattern.Behavioral_Patterns.Command_Pattern.impl.BuyStock;
import com.Design_pattern.Behavioral_Patterns.Command_Pattern.impl.SellStock;

public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();
 
      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);
 
      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);
 
      broker.placeOrders();
   }
}