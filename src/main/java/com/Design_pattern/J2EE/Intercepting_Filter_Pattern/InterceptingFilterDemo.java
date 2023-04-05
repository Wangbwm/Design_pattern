package com.Design_pattern.J2EE.Intercepting_Filter_Pattern;

import com.Design_pattern.J2EE.Intercepting_Filter_Pattern.impl.AuthenticationFilter;
import com.Design_pattern.J2EE.Intercepting_Filter_Pattern.impl.DebugFilter;

public class InterceptingFilterDemo {
   public static void main(String[] args) {
      FilterManager filterManager = new FilterManager(new Target());
      filterManager.setFilter(new AuthenticationFilter());
      filterManager.setFilter(new DebugFilter());
 
      Client client = new Client();
      client.setFilterManager(filterManager);
      client.sendRequest("HOME");
   }
}