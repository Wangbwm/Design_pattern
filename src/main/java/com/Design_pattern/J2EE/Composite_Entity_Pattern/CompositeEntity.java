package com.Design_pattern.J2EE.Composite_Entity_Pattern;

public class CompositeEntity {
   private CoarseGrainedObject cgo = new CoarseGrainedObject();
 
   public void setData(String data1, String data2){
      cgo.setData(data1, data2);
   }
 
   public String[] getData(){
      return cgo.getData();
   }
}