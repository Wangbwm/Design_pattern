package com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern;

import com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern.impl.AndExpression;
import com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern.impl.OrExpression;
import com.Design_pattern.Behavioral_Patterns.Interpreter_Pattern.impl.TerminalExpression;

public class InterpreterPatternDemo {
 
   //����Robert �� John ������
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);
   }
 
   //����Julie ��һ���ѻ��Ů��
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);
   }
 
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
 
      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " 
      + isMarriedWoman.interpret("Married Julie"));
   }
}