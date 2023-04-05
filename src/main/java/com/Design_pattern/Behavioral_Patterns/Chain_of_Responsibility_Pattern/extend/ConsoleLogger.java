package com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern.extend;

import com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
 
   public ConsoleLogger(int level){
      this.level = level;
   }
 
   @Override
   protected void write(String message) {    
      System.out.println("Standard Console::Logger: " + message);
   }
}