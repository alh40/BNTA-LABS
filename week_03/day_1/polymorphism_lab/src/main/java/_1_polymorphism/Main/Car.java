package _1_polymorphism.Main;

public abstract class Car{

    private String name;
    private String colour;
    private char size;

    private int ticket;



    public Car(String carName, String carColour, char carSize){
        this.name = carName;
        this.colour = carColour;
        this.size = carSize;

    }

    public static boolean canMove() {
        return false;
    }

    public abstract String engine();

    public String makeNoise(){
        return "BEEP BEEP!";
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                '}';
    }
}
