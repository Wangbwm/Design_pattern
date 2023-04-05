package com.Design_pattern.J2EE.Business_Delegate_Pattern.impl;

import com.Design_pattern.J2EE.Business_Delegate_Pattern.BusinessService;

public class EJBService implements BusinessService {
 
   @Override
   public void doProcessing() {
      System.out.println("Processing task by invoking EJB Service");
   }
}