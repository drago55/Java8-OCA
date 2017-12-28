package main.chapter_4_methods_encapsulation;

import main.chapter_4_methods_encapsulation.example.AccessExampleA;

public class AccessExampleC extends AccessExampleA {

    /*
      It is not in same package but it extends AccessExampleA
     */

    public void accessExample(){
        /*
            We can access only protected and public methods
         */
        iAmProtectedMethod();
        iAmPublicMethod();
    }


}
