package com.Design_pattern.Structural_Patterns.Facade_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Facade_Pattern.Computer;

/** * Ӳ���� */
public class Ssd implements Computer {
    @Override
    public void open() {
        System.out.println("����Ӳ��");
    }
}