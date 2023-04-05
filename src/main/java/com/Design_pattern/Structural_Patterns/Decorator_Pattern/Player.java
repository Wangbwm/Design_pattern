package com.Design_pattern.Structural_Patterns.Decorator_Pattern;

import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.BlindMonk;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.Skills;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend.Skill_E;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend.Skill_Q;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend.Skill_R;
import com.Design_pattern.Structural_Patterns.Decorator_Pattern.impl.extend.Skill_W;

//�ͻ��ˣ��ٻ�ʦ
public class Player {
    public static void main(String[] args) {
        //ѡ��Ӣ��
        Hero hero = new BlindMonk("����");
        
        Skills skills = new Skills(hero);
        Skills r = new Skill_R(skills,"������β");
        Skills e = new Skill_E(r,"������/�ݽ�Ϲ�");
        Skills w = new Skill_W(e,"������/������");
        Skills q = new Skill_Q(w,"������/������");
        //ѧϰ����
        q.learnSkills();
    }
}