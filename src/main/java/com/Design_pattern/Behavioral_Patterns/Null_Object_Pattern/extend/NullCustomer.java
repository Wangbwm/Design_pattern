package com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.extend;

import com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
 
   @Override
   public String getName() {
      return "Not Available in Customer Database";
   }
 
   @Override
   public boolean isNil() {
      return true;
   }
}