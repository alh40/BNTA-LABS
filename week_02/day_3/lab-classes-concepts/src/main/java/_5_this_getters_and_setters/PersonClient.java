package _5_this_getters_and_setters;

public class PersonClient {

    public static void main(String[] args){


        Person obj1 = new Person();
        Person obj2 = new Person("Alexander", 24, 193.0);


        System.out.println(obj2.isInStock());

        System.out.println(obj2.getName());
        System.out.println(obj2.toString());


    }
}
