package com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.Hero;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.Skills;

//ConreteDecorator 技能：E
public class Skill_E extends Skills {
    
    private String skillName;
    
    public Skill_E(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能E:"+skillName);
        super.learnSkills();
    }
}