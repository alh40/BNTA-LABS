package _1_polymorphism.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Luxury extends Car{


    public Luxury(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);

    }

    public static boolean canMove(){
        return true;
    }

    public abstract String makeNoise();

    public String engine(){
        return "Electric";
    }



}
