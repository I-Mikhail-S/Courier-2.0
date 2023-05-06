package org.example.randomGenerateOrder;

import org.example.time.TimeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomOrderTest {

    @Test
    void generateTime() {
        RandomOrder randomOrder = new RandomOrder();
        System.out.println(randomOrder.generateTime());
    }

    @Test
    void testGenerateTime() throws Exception {
        RandomOrder randomOrder = new RandomOrder();
        System.out.println(randomOrder.getAllList());
    }

    @Test
    void testGenerateTime1() {
        RandomOrder randomOrder = new RandomOrder();
        System.out.println(randomOrder.generateTime());
        System.out.println(randomOrder.generateTime());
    }
}