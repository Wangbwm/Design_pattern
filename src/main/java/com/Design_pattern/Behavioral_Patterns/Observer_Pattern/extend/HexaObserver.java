package com.Design_pattern.Behavioral_Patterns.Observer_Pattern.extend;

import com.Design_pattern.Behavioral_Patterns.Observer_Pattern.Observer;
import com.Design_pattern.Behavioral_Patterns.Observer_Pattern.Subject;

public class HexaObserver extends Observer {
 
   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public void update() {
      System.out.println( "Hex String: " 
      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}