package main.chapter_5_class_design.polymorphism;

public class Rex extends Dog {

    public Rex() {
        super("Rex", 3);

    }

    public Rex(String name, int age) {
        super(name, age);
    }

    public void rexBarking() {
        System.out.println("Rex is barking");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
