package com.Design_pattern.Behavioral_Patterns.State_Pattern;

public class CloseState implements State {
    public void start(Context context) {
    context.setState(new StartState());//ע��״̬���л�
        System.out.println("start State");
    }
    public void close(Context context) {
    }

}