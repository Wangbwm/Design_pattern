package com.Design_pattern.Behavioral_Patterns.Observer_Pattern.extend;

import com.Design_pattern.Behavioral_Patterns.Observer_Pattern.Observer;
import com.Design_pattern.Behavioral_Patterns.Observer_Pattern.Subject;

public class BinaryObserver extends Observer {
 
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString( subject.getState() ) ); 
   }
}