package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;
import org.example.time.Time;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DividingTheQueueTest {

    @Test
    void sizeTheOrderTenAndFour() {
        DividingTheQueue dividingTheQueue = new DividingTheQueue();
        List<Integer> a = dividingTheQueue.sizeTheOrder(10,4);
        System.out.println(a);
    }
    @Test
    void sizeTheOrderTenAndTree() {
        DividingTheQueue dividingTheQueue = new DividingTheQueue();
        List<Integer> a = dividingTheQueue.sizeTheOrder(10,3);
        System.out.println(a);
    }
    @Test
    void testDistributionOfOrders() {
        DividingTheQueue dividingTheQueue = new DividingTheQueue();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1,new Point(1,2),new Point(2,2),new Time("12:00","12:10"),10));
        orders.add(new Order(2,new Point(3,2),new Point(3,2),new Time("12:00","12:14"),11));
        orders.add(new Order(3,new Point(1,7),new Point(3,6),new Time("12:00","12:17"),12));
        orders.add(new Order(4,new Point(9,7),new Point(8,6),new Time("12:00","12:19"),13));
        orders.add(new Order(5,new Point(7,1),new Point(1,7),new Time("12:00","12:20"),14));
        orders.add(new Order(6,new Point(1,4),new Point(9,7),new Time("12:00","12:21"),15));
        orders.add(new Order(7,new Point(2,6),new Point(4,7),new Time("12:00","12:22"),16));
        orders.add(new Order(8,new Point(7,7),new Point(3,5),new Time("12:00","12:23"),17));
        List<Person > persons = new ArrayList<>();
        persons.add(new Person(1, "Stepan", 1, 2, new Point(2,2)));
        persons.add(new Person(2, "Ivan", 2, 3, new Point(3,3)));
        persons.add(new Person(3, "Misha", 3, 4, new Point(4,4)));

        System.out.println(dividingTheQueue.cutTheQueue(orders,persons));

    }
}