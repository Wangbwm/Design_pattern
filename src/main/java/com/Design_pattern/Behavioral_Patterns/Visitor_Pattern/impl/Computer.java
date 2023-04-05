package com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl;

import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.ComputerPart;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.ComputerPartVisitor;

public class Computer implements ComputerPart {
   
   ComputerPart[] parts;
 
   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
   } 
 
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}