package main.chapter_4_methods_encapsulation;

public class OrderOfInitialization {

    private String name = "Java";
    private static int changeMe;
    private static final int CONSTANT = 1; //Final variables can be initialized only once.

    static {
        System.out.println("In static block printing static final CONSTANT " + CONSTANT);
        changeMe+=1;
    }

    {
        System.out.println("In instance block printing name " + name);
    }


    public OrderOfInitialization() {
        System.out.println("In a constructor last in order");
        System.out.println("Name "+name+" changeMe var "+changeMe+" CONSTANT final we cant change "+CONSTANT);
    }

    static {
        System.out.println("In static changeMe var "+changeMe);
        changeMe++;
    }

    {
        System.out.println("Printing change me " + changeMe);
    }

}
