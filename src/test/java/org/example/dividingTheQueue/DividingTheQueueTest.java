package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;
import org.example.schedule.Schedule;
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
        List<Integer> a = dividingTheQueue.sizeTheOrder(2,0);
        System.out.println(a);
    }

    @Test
    void firstSchedule() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1,new Point(1,2),new Point(2,2),new Time("12:00","13:00"),10));
        orders.add(new Order(2,new Point(3,2),new Point(3,2),new Time("13:00","14:00"),11));
        orders.add(new Order(3,new Point(1,7),new Point(3,6),new Time("14:00","15:00"),12));
        orders.add(new Order(4,new Point(9,7),new Point(8,6),new Time("15:00","16:00"),13));
        orders.add(new Order(5,new Point(7,1),new Point(1,7),new Time("16:00","17:00"),14));
        orders.add(new Order(6,new Point(1,4),new Point(9,7),new Time("17:00","18:00"),15));
        orders.add(new Order(7,new Point(2,6),new Point(4,7),new Time("18:00","19:00"),16));
        orders.add(new Order(8,new Point(7,7),new Point(3,5),new Time("19:00","20:00"),17));
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Stepan", 1, 2, new Point(2,2)));
        persons.add(new Person(2, "Ivan", 2, 3, new Point(3,3)));
        persons.add(new Person(3, "Misha", 3, 4, new Point(4,4)));
        FirstPurpose firstPurpose = new FirstPurpose();
        for (int i = 0; i < firstPurpose.firstPurpose(orders,persons).getAllPurpose().size(); i++) {
            System.out.println(firstPurpose.firstPurpose(orders,persons).getAllPurpose().get(i));
            System.out.println();
        }
    }
}