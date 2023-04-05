package com.Design_pattern.Structural_Patterns.Filter_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Filter_Pattern.Criteria;
import com.Design_pattern.Structural_Patterns.Filter_Pattern.Person;

import java.util.ArrayList;
import java.util.List;
 
public class CriteriaSingle implements Criteria {
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> singlePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
            singlePersons.add(person);
         }
      }
      return singlePersons;
   }
}