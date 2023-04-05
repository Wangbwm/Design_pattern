package com.Design_pattern.Structural_Patterns.Proxy_Pattern;

import com.Design_pattern.Structural_Patterns.Proxy_Pattern.impl.ProxyImage;

public class ProxyPatternDemo {
   
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
 
      // 图像将从磁盘加载
      image.display(); 
      System.out.println("");
      // 图像不需要从磁盘加载
      image.display();  
   }
}