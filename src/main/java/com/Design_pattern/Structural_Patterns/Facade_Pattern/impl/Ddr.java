package com.Design_pattern.Structural_Patterns.Facade_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Facade_Pattern.Computer;

/** * �ڴ��� */
public class Ddr implements Computer {
    @Override
    public void open() {
        System.out.println("�����ڴ�");
    }
}