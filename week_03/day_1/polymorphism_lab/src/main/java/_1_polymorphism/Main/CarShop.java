package _1_polymorphism.Main;

import java.util.ArrayList;

public abstract class CarShop {

    private String name;
    private boolean isOpen;
    protected ArrayList<Car> carList;

    public CarShop(String name){
        this.name = name;
        this.isOpen = true;
        this.carList = new ArrayList<>();
    }

    public void addCar(){

    }

    public void setCarList(ArrayList<Car> carList){
        this.carList = carList;
    }
    public ArrayList<Car> getCarList(){

        return carList;
    }



}
