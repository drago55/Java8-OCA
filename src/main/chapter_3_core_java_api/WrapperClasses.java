package main.chapter_3_core_java_api;

public class WrapperClasses {


    /*

        Primitive type      Wrapper class   example
        boolean             Boolean         new Boolean(true)
        byte                Byte            new Byte((byte) 1)
        short               Short           new Short((short) 1)
        int                 Integer         new Integer(1)
        long                Long            new Long(1)
        float               Float           new Float(1.0)
        double              Double          new Double(1.0)
        char                Character       new Character('c')

     */


    /*
        Converting from String

        Wrapper class        String to primitive             String to wrapper class

        Boolean              Boolean.parseBoolean("true");    Boolean.valueOf("TRUE");
        Byte                 Byte.parseByte("1");             Byte.valueOf("2");
        Short                Short.parseShort("1");           Short.valueOf("2");
        Integer              Integer.parseShort("1");         Integer.valueOf("2");
        Long                 Long.parseShort("1");            Long.valueOf("2");
        Float                Float.parseShort("1");           Float.valueOf("2");
        Double               Double.parseShort("1");          Double.valueOf("2");
        Character            none                             none

     */



    public static void parseExample(){

        int primitiveType= Integer.parseInt("1");
        print(primitiveType);
        Integer wrpperClass= Integer.valueOf("1");
        print(wrpperClass);

        //int a= Integer.parseInt("a"); it will throw NumberFormatException
        //Integer b=Integer.parseInt("123.34"); it will thorw NumberFormatException



    }

    private static void print(Object o){
        System.out.println(o);
    }


}
