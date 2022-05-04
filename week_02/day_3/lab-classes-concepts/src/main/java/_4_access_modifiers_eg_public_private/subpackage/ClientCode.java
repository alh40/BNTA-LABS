package _4_access_modifiers_eg_public_private.subpackage;

import _4_access_modifiers_eg_public_private.Service_Code_Vehicle;

public class ClientCode {

    public static void main(String[] args){

        Service_Code_Vehicle vehicle = new Service_Code_Vehicle("Hello there");

        vehicle.startEngine();


    }

}
