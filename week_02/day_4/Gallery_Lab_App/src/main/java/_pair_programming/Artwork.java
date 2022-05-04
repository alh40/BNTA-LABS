package _pair_programming;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

public class Artwork {

    private String title;
    private String artist;
    private double price;
    private int nft;


    public Artwork(String artworkTitle, String artworkArtist, double artworkPrice, int artworkNft){
        this.title = artworkTitle;
        this.artist = artworkArtist;
        this.price = artworkPrice;
        this.nft = artworkNft;
    }

    public static Artwork getArtwork6(ArrayList<Integer> nftList, ArrayList<String> bankCollection, Artist painter3) {
        Artwork Artwork6 = new Artwork(bankCollection.get(1), painter3.getName(), 600.0, nftList.get(5));
        return Artwork6;
    }

    public static Artwork getArtwork5(ArrayList<Integer> nftList, ArrayList<String> bankCollection, Artist painter3) {
        Artwork Artwork5 = new Artwork(bankCollection.get(0), painter3.getName(), 500.0, nftList.get(4));
        return Artwork5;
    }

    public static Artwork getArtwork4(ArrayList<Integer> nftList, ArrayList<String> jamesCollection, Artist painter2) {
        Artwork Artwork4 = new Artwork(jamesCollection.get(1), painter2.getName(), 400.0, nftList.get(3));
        return Artwork4;
    }

    public static Artwork getArtwork3(ArrayList<Integer> nftList, ArrayList<String> jamesCollection, Artist painter2) {
        Artwork Artwork3 = new Artwork(jamesCollection.get(0), painter2.getName(), 300.0, nftList.get(2));
        return Artwork3;
    }

    public static Artwork getArtwork2(ArrayList<Integer> nftList, ArrayList<String> alexCollection, Artist painter1) {
        Artwork Artwork2 = new Artwork(alexCollection.get(1), painter1.getName(), 200.0, nftList.get(1));
        return Artwork2;
    }

   public static Artwork getArtwork1(ArrayList<Integer> nftList, ArrayList<String> alexCollection, Artist painter1) {
        Artwork Artwork1 = new Artwork(alexCollection.get(0), painter1.getName(), 100.0, nftList.get(0));
        return Artwork1;
    }





    public static ArrayList<Integer> setNft() {
        LinkedHashSet<Integer> nftSet = new LinkedHashSet<>();
        Random nft = new Random();
        while (nftSet.size() < 6) {
            nftSet.add(nft.nextInt(1000 - 0 + 1));
        }

        ArrayList<Integer> nftList = new ArrayList<>();
        nftList.addAll(nftSet);
        return nftList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", nft=" + nft +
                '}';
    }











    //
//    A Gallery should have a name, a till and a collection of Artwork.
//    A piece of Artwork should have a title, an artist, a price and an nft.
//    An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made).
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//



}
