package _pair_programming;
import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<String> collection;

    public Artist(String artistName, ArrayList<String> artistCollection){
        this.name = artistName;
        this.collection = artistCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlexCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting1");
        collection.add("painting2");
    }

    public void setJamesCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting3");
        collection.add("painting4");
    }

    public void setBankCollection(ArrayList<String> collection) {
        this.collection = collection;
        collection.add("painting5");
        collection.add("painting6");
    }

    public static Artist getPainter3(ArrayList<String> bankCollection) {
        Artist painter3 = new Artist("Bank", bankCollection);
        return painter3;
    }

    public static Artist getPainter2(ArrayList<String> jamesCollection) {
        Artist painter2 = new Artist("James", jamesCollection);
        return painter2;
    }

    public static Artist getPainter1(ArrayList<String> alexCollection) {
        Artist painter1 = new Artist("Alex", alexCollection);
        return painter1;
    }

    public static Artist setArtist2(ArrayList<String> bankCollection) {
        Artist painter3 = getPainter3(bankCollection);
        painter3.setBankCollection(bankCollection);
        return painter3;
    }

    public static Artist setArtist1(ArrayList<String> jamesCollection) {
        Artist painter2 = getPainter2(jamesCollection);
        painter2.setJamesCollection(jamesCollection);
        return painter2;
    }

    public static Artist setArtist(ArrayList<String> alexCollection) {
        Artist painter1 = getPainter1(alexCollection);
        painter1.setAlexCollection(alexCollection);
        return painter1;
    }


    public String getName() {
        return name;
    }

    public ArrayList<String> getCollection() {
        return collection;
    }
}
