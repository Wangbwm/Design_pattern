package com.Design_pattern.Structural_Patterns.Adapter_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Adapter_Pattern.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
 
   @Override
   public void playVlc(String fileName) {
      //ʲôҲ����
   }
 
   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);      
   }
}