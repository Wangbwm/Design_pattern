package com.Design_pattern.Structural_Patterns.Proxy_Pattern;

import com.Design_pattern.Structural_Patterns.Proxy_Pattern.impl.ProxyImage;

public class ProxyPatternDemo {
   
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
 
      // ͼ�񽫴Ӵ��̼���
      image.display(); 
      System.out.println("");
      // ͼ����Ҫ�Ӵ��̼���
      image.display();  
   }
}