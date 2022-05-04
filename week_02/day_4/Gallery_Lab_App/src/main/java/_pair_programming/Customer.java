package _pair_programming;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {

    private String name;
    private double wallet;

    public Customer(String customerName, double customerWallet){
        this.name = customerName;
        this.wallet = customerWallet;
    }

public void setWallet(double wallet){
        this.wallet = wallet;
}
    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public double purchaseArtwork(double amount){

        if(this.wallet <= 0){
            System.out.println("Insufficient funds, go get some money!");
        }else{
            this.wallet -= amount;

        }
        return this.wallet;
    }


    public static double ifPainting1(Artwork Artwork1, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork1.getPrice());
        gallery.soldArtwork(Artwork1.getPrice());
        painting1Method1(Artwork1, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getGalleryStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double ifPainting2(Artwork Artwork2, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork2.getPrice());
        gallery.soldArtwork(Artwork2.getPrice());
        painting2method1(Artwork2, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double ifPainting3(Artwork Artwork3, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork3.getPrice());
        gallery.soldArtwork(Artwork3.getPrice());
        painting3Method3(Artwork3, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double ifPainting4(Artwork Artwork4, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork4.getPrice());
        gallery.soldArtwork(Artwork4.getPrice());
        painting4Method4(Artwork4, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double ifPainting5(Artwork Artwork5, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork5.getPrice());
        gallery.soldArtwork(Artwork5.getPrice());
        painting5Method5(Artwork5, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static double ifPainting6(Artwork Artwork6, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, HashMap<String, Double> stockTakeMap, double galleryStockTake, Customer user, String artwork) {
        user.purchaseArtwork(Artwork6.getPrice());
        gallery.soldArtwork(Artwork6.getPrice());
        painting6Method6(Artwork6, galleryCollection, gallery, customerCollection, user);
        galleryStockTake = Gallery.getStockTake(customerCollection, stockTakeMap, galleryStockTake, artwork);
        return galleryStockTake;
    }

    public static void printWalletTill(Gallery gallery, Customer user) {
        System.out.println(user.getName() + " has " + user.getWallet() + " left in their wallet.");
        System.out.println("Money in till: " + gallery.getTill());
    }

    private static void painting6Method6(Artwork Artwork6, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork6);
        customerCollection.add(temp);
        galleryCollection.remove(5, Artwork6);
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting5Method5(Artwork Artwork5, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork5);
        customerCollection.add(temp);
        galleryCollection.remove(4, Artwork5);
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting4Method4(Artwork Artwork4, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork4);
        customerCollection.add(temp);
        galleryCollection.remove(3, Artwork4);
        Gallery.printCurrentGallery(galleryCollection);
    }

    private static void painting3Method3(Artwork Artwork3, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork3);
        customerCollection.add(temp);
        galleryCollection.remove(2, Artwork3);
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting2method1(Artwork Artwork2, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        printWalletTill(gallery, user);
        String temp = String.valueOf(Artwork2);
        customerCollection.add(temp);
        galleryCollection.remove(1, Artwork2);
        Gallery.printCurrentGallery(galleryCollection);
    }



    private static void painting1Method1(Artwork Artwork1, HashMap<Integer, Artwork> galleryCollection, Gallery gallery, ArrayList<String> customerCollection, Customer user) {
        String temp = String.valueOf(Artwork1);
        customerCollection.add(temp);
        galleryCollection.remove(0, Artwork1);
        printWalletTill(gallery, user);
        Gallery.printCurrentGallery(galleryCollection);
    }




    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
//    A Customer should have a name and a wallet.
//    A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet and increasing the money in the Gallery till.
//

}
