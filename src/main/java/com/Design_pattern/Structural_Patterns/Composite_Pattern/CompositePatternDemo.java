package com.Design_pattern.Structural_Patterns.Composite_Pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Composite CEO = new Composite("CEO");
        Composite SubCeo1 = new Composite("SubCeo1");
        Composite SubCeo2 = new Composite("SubCeo2");
        Composite SubSubCeo1 = new Composite("SubsubCeo1");
        Composite SubSubCeo2 = new Composite("SubsubCeo2");
        Composite SubSubCeo3 = new Composite("SubsubCeo3");
        Composite SubSubCeo4 = new Composite("SubsubCeo4");
        SubCeo1.add(SubSubCeo1);
        SubCeo1.add(SubSubCeo2);
        SubCeo2.add(SubSubCeo3);
        SubCeo2.add(SubSubCeo4);
        CEO.add(SubCeo1);
        CEO.add(SubCeo2);
        CEO.printComposite();
    }
}
