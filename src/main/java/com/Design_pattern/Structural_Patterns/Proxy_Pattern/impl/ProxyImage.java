package com.Design_pattern.Structural_Patterns.Proxy_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Proxy_Pattern.Image;

public class ProxyImage implements Image {
 
   private RealImage realImage;
   private String fileName;
 
   public ProxyImage(String fileName){
      this.fileName = fileName;
   }
 
   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}