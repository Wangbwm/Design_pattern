package com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl;

import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.ComputerPart;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.ComputerPartVisitor;

public class Keyboard  implements ComputerPart {
 
   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}