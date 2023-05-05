package org.example.main;

import org.example.ID.OrderId;
import org.example.ID.PersonID;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;
import org.example.time.Time;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Person> people = new ArrayList<>();
        List<Order> order = new ArrayList<>();
        people.add(new Person(new PersonID(),"Stepan",2,23,new Point(1,6)));
        people.add(new Person(new PersonID(),"Lev",23,23,new Point(2,8)));
        order.add(new Order(new OrderId(),new Point(13,13),new Point(27,24),new Time("12:00","12:10"),14));
        order.add(new Order(new OrderId(),new Point(14,13),new Point(13,12),new Time("12:00","12:05"),34));
        /*StartApplication startApplication = new StartApplication(people,order);
        startApplication.createAllObjects();*/

    }
}