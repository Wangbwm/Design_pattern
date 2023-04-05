package com.Design_pattern.Behavioral_Patterns.Visitor_Pattern;

import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.Computer;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
   public static void main(String[] args) {
 
      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}