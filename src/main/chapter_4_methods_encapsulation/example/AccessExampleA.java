package main.chapter_4_methods_encapsulation.example;

public class AccessExampleA {

    public void iAmPublicMethod() {
        iAmPrivateMethod("Public method in AccessExampleA");
    }

    private static void iAmPrivateMethod(Object o) {
        System.out.println(o);
    }

    protected void iAmProtectedMethod() {
        iAmPrivateMethod("Protected method in AccessExampleA");
    }

    void iAmDefaultMethod() {
        iAmPrivateMethod("Default method in AccessExampleA");
    }
}
