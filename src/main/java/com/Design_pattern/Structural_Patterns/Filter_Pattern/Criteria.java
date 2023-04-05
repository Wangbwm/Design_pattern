package com.Design_pattern.Structural_Patterns.Filter_Pattern;

import java.util.List;
 
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}