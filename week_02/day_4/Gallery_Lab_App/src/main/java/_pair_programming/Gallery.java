package _pair_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class Gallery {

    private String name;
    private double till;
    private HashMap<Integer, Artwork> collection;
    private double stockTake;
    private String input;

    public Gallery(String galleryName, double galleryTill, HashMap<Integer, Artwork> galleryCollection){
        this.name = galleryName;
        this.till = galleryTill;
        this.collection = galleryCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void setCollection(HashMap<Integer, Artwork> collection) {

    }
    public void setHashMap(HashMap<String, Double> stockTakeMap){
        stockTakeMap.put("painting1", 100.0);
        stockTakeMap.put("painting2", 200.0);
        stockTakeMap.put("painting3", 300.0);
        stockTakeMap.put("painting4", 400.0);
        stockTakeMap.put("painting5", 500.0);
        stockTakeMap.put("painting6", 600.0);
    }


    public double stockTake(HashMap<String, Double> stockTakeMap){
        double sum = 0;
        for(double item: stockTakeMap.values()){
            sum += item;
        }
       return sum;

    }
    public static Gallery setGallery(HashMap<Integer, Artwork> galleryCollection) {
        Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);
        gallery.setCollection(galleryCollection);
        return gallery;
    }
    public static HashMap<String, Double> getStringDoubleHashMap(Gallery gallery) {
        HashMap<String, Double> stockTakeMap = new HashMap<>();
        gallery.setHashMap(stockTakeMap);
        return stockTakeMap;
    }

    public static HashMap<Integer, Artwork> createList(){
        ArrayList<Integer> nftList = Artwork.setNft();

        ArrayList<String> alexCollection = new ArrayList<>();
        ArrayList<String> jamesCollection = new ArrayList<>();
        ArrayList<String> bankCollection = new ArrayList<>();

        HashMap<Integer, Artwork> galleryCollection = new HashMap<>();

        Artist painter1 = Artist.setArtist(alexCollection);
        Artist painter2 = Artist.setArtist1(jamesCollection);
        Artist painter3 = Artist.setArtist2(bankCollection);

        Artwork Artwork1 = Artwork.getArtwork1(nftList, alexCollection, painter1);
        Artwork Artwork2 = Artwork.getArtwork2(nftList, alexCollection, painter1);
        Artwork Artwork3 = Artwork.getArtwork3(nftList, jamesCollection, painter2);
        Artwork Artwork4 = Artwork.getArtwork4(nftList, jamesCollection, painter2);
        Artwork Artwork5 = Artwork.getArtwork5(nftList, bankCollection, painter3);
        Artwork Artwork6 = Artwork.getArtwork6(nftList, bankCollection, painter3);

        galleryCollection.put(0, Artwork1);
        galleryCollection.put(1, Artwork2);
        galleryCollection.put(2, Artwork3);
        galleryCollection.put(3, Artwork4);
        galleryCollection.put(4, Artwork5);
        galleryCollection.put(5, Artwork6);

        return galleryCollection;

    }

    public HashMap<String, Double> getHashMap(HashMap<String, Double> stockTakeMap){
        return stockTakeMap;
    }

    public void soldArtwork(double amount){
        this.till += amount;
    }

    public String getName() {
        return name;
    }

    public double getTill() {

        return till;
    }

    public HashMap<Integer, Artwork> getCollection() {
        return collection;
    }
    public static double getGalleryStockTake(ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, String artwork) {
        galleryStockTake = getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double getStockTake(ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, String artwork) {
        galleryStockTake = galleryStockTake - stockTakeMap.get(artwork);
        System.out.println("Gallery Stock = " + galleryStockTake);
        System.out.println("Customer Collection: ");
        System.out.println(customerCollection);
        System.out.println("Thank you for shopping with us! Would you like to purchase another?");
        return galleryStockTake;
    }
    public static void printCurrentGallery(HashMap<Integer, Artwork> galleryCollection) {
        System.out.println("Current Gallery Collection: ");
        System.out.println(galleryCollection);
    }


}
