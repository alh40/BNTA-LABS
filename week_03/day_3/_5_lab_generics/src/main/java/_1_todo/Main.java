package _1_todo;

import org.junit.jupiter.api.BeforeEach;

public class Main {

    public static void main(String[] args) {


        Box<String> boxString = new Box("Big Box");

        Box<Integer> boxInteger = new Box(1000);

        Box<Character> boxCharacter = new Box('c');

        Box<Double> boxDouble = new Box(24.0);

        System.out.println(boxString);

    }
}
