package main.chapter_5_class_design.polymorphism.example2;

public class Implementation extends C {

    private String name = "I'am implementation";
    public int number = 40;

    /*
        This example shows virtual methods and fields access when we change reference of a object
        A virtual method is a method in which the specific implementation is not determined until runtime if you call a
        method on a object that overrides a method you get the overridden method even if the call to the method is on a parent reference
        that is not the case with fields we can access only fields of reference type
      */

    public static void example() {
        A a = new Implementation();
        print("Name " + a.getName() + " number " + a.number);
        B b = (B) a;
        print("Name " + b.getName() + " number " + b.number);
        C c = (C) b;
        print("Name " + c.getName() + " number " + c.number);
        Implementation im = (Implementation) c;
        print("Name " + im.getName() + " number " + im.number);

    }

    public static void polymorphicParameters(A a) {
        print("Name " + a.getName() + " number " + a.number);
    }

    @Override
    public String getName() {
        return name;
    }

    private static void print(Object o) {
        System.out.println(o);
    }


}
