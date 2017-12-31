package main.chapter_5_class_design;

public class InterfaceImplementation implements InterfaceExample {
    @Override
    public int getConstant() {
        return InterfaceExample.CONSTANT;
    }

    public void accessingStaticMethodsAndVariables() {
        print("Static methods " + InterfaceExample.getNumber() + "var " + InterfaceExample.CONSTANT);
    }

    private static void print(Object o) {
        System.out.print(o);
    }
}
