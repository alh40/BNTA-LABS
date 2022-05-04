package _5_this_getters_and_setters;

public class Person {

    private String name;
    private int age;
    private double height;

    private int inStock = 5;

    public Person(String newName, int newAge, double newHeight){
        this.name = newName;
        this.age = newAge;
        this.height = newHeight;
    }

    public boolean isInStock(){
        if(this.inStock > 0){
            return true;
        }else{
            return false;
        }
    }
    public Person(){

    }

    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Height: " + this.height + ".";
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }
    public int getAge(){
        return this.age;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public double getHeight(){
        return this.height;
    }



}
