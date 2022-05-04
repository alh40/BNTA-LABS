package _1_polymorphism.Main;

import java.util.ArrayList;



public abstract class NonLuxury extends Car {

    private ArrayList<NonLuxury> carList;

    public NonLuxury(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);
    }

    public abstract String makeNoise();

    public static boolean canMove(){
        return true;
    }

    public String engine(){
        return "Diesel";
    }


}
