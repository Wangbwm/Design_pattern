package com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.extend;

import com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {
 
   public RealCustomer(String name) {
      this.name = name;    
   }
   
   @Override
   public String getName() {
      return name;
   }
   
   @Override
   public boolean isNil() {
      return false;
   }
}