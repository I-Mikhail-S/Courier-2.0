package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;
import org.example.time.Time;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstPurposeTest {

    @Test
    void firstPurpose() {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(1, new Point(1.0, 2.0), new Point(2.0, 2.0), new Time("16:00", "17:00"), 10.0));
        orders.add(new Order(2, new Point(3.0, 2.0), new Point(3.0, 2.0), new Time("18:00", "19:00"), 11.0));
        orders.add(new Order(3, new Point(1.0, 7.0), new Point(3.0, 6.0), new Time("17:00", "18:00"), 12.0));
        orders.add(new Order(4, new Point(9.0, 7.0), new Point(8.0, 6.0), new Time("16:00", "17:00"), 13.0));
        orders.add(new Order(5, new Point(7.0, 1.0), new Point(1.0, 7.0), new Time("15:00", "16:00"), 14.0));
        orders.add(new Order(6, new Point(1.0, 4.0), new Point(9.0, 7.0), new Time("14:00", "15:00"), 15.0));
        orders.add(new Order(7, new Point(2.0, 6.0), new Point(4.0, 7.0), new Time("16:00", "17:00"), 16.0));
        orders.add(new Order(8, new Point(7.0, 7.0), new Point(3.0, 5.0), new Time("12:00", "13:00"), 17.0));
        List<Person> persons = new ArrayList();
        persons.add(new Person(1, "Stepan", 1.0, 2.0, new Point(2.0, 2.0)));
        persons.add(new Person(2, "Ivan", 2.0, 3.0, new Point(3.0, 3.0)));
        persons.add(new Person(3, "Misha", 3.0, 4.0, new Point(4.0, 4.0)));

        Schedule firstSchedule = FirstSchedule.firstSchedule(orders, persons);
        firstSchedule.beautifulString();
        System.out.println(persons.get(0).getSchedule().getAllPurpose());

        orders.add(new Order(9, new Point(7.0, 1.0), new Point(1.0, 7.0), new Time("15:00", "16:00"), 14.0));
        orders.add(new Order(10, new Point(1.0, 4.0), new Point(9.0, 7.0), new Time("14:00", "15:00"), 15.0));
    }
}