package _1_polymorphism.Main;

import java.util.ArrayList;

class RollsRoyce extends Luxury implements IPurchase{

    public RollsRoyce(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);
    }

    public String makeNoise(){
        return "Beep Beep";
    }

    public static RollsRoyce getLuxury1(){
        RollsRoyce car1 = new RollsRoyce("Phantom", "black", 'M');
        return car1;
    }

    public static RollsRoyce getLuxury2(){
        RollsRoyce car1 = new RollsRoyce("Wraith", "red", 'S');
        return car1;
    }

    public static RollsRoyce getLuxury3(){
        RollsRoyce car1 = new RollsRoyce("Ghost", "white", 'L');
        return car1;
    }

    public static RollsRoyce getLuxury4(){
        RollsRoyce car1 = new RollsRoyce("Phantom", "white", 'L');
        return car1;
    }

   public void checkCarInformation(ArrayList<String> luxuryCollection){
       System.out.println(luxuryCollection);
   }
    public void goCheckout() {

    }

}
