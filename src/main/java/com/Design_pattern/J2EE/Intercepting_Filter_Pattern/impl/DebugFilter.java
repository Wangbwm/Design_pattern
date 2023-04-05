package com.Design_pattern.J2EE.Intercepting_Filter_Pattern.impl;

import com.Design_pattern.J2EE.Intercepting_Filter_Pattern.Filter;

public class DebugFilter implements Filter {
   public void execute(String request){
      System.out.println("request log: " + request);
   }
}