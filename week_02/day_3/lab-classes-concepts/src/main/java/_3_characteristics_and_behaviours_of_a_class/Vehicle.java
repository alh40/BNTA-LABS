package _3_characteristics_and_behaviours_of_a_class;

public class Vehicle {

    private String kind = "A hardcoded value of the kind property";

    public Vehicle(String newKind) {
        this.kind = newKind;
    }

    void startEngine(){
        System.out.println("The engine has started!");

    }



}
