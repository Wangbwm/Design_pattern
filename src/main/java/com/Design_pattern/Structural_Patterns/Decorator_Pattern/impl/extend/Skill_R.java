package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.Skills;

//ConreteDecorator ���ܣ�R
public class Skill_R extends Skills {
    
    private String skillName;
    
    public Skill_R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }
    
    @Override
    public void learnSkills() {
        System.out.println("ѧϰ�˼���R:" +skillName );
        super.learnSkills();
    }
}