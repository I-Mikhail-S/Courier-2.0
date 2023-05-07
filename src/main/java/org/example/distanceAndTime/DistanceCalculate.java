package org.example.distanceAndTime;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;

public class DistanceCalculate {
    public static double getDistance(Person person, Order order) {
        double A = Point.distanceFourPoint(
                person.getLocation().getX(),
                person.getLocation().getY(),
                order.getPointStart().getX(),
                order.getPointStart().getX());
        double B = Point.distanceFourPoint(
                order.getPointStart().getX(),
                order.getPointStart().getX(),
                order.getPointFinish().getX(),
                order.getPointFinish().getX());
        return A+B;
    }
}
