package org.example.distanceAndTime;

import org.example.abstractOrder.Order;
import org.example.point.Point;
import org.example.time.Time;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

class SortedOrderSecondTest {

    @Test
    void compare() throws ParseException {
        SortedOrder sortedOrderSecond = new SortedOrder();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, new Point(1.0, 2.0), new Point(2.0, 2.0), new Time("16:00", "17:00"), 10.0));
        orders.add(new Order(2, new Point(3.0, 2.0), new Point(3.0, 2.0), new Time("18:00", "19:00"), 11.0));
        orders.add(new Order(3, new Point(1.0, 7.0), new Point(3.0, 6.0), new Time("17:00", "18:00"), 12.0));
        orders.add(new Order(4, new Point(9.0, 7.0), new Point(8.0, 6.0), new Time("16:00", "17:00"), 13.0));
        orders.add(new Order(5, new Point(7.0, 1.0), new Point(1.0, 7.0), new Time("16:00", "17:00"), 14.0));
        orders.add(new Order(6, new Point(1.0, 4.0), new Point(9.0, 7.0), new Time("14:00", "15:00"), 15.0));
        orders.add(new Order(7, new Point(2.0, 6.0), new Point(4.0, 7.0), new Time("16:00", "17:00"), 16.0));
        orders.add(new Order(8, new Point(7.0, 7.0), new Point(3.0, 5.0), new Time("12:00", "13:00"), 17.0));
        System.out.println(sortedOrderSecond.compare(orders));
    }
}