package com.Design_pattern.Structural_Patterns.Proxy_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Proxy_Pattern.Image;

public class RealImage implements Image {
 
   private String fileName;
 
   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }
 
   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }
 
   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}