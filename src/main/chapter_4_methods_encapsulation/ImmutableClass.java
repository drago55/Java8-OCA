package main.chapter_4_methods_encapsulation;

import java.util.ArrayList;

public class ImmutableClass {
    /*

        Immutable classes are allowed to have values and we have constructor that allows value to be set.
        Immutable class is one which can't be change after it was instantiation

     */

    private String name;
    private String address;
    private int age;

    private ArrayList<String> myList = new ArrayList<>();


    public ImmutableClass(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.myList.add(name);
    }

    /*
        If we want to make class immutable we cant pass references of Mutable objects
        because we don't have control over them and they can be change outside of our class
     */
    public ArrayList<String> getMyList() {
        return myList;
    }

    public ArrayList<String> getMyListCorrect() {
        return new ArrayList<>(myList);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
