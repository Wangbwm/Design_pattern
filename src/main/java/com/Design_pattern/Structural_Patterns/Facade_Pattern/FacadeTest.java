package com.Design_pattern.Structural_Patterns.Facade_Pattern;

import java.lang.reflect.InvocationTargetException;

public class FacadeTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Facade facade = new Facade();
        facade.open();
    }
}