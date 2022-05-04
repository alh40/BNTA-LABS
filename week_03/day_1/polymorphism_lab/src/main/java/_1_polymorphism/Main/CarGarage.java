package _1_polymorphism.Main;

import java.util.*;

public class CarGarage extends CarShop {
    private String name;

    public CarGarage(String name){
        super(name);

    }

    public void addCar(Luxury luxury1){
        this.carList.add(luxury1);
    }

    public void addCar(NonLuxury nonluxury1){
        this.carList.add(nonluxury1);
    }


    public static ArrayList<String> getLuxuryCollection(){

        ArrayList<String> luxuryCollection = new ArrayList<>();

        RollsRoyce car1 = RollsRoyce.getLuxury1();
        RollsRoyce car2 = RollsRoyce.getLuxury2();
        RollsRoyce car3 = RollsRoyce.getLuxury3();
        RollsRoyce car4 = RollsRoyce.getLuxury4();

        Maybach car5 = Maybach.getLuxury1();
        Maybach car6 = Maybach.getLuxury2();
        Maybach car7 = Maybach.getLuxury3();
        Maybach car8 = Maybach.getLuxury4();

        luxuryCollection.add(String.valueOf(car1));
        luxuryCollection.add(String.valueOf(car2));
        luxuryCollection.add(String.valueOf(car3));
        luxuryCollection.add(String.valueOf(car4));
        luxuryCollection.add(String.valueOf(car5));
        luxuryCollection.add(String.valueOf(car6));
        luxuryCollection.add(String.valueOf(car7));
        luxuryCollection.add(String.valueOf(car8));


        return luxuryCollection;

    }

    public static HashMap<Integer, Luxury> getLuxuryMap(){

        HashMap<Integer, Luxury> luxuryCollectionMap = new HashMap<>();

        RollsRoyce car1 = RollsRoyce.getLuxury1();
        RollsRoyce car2 = RollsRoyce.getLuxury2();
        RollsRoyce car3 = RollsRoyce.getLuxury3();
        RollsRoyce car4 = RollsRoyce.getLuxury4();

        Maybach car5 = Maybach.getLuxury1();
        Maybach car6 = Maybach.getLuxury2();
        Maybach car7 = Maybach.getLuxury3();
        Maybach car8 = Maybach.getLuxury4();

        luxuryCollectionMap.put(0, car1);
        luxuryCollectionMap.put(1, car2);
        luxuryCollectionMap.put(2, car3);
        luxuryCollectionMap.put(3, car4);
        luxuryCollectionMap.put(4, car5);
        luxuryCollectionMap.put(5, car6);
        luxuryCollectionMap.put(6, car7);
        luxuryCollectionMap.put(7, car8);


        return luxuryCollectionMap;
    }

    public static ArrayList<String> getNonLuxuryCollection(){

        ArrayList<String> nonLuxuryCollection = new ArrayList<>();
//
//        HashMap<Integer, NonLuxury> nonLuxuryCollectionMap = new HashMap<>();

        BMW car1 = BMW.getNonLuxury1();
        BMW car2 = BMW.getNonLuxury2();
        BMW car3 = BMW.getNonLuxury3();
        BMW car4 = BMW.getNonLuxury4();

        nonLuxuryCollection.add(String.valueOf(car1));
        nonLuxuryCollection.add(String.valueOf(car2));
        nonLuxuryCollection.add(String.valueOf(car3));
        nonLuxuryCollection.add(String.valueOf(car4));
//
//        nonLuxuryCollectionMap.put(0, car1);
//        nonLuxuryCollectionMap.put(1, car2);
//        nonLuxuryCollectionMap.put(2, car3);

        return nonLuxuryCollection;

    }

    public static HashMap<Integer, NonLuxury> getNonLuxuryMap(){

        HashMap<Integer, NonLuxury> nonLuxuryCollectionMap = new HashMap<>();

        BMW car1 = BMW.getNonLuxury1();
        BMW car2 = BMW.getNonLuxury2();
        BMW car3 = BMW.getNonLuxury3();
        BMW car4 = BMW.getNonLuxury4();

        nonLuxuryCollectionMap.put(0, car1);
        nonLuxuryCollectionMap.put(1, car2);
        nonLuxuryCollectionMap.put(2, car3);
        nonLuxuryCollectionMap.put(3, car4);

        return nonLuxuryCollectionMap;
    }





}
