package com.Design_pattern.J2EE.Service_Locator_Pattern.impl;

import com.Design_pattern.J2EE.Service_Locator_Pattern.Service;

public class Service2 implements Service {
   public void execute(){
      System.out.println("Executing Service2");
   }
 
   @Override
   public String getName() {
      return "Service2";
   }
}