package _pair_programming;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.testng.Assert.*;


public class GalleryTest {

    private String galleryName;
    private double galleryTill;
    private HashMap<Integer, Artwork> galleryCollection;

    Gallery gallery = new Gallery("gallery", 500.0, galleryCollection);
    @Test
    void soldArtwork(){
        this.galleryTill = 500.0;
        double amount = 100;
        double actualValue = gallery.getTill() + amount;
        double expectedValue = 600;
        assertEquals(expectedValue, actualValue);
    }

    Gallery gallery1 = new Gallery("gallery", 500.0, galleryCollection);
    @Test
    void soldArtwork1(){
        this.galleryTill = 500.0;
        double amount = 600;
        double actualValue = gallery.getTill() + amount;
        double expectedValue = 900;
        assertEquals(expectedValue, actualValue);
    }

    Gallery gallery2 = new Gallery("gallery", 500.0, galleryCollection);
    @Test
    void soldArtwork2(){
        this.galleryTill = 500.0;
        double amount = 200;
        double actualValue = gallery.getTill() + amount;
        double expectedValue = 700;
        assertEquals(expectedValue, actualValue);
    }

//    given

//    when

//    then



}