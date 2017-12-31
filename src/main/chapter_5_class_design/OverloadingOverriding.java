package main.chapter_5_class_design;

class ParentB {

    protected int hiddenVar = 10;

    public void myMethod() {
    }

    public void myMethod(String name) {
        //Overloaded method
    }

    private void privateMethodRedeclare() {
    }

    public static void hidingStaticMethod() {
        System.out.println("I am static in parent class");
    }


}

public class OverloadingOverriding extends ParentB {
    protected int hiddenVar = 1;
    /*
        They differ in that an overloaded method will use a different signature than an overridden method
        different set of
     */

    private static void print(Object o) {
        System.out.println(o);
    }

    public void printVariables() {
        //It's not a good practice to hide variables
        print("hidden variable is " + hiddenVar + " If we want to access parent var we have to call super " + super.hiddenVar);
    }

    @Override
    public void myMethod() {
        //Overriden method from parent class
    }

    public void myMethod(int a) {
        //Overloaded method
    }

    private void privateMethodRedeclare() {
        //It's not possible to override private methods this is new method
    }

    public static void hidingStaticMethod() {
        print("Static method from parent class is hidden");
    }

}
