package _pair_programming;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.testng.Assert.*;

public class CustomerTest {
    private String name;
    private double wallet;
    Customer customer1 = new Customer("Alex", 10900);
    @Test
    public void testGetName() {
        Customer customer1 = new Customer("Alex", 10900);
        String actualValue = customer1.getName();
        String expectedValue = "Alex";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetWallet() {
        Customer customer1 = new Customer("Alex", 10900);
        double actualValue = customer1.getWallet();
        double expectedValue = 10900;
        assertEquals(actualValue, expectedValue);
    }


    @Test
    public void testPurchaseArtwork() {

        Customer customer1 = new Customer("Alex", 10900);
        double amount = 0;
        double actualValue = customer1.purchaseArtwork(100.0);
        double expectedValue = 10800;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testPurchaseArtwork2() {
        Customer customer1 = new Customer("Alex", 10900);
        double amount = 0;
        double actualValue = customer1.purchaseArtwork(200.0);
        double expectedValue = 10700;
        assertEquals(actualValue, expectedValue);
    }

}