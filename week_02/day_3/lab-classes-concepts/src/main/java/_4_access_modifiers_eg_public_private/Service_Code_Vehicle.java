package _4_access_modifiers_eg_public_private;

public class Service_Code_Vehicle {

    private String kind = "A hardcoded value of the kind property";

    public Service_Code_Vehicle(String newKind) {
        this.kind = newKind;
    }

    public void startEngine(){
        System.out.println("The engine has started!");

    }



}
