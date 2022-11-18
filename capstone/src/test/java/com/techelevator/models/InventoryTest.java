package com.techelevator.models;

import com.techelevator.models.exceptions.InvalidIDException;
import com.techelevator.models.exceptions.SoldOutException;
import com.techelevator.models.products.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

import static org.junit.Assert.*;

public class InventoryTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Inventory inventory;
    Product product;

    @Before
    public void setup(){
        inventory = new Inventory();
        Map.Entry<Product,Integer> entry = inventory.getProducts().entrySet().iterator().next();
        product = entry.getKey();
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    @Test
    public void decrementQuantity_Should_SubtractOne() throws SoldOutException {

        //Arrange
        int expected = 4;

        //Act
        inventory.decrementQuantity(product);
        int actual = inventory.getProducts().get(product);

        //Assert
        assertEquals("Because decrementQuantity should subtract one from the total", expected, actual);
    }

    @Test(expected = SoldOutException.class)
    public void decrementQuantity_ShouldPrint_SoldOut_WhenValueIsZero() throws SoldOutException {

        //Arrange
        String expected = "That item is sold out and unavailable for purchase";

        //Act
        for (int i = 0; i < 6; i++) {
             inventory.decrementQuantity(product);
        }
        String actual = outputStreamCaptor.toString().trim();

        //Assert
        assertEquals("Because the sold out error message should print when there are no more of the item in inventory", expected, actual);

    }



    @Test
    public void getProductByID_ShouldReturn_Product_OnValidID(){

        //Arrange
        Product expected = product;

        //Act
        Product actual = inventory.getProductByID(product.getId());

        //Assert
        assertEquals("Because a valid ID should return the matching product", expected, actual);

    }


    @Test
    public void isIDValid_ShouldReturn_False_OnInvalidID() {

        //Arrange
        Boolean expected = false;

        //Act
        boolean actual = inventory.isIDValid("buffalo");

        //Assert
        assertEquals("Because the invalid ID error message should print when there are no more of the item in inventory", expected, actual);

    }



    @After
    public void tearDown(){
        System.setOut(standardOut);
    }

}
