package org.example.distanceAndTime;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;

public class TimeCalculate {
    public static long getTime(Person person, Order order){
        return (long) (DistanceCalculate.getDistance(person,order)/person.getSpeed());
    }
}
