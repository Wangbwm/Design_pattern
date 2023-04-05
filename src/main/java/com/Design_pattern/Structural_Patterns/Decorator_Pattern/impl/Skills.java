package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;

//Decorator 技能栏
public class Skills implements Hero {
    
    //持有一个英雄对象接口
    private Hero hero;
    
    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if(hero != null)
            hero.learnSkills();
    }    
}