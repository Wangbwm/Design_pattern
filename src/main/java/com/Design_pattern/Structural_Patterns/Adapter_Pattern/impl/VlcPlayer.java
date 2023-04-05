package com.Design_pattern.Structural_Patterns.Adapter_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Adapter_Pattern.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //ʲôҲ����
   }
}