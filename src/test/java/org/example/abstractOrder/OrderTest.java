package org.example.abstractOrder;

import org.example.point.Point;
import org.example.time.Time;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void compareTo() {
        List<Order> testCompareOrder = new ArrayList<>();
        testCompareOrder.add(new Order(1234,new Point(1,2),new Point(2,3),new Time("12:00","12:16"),3));
        testCompareOrder.add(new Order(1234,new Point(3,2),new Point(4,3),new Time("12:00","12:19"),4));
        assertEquals(16,testCompareOrder.get(0).getTime().getTimeLongMinute(),16);
    }
}