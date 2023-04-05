package com.Design_pattern.Behavioral_Patterns.Strategy_Pattern.impl;

import com.Design_pattern.Behavioral_Patterns.Strategy_Pattern.Strategy;

public class OperationSubtract implements Strategy {
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}