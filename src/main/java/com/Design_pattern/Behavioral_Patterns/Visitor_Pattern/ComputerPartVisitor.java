package com.Design_pattern.Behavioral_Patterns.Visitor_Pattern;

import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.Computer;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.Keyboard;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.Monitor;
import com.Design_pattern.Behavioral_Patterns.Visitor_Pattern.impl.Mouse;

public interface ComputerPartVisitor {
   public void visit(Computer computer);
   public void visit(Mouse mouse);
   public void visit(Keyboard keyboard);
   public void visit(Monitor monitor);
}