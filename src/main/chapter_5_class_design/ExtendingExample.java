package main.chapter_5_class_design;


class Person {

    private String name;
    private String address;
    private int age;
    protected int iAmProtected;

    //No argument constructor
    public Person() {
        //We set all fields to null and 0
        this.name = null;
        this.address = null;
        this.age = 0;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

}


public class ExtendingExample extends Person {


    public ExtendingExample() {
        super();  //We have a no argument constructor in a parent class so this will compile without we calling a super
    }

    public ExtendingExample(String name, String address, int age) {
        super(name, address, age);
    }

    public ExtendingExample(String name) {
        super(name, 0);
        //  this(); since both super and this call have to be first in line of constructor  we can have only one
        //we can use super key for calling methods or members from parent class
        super.getAddress();
        int iAmProtected = super.iAmProtected;


    }


    public void printingPersonDetails() {
        print("Name " + getName() + "Address " + getAddress() + "Age " + getAge()
                + "get protected member " + iAmProtected + " or this way " + super.iAmProtected);
    }

    private static void print(Object o) {
        System.out.println(o);
    }




}
