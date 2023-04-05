package com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern.impl;

import com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern.Expression;

public class TerminalExpression implements Expression {
   
   private String data;
 
   public TerminalExpression(String data){
      this.data = data; 
   }
 
   @Override
   public boolean interpret(String context) {
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}