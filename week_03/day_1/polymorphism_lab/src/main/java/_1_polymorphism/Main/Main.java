package _1_polymorphism.Main;

import java.util.*;

public class Main {

    private static void printInfo1(Car car2) {

    }
    public static void main(String[] args) {

        CarGarage carpark1 = new CarGarage("carpark");
        Scanner input = new Scanner(System.in);

        ArrayList<String> luxuryCollection = CarGarage.getLuxuryCollection();
        ArrayList<String> nonLuxuryCollection = CarGarage.getNonLuxuryCollection();
        HashMap<Integer, Luxury> luxuryCollectionMap = CarGarage.getLuxuryMap();
        HashMap<Integer, NonLuxury> nonLuxuryCollectionMap = CarGarage.getNonLuxuryMap();
        ArrayList<Car> purchaseList = new ArrayList<>();

        RollsRoyce car1 = new RollsRoyce("001", "black", 'M');
        BMW car2 = new BMW("001", "black", 'M');


        whileLoop(input, luxuryCollection, nonLuxuryCollection, luxuryCollectionMap, nonLuxuryCollectionMap, purchaseList, car1, car2);

    }

    private static void whileLoop(Scanner input, ArrayList<String> luxuryCollection, ArrayList<String> nonLuxuryCollection, HashMap<Integer, Luxury> luxuryCollectionMap, HashMap<Integer, NonLuxury> nonLuxuryCollectionMap, ArrayList<Car> purchaseList, RollsRoyce car1, BMW car2) {
        while(true) {

            System.out.println("Enter BMW or RollsRoyce or Maybach");
            String brand = input.nextLine();

           if(brand.equals("RollsRoyce") || brand.equals("Maybach")){
               car1.checkCarInformation(luxuryCollection);
           }else if(brand.equals("BMW")){
               car2.checkCarInformation(nonLuxuryCollection);
           } else{
               System.out.println("Brand does not exist");
               break;
           }

            System.out.println("Enter Car name");
            String carName = input.nextLine();

            if (brand.equals("RollsRoyce") || brand.equals("Maybach")) {

                for (String item : luxuryCollection) {
                    if (item.contains(carName)) {
                        purchaseList.add(luxuryCollectionMap.get(luxuryCollection.indexOf(item)));
                    }
                }
                System.out.println(purchaseList);
                System.out.println("Do you want to know about the car? (y/n)");
                String carInfo = input.nextLine();

                if(carInfo.equals("y")){

                    Car obj = purchaseList.get(0);

                        System.out.println("Can the " + carName + " move? " + obj.canMove());
                        System.out.println("The " + carName + " engine is: " + obj.engine());
                        System.out.println("The " + carName + " makes this noise: " + obj.makeNoise());

                }else if(carInfo.equals("n")){

                    System.out.println("Bye!");

                }else{
                    System.out.println("Invalid response!");
                }

            } else if (brand.equals("BMW")) {
                for (String item : nonLuxuryCollection) {
                    if (item.contains(carName)) {
                        purchaseList.add(nonLuxuryCollectionMap.get(nonLuxuryCollection.indexOf(item)));
                    }
                }
                System.out.println(purchaseList);
                System.out.println("Do you want to know about the car? (y/n)");
                String carInfo = input.nextLine();

                if(carInfo.equals("y")){

                    Car obj = purchaseList.get(0);

                    System.out.println("Can the " + carName + " move? " + obj.canMove());
                    System.out.println("The " + carName + " engine is: " + obj.engine());
                    System.out.println("The " + carName + " makes this noise: " + obj.makeNoise());
                }else if(carInfo.equals("n")){

                    System.out.println("Bye!");

                }else{
                    System.out.println("Invalid response!");
                }

            }

        }
    }


}







