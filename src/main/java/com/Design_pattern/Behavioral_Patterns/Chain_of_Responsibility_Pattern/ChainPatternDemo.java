package com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern;

import com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern.extend.ConsoleLogger;
import com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern.extend.ErrorLogger;
import com.Design_pattern.Behavioral_Patterns.Chain_of_Responsibility_Pattern.extend.FileLogger;

public class ChainPatternDemo {
   
   private static AbstractLogger getChainOfLoggers(){
 
      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
 
      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);
 
      return errorLogger;  
   }
 
   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
 
      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
 
      loggerChain.logMessage(AbstractLogger.DEBUG, 
         "This is a debug level information.");
 
      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   }
}