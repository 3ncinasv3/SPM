package com.sheridan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AppTest {

    CarHelper helper; 
    Car tester = new Car("Toyota", "Corolla", "Green", "E98810BZT", 32000);

    @Test
    public void testAddCarToInventory() {
        helper = new CarHelper();
        helper.addCarToInventory(tester);
        assertTrue(helper.cars.contains(tester));
    }

    @Test
    public void testRemoveCarFromInventory() {
        helper = new CarHelper();
        helper.addCarToInventory(tester);
        helper.removeCarFromInventory(tester);
        assertTrue(helper.cars.isEmpty());
        assertFalse(helper.cars.contains(tester));
    }
    
    @Nested
    public class TestCarProperties {

        Car tester2Car = new Car("Ferrari", "Enzo", "Red", "D27192ZT", 250000);

        @Test
        public void testCarProperties() {
            assertEquals("Ferrari", tester2Car.getMake());
            assertEquals("Enzo", tester2Car.getModel());
            assertEquals("Red", tester2Car.getColor());
            assertEquals("D27192ZT", tester2Car.getCarID());
            assertEquals(250000, tester2Car.getPrice());
        }

        @Test
        public void testUpdateCarProperties() {
            tester2Car.setColor("Yellow");
            tester2Car.setMake("Ford");
            tester2Car.setModel("F150");
            assertEquals("Yellow", tester2Car.getColor());
            assertEquals("Ford", tester2Car.getMake());
            assertEquals("F150", tester2Car.getModel());
        }
    }
}
