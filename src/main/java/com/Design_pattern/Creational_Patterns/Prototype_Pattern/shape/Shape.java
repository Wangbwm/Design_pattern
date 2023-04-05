package com.Design_pattern.Creational_Patterns.Prototype_Pattern.shape;

public abstract class Shape implements Cloneable {
   
   private String id;
   protected String type;
   
   protected abstract void draw();
   
   public String getType(){
      return type;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   @Override
   public Object clone() {
      Object clone = null;
      try {
         clone = super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
}