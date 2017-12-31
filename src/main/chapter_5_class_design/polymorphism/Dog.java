package main.chapter_5_class_design.polymorphism;

public class Dog extends Animal implements IBarking {
    private int age = 1;
    public String name = "puppy";

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog() {

    }

    @Override
    public boolean isBarking() {
        return true;
    }

    @Override
    public boolean haveHair() {
        return true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printDogInfo() {
        System.out.println("Dog name is " + getName() + " and it is " + getAge() + " old");
    }
}
