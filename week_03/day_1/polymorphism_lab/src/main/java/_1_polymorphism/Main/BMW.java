package _1_polymorphism.Main;


import java.util.ArrayList;

class BMW extends NonLuxury implements IPurchase{

        public BMW(String carName, String carColour, char carSize) {
            super(carName, carColour, carSize);
        }

        public String makeNoise(){
            return "noise";
        }

        public static BMW getNonLuxury1(){
            BMW car1 = new BMW("X1", "black", 'L');
            return car1;
        }

        public static BMW getNonLuxury2(){
            BMW car1 = new BMW("X3", "red", 'M');
            return car1;
        }
        public static BMW getNonLuxury3(){
            BMW car1 = new BMW("5 Series", "blue", 'M');
            return car1;
        }

        public static BMW getNonLuxury4(){
            BMW car1 = new BMW("X3", "White", 'M');
            return car1;
        }

        public void checkCarInformation(ArrayList<String> nonLuxuryCollection){
            System.out.println(nonLuxuryCollection);
        }
        public void goCheckout() {

        }


    }
