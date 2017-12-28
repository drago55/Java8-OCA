package main.chapter_4_methods_encapsulation;

import main.chapter_4_methods_encapsulation.example.*;

public class AccessExampleD {
    /*

        AccessExampleD does not extend and is not in same package

     */

    public void accessExample() {
        /*
            We can access only public method but we have to initialize new Object of that class
            We can't access protected since AccessExampleD doesn't extend AccessExampleA and it is not in same package
            We cant't access default method since it is not in same package
            In AccessExampleD class we can only use public methods from AccessExampleA

         */
        AccessExampleA access = new AccessExampleA();
        access.iAmPublicMethod();
    }

}
