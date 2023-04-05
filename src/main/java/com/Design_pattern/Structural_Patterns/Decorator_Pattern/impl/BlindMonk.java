package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;

//ConcreteComponent ����Ӣ��äɮ
public class BlindMonk implements Hero {
    
    private String name;
    
    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "ѧϰ�����ϼ��ܣ�");
    }
}