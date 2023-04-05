package com.Design_pattern.Structural_Patterns.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite {
   private final List<Composite> list;

   public void add(Composite c) {
      list.add(c);
   }

   final private String name;

   public Composite(String name) {
      this.list = new ArrayList<>();
      this.name = name;
   }

   //∂‡Ã¨
   void printComposite() {
      System.out.println(name);
      for (Composite com : list) {
         com.printComposite();
      }
   }
}