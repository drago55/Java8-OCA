package main.chapter_4_methods_encapsulation;

class DefaultConstructor {

    /*
        This class does not have defined constructor and default one without parameters is created by Java
     */

}


public class CreatingConstructors {

    /*
        Making fields private and creating public setter and getter methods
        ensuring that only methods can change instance variables is called Encapsulating Data
     */
    private String name;
    private int id;

    /*
        Proper getter and setter methods
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
        Creating and overloading constructors
    */

    public CreatingConstructors() {
        //No parameter constructor
        /*
            We can use constructor chaning by using this key word
            this must be first non comment line in constructor
         */
        this(null, 0); //Calling constructor with two parameter

    }

    public CreatingConstructors(String name) {
        this.name = name;
        this.id = 0;
        //Overloaded constructor with one parameter
    }

    public CreatingConstructors(String name, int id) {
        this.name = name;
        this.id = id;
        //Overloaded constructor with two paramaters
    }

}
