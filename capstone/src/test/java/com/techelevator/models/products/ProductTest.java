package com.techelevator.models.products;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductTest {
    private Product product;

    @Before
    public void setup() {
        product = new Product("C2", "Dr. Salt", new BigDecimal("1.50"), "drink");
    }

    @Test
    public void toString_should_return_appropriate_data_for_product() {
        //Arrange
        String expected = "C2: Dr. Salt - price: $1.50";

        //Act
        String actual = product.toString();

        //Assert
        assertEquals("Because product is Dr. Salt, I should see the appropriate id, product name, and price", expected, actual);
    }


}
