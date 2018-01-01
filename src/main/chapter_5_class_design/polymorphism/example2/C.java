package main.chapter_5_class_design.polymorphism.example2;

public class C extends B {
    private String name = "I am class C";
    public int number = 30;

    @Override
    public String getName() {
        return name;
    }
}
