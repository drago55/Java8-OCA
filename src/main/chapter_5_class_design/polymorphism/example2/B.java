package main.chapter_5_class_design.polymorphism.example2;

public class B extends A {
    private String name="I'am class B";
    public int number = 20;

    @Override
    public String getName() {
        return name;
    }
}
