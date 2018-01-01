package main.chapter_5_class_design.polymorphism;

public class DogExample {


    public static void example() {

        Dog dog = new Rex();

        print("Dog " + dog.name + " barks " + dog.isBarking());

        IBarking bark = dog;
        print(bark.isBarking());

        Animal isAnimal = dog;
        print("Dog have hair " + isAnimal.haveHair());
        //Does not compile we cant access name over Animal reference
        //print(isAnimal.name);

        /*

            Type of object determines which properties exist within the object in memory
            type of reference to the object determines which methods and variables are accessible to the java program
            type of reference       type of object
            Animal animal       =   new Dog();

         */


    }

    public static void castingObject() {
        /*
            Casting an object from subclass to a superclass doesn't require an explicit cast
            Casting an object from superclass to a subclass requires an explicit cast
            Compiler will not allow cast to unrelated types
            Evan if code compiles an exception may be thrown at runtime if the object cast is not actually an instance of that class
         */
        Rex dogRex = new Rex();
        // first rule we don't have to cast from subclass to superclass
        Animal animal = dogRex;
        //Second rule casting from super class to subclass requires an explicit cast
        Dog dog = (Dog) animal;
        Rex againRex = (Rex) dog;
        //third unrelated cast will not compile
        //Bird bird = (Bird)dog;
        //fourth rule will throw exception at runtime because object is not actually an instance of that class
        Animal animalDog = new Dog();
        try {
            Rex rex = (Rex) animalDog;
            rex.rexBarking();
        } catch (ClassCastException e) {
            System.err.println(e.getMessage());
        }


    }

    public static void virtualMethodExample() {
        Dog dog = new Rex();
        dog.printDogInfo();
    }

    private static void print(Object o) {
        System.out.println(o);
    }

}
