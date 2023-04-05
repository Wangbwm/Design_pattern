package com.Design_pattern.Behavioral_Patterns.State_Pattern;

public class StartState implements State {
    public void start(Context context) {
    }

    public void close(Context context) {
        context.setState(new CloseState());//ע��״̬���л�
        System.out.println("close State");
    }
}