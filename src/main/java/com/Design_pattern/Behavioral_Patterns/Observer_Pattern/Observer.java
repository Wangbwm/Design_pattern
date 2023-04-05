package com.Design_pattern.Behavioral_Patterns.Observer_Pattern;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}