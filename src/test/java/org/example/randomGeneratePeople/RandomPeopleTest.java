package org.example.randomGeneratePeople;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomPeopleTest {

    @Test
    void getAllList() throws Exception {
        RandomPeople randomPeople = new RandomPeople();
        System.out.println(Arrays.toString(randomPeople.getAllList().toArray()));
    }
}