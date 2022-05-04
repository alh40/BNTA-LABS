package _pair_programming;
import java.util.*;

public class Main {
    private static String selectArtwork(Scanner input) {
        System.out.println("Please select the Artwork you want to purchase!");
        String artwork = input.nextLine();
        return artwork;
    }
    private static void defaultElse() {
        System.out.println("This artwork is not in stock!");
        System.out.println("Please Reselect!");
    }
    private static int getNum(Scanner input, String name) {
        System.out.println("Hi " + name + " please enter balance here!");
        int num = Integer.valueOf(input.nextLine());
        System.out.println("Artwork available: ");
        return num;
    }
    private static String getString(Scanner input) {
        System.out.println("Enter Name here!");
        String name = input.nextLine();
        return name;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        String name = getString(input);
        int num = getNum(input, name);

        HashMap<Integer, Artwork> galleryMap = Gallery.createList();

        Gallery gallery = Gallery.setGallery(galleryMap);

        ArrayList<String> customerCollection = new ArrayList<>();

        HashMap<String, Double> stockTakeMap = Gallery.getStringDoubleHashMap(gallery);

        System.out.println(galleryMap);

        double galleryStockTake = gallery.stockTake(stockTakeMap);
        System.out.println(galleryStockTake);

        Customer user = new Customer(name, num);

        while(galleryStockTake > 0){

            String artwork = selectArtwork(input);

            if (artwork.equals("painting1")) {

                galleryStockTake = Customer.ifPainting1(galleryMap.get(0),  galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        } else if (artwork.equals("painting2")) {

                galleryStockTake = Customer.ifPainting2(galleryMap.get(1), galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        } else if (artwork.equals("painting3")) {

                galleryStockTake = Customer.ifPainting3(galleryMap.get(2), galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        } else if (artwork.equals("painting4")) {

                galleryStockTake = Customer.ifPainting4(galleryMap.get(3), galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        } else if (artwork.equals("painting5")) {

                galleryStockTake = Customer.ifPainting5(galleryMap.get(4), galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        } else if (artwork.equals("painting6")) {
                galleryStockTake = Customer.ifPainting6(galleryMap.get(5), galleryMap, gallery, customerCollection, stockTakeMap, galleryStockTake, user, artwork);

        }else if(artwork.equals("")){
                System.out.println("Thank you for shopping!");
                break;
            }else {
                defaultElse();

            }
        }
    }

    }






