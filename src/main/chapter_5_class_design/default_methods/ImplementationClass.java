package main.chapter_5_class_design.default_methods;

public class ImplementationClass implements InterfaceA, InterfaceB {
    /*
        We are forced to override a method and implement new.
     */

    @Override
    public int getNum() {
        return 0;
    }
}
