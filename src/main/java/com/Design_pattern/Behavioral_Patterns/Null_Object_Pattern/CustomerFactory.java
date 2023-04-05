package com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern;

import com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.extend.NullCustomer;
import com.Design_pattern.Behavioral_Patterns.Null_Object_Pattern.extend.RealCustomer;

public class CustomerFactory {
   
   public static final String[] names = {"Rob", "Joe", "Julie"};
 
   public static AbstractCustomer getCustomer(String name){
      for (int i = 0; i < names.length; i++) {
         if (names[i].equalsIgnoreCase(name)){
            return new RealCustomer(name);
         }
      }
      return new NullCustomer();
   }
}