package com.Design_pattern.J2EE.Business_Delegate_Pattern;

import com.Design_pattern.J2EE.Business_Delegate_Pattern.impl.EJBService;
import com.Design_pattern.J2EE.Business_Delegate_Pattern.impl.JMSService;

public class BusinessLookUp {
   public BusinessService getBusinessService(String serviceType){
      if(serviceType.equalsIgnoreCase("EJB")){
         return new EJBService();
      }else {
         return new JMSService();
      }
   }
}