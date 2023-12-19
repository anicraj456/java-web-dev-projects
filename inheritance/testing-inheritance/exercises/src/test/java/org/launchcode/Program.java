package org.launchcode;
import org.junit.jupiter.api.Test;
import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;

import static org.junit.jupiter.api.Assertions.*;
class Program {

   //SmartPhone test
    @Test
    public void emptySize(){
        assertEquals(6,6,.001);
    }
    @Test
    public void higherSize(){
        double test_size = 6;
        assertFalse(SmartPhone.screenSize(test_size));
    }
    @Test
    public void lesserSize(){
        double test_size = 6.5;
        assertTrue(SmartPhone.screenSize(test_size));
    }

    //Laptop test
    @Test
    public void equalWeightCheck(){
        assertEquals(4,4,.001);
    }
    @Test
    public void heavyWeightCheck(){
        double test_weight = 6;
        assertFalse(Laptop.checkWeight(test_weight));
    }
    @Test
    public void liteWeightCheck(){
        double test_weight = 3.75;
        assertTrue(Laptop.checkWeight(test_weight));
    }


    //Computer test
    @Test
    public void checkStorage(){
        assertEquals(100,100,.001);
    }
    @Test
    public void checkStorageSize() {
        double test_storage = 90;
        assertTrue(Computer.storage(test_storage));
    }
    @Test
    public void StorageSize() {
        double test_storage = 900;
        assertFalse(Computer.storage(test_storage));
    }
    @Test
    public void checkMemory(){
        assertEquals(200,200,.001);
    }
    @Test
    public void memorySize() {
        double test_memory = 200;
        assertFalse(Computer.memory(test_memory));
    }
    @Test
    public void memorySizeLess() {
        double test_memory = 198;
        assertTrue(Computer.memory(test_memory));
    }
}
