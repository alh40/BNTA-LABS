package _4_todo;

public class Grampa <T> {

    private String t;

    public Grampa(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Grampa{" +
                "t='" + t + '\'' +
                '}';
    }
}
