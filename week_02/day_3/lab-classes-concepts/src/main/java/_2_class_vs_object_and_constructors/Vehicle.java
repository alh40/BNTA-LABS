package _2_class_vs_object_and_constructors;

public class Vehicle {
    private String message;

    public Vehicle(){
        System.out.println("No-arg constructor, a hardcoded message");
    }

    public Vehicle(String newMessage){
        this.message = newMessage;
        System.out.println(newMessage);
    }

}
