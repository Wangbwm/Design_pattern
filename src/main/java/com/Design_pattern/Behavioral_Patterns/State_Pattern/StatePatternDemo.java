package com.Design_pattern.Behavioral_Patterns.State_Pattern;

public class StatePatternDemo {
    public static void main(String... args) {
        Context context = new Context();
        
        // ��ʼΪ��ʼ״̬
        context.setState(new StartState());
        // �л�Ϊ�ر�״̬
        context.close();
        // �л�Ϊ��ʼ״̬
        context.start();
    }
}