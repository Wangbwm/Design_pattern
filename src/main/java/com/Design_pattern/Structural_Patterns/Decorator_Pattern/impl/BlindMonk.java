package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;

//ConcreteComponent 具体英雄盲僧
public class BlindMonk implements Hero {
    
    private String name;
    
    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}