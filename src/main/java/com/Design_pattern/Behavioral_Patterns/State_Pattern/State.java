package com.Design_pattern.Behavioral_Patterns.State_Pattern;

public interface State {

    public void start(Context context);
    public void close(Context context);
}