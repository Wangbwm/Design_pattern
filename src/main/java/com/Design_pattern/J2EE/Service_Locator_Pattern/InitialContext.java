package com.Design_pattern.J2EE.Service_Locator_Pattern;

import com.Design_pattern.J2EE.Service_Locator_Pattern.impl.Service1;
import com.Design_pattern.J2EE.Service_Locator_Pattern.impl.Service2;

public class InitialContext {
   public Object lookup(String jndiName){
      if(jndiName.equalsIgnoreCase("SERVICE1")){
         System.out.println("Looking up and creating a new Service1 object");
         return new Service1();
      }else if (jndiName.equalsIgnoreCase("SERVICE2")){
         System.out.println("Looking up and creating a new Service2 object");
         return new Service2();
      }
      return null;      
   }
}