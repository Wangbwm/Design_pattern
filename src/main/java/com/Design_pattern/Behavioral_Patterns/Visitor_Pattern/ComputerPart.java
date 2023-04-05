package com.Design_pattern.Behavioral_Patterns.Visitor_Pattern;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}