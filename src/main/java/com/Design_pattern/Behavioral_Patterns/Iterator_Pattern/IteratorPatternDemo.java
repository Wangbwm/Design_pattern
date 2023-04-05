package com.Design_pattern.Behavioral_Patterns.Iterator_Pattern;

import com.Design_pattern.Behavioral_Patterns.Iterator_Pattern.impl.NameRepository;

public class IteratorPatternDemo {
   
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();
 
      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }  
   }
}