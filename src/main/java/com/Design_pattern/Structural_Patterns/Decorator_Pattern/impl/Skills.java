package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;

//Decorator ������
public class Skills implements Hero {
    
    //����һ��Ӣ�۶���ӿ�
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