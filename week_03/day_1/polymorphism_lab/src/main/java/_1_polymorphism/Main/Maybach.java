package _1_polymorphism.Main;

import java.util.ArrayList;

class Maybach extends Luxury implements IPurchase{

    public Maybach(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);
    }

    public String makeNoise(){
        return "Beep Beep";
    }

    public static Maybach getLuxury1(){
        Maybach car1 = new Maybach("S-Class", "black", 'M');
        return car1;
    }

    public static Maybach getLuxury2(){
        Maybach car1 = new Maybach("S-Class", "red", 'L');
        return car1;
    }

    public static Maybach getLuxury3(){
        Maybach car1 = new Maybach("Edition 100", "white", 'M');
        return car1;
    }

    public static Maybach getLuxury4(){
        Maybach car1 = new Maybach("Edition 100", "blue", 'S');
        return car1;
    }


    public void checkCarInformation(ArrayList<String> luxuryCollection){
        System.out.println(luxuryCollection);
    }
    public void goCheckout() {

    }

}
