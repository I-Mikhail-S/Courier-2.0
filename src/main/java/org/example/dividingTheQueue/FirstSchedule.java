package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.distanceAndTime.DistanceCalculate;
import org.example.distanceAndTime.TimeCalculate;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.util.ArrayList;
import java.util.List;


public class FirstSchedule {
    public static List<Schedule> firstSchedule(List<Order> listOrder, List<Person> listPerson) {

        List<List<Order>> orders;
        List<Schedule> allDividingSchedule = new ArrayList<>();
        List<Purpose> allDividingPurpose = new ArrayList<>();
        List<Integer> result = DividingTheQueue.sizeTheOrder(listOrder.size(), listPerson.size());
        orders = DividingTheQueue.chopped(listOrder, result);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i); j++) {
                Purpose helpPurpose = new Purpose(
                        listPerson.get(i),
                        orders.get(i).get(j),
                        new Point(orders.get(i).get(j).getPointFinish().getX(), orders.get(i).get(j).getPointFinish().getX()),
                        TimeCalculate.getTime(listPerson.get(i), orders.get(i).get(j)),
                        DistanceCalculate.getDistance(listPerson.get(i), orders.get(i).get(j)));
                allDividingPurpose.add(helpPurpose);
            }
        }
        allDividingSchedule.add(new Schedule(allDividingPurpose));
        return allDividingSchedule;
    }
}
