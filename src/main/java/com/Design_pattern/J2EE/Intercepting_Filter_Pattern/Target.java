package com.Design_pattern.J2EE.Intercepting_Filter_Pattern;

public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}