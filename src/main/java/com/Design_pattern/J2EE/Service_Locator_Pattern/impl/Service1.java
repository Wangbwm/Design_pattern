package com.Design_pattern.J2EE.Service_Locator_Pattern.impl;

import com.Design_pattern.J2EE.Service_Locator_Pattern.Service;

public class Service1 implements Service {
   public void execute(){
      System.out.println("Executing Service1");
   }
 
   @Override
   public String getName() {
      return "Service1";
   }
}