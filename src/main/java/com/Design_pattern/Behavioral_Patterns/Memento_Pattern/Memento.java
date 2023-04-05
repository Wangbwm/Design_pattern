package com.Design_pattern.Behavioral_Patterns.Memento_Pattern;

public class Memento {
   private String state;
 
   public Memento(String state){
      this.state = state;
   }
 
   public String getState(){
      return state;
   }  
}