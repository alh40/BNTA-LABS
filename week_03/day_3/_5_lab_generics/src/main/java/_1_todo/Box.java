package _1_todo;

public class Box <T> {

private T stuff;

    public Box(T stuff) {
    this.stuff = stuff;
    }

    public T getStuff() {
        return stuff;
    }

    public void setStuff(T stuff) {
        this.stuff = stuff;
    }

    @Override
    public String toString() {
        return "Box {" +
                "stuff = " + stuff +
                '}';
    }
}
