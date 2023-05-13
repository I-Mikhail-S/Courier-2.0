package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.distanceAndTime.DistanceCalculate;
import org.example.distanceAndTime.SortedOrder;
import org.example.distanceAndTime.TimeCalculate;
import org.example.point.Point;
import org.example.pupose.Purpose;

import java.text.ParseException;
import java.util.*;


public class FirstSchedule {
<<<<<<< HEAD
    public static List<Purpose> firstSchedule(List<Order> listOrder, List<Person> listPerson) throws ParseException {
        SortedOrder sortedOrder = new SortedOrder();
=======
    public static Schedule firstSchedule(List<Order> listOrder, List<Person> listPerson) {
>>>>>>> 37b3f556d54b0d6a5ef80d94acb61b9e1058ee8f
        List<List<Order>> orders;
        List<Purpose> allDividingPurpose = new ArrayList<>();
        List<Integer> result = DividingTheQueue.sizeTheOrder(listOrder.size(), listPerson.size());
        orders = DividingTheQueue.chopped(sortedOrder.compare(listOrder), result);
        int i =0;
        int f =0;
        int j = 0;
        while(f<result.size()) {
            for (; j < result.get(i);) {
                Purpose helpPurpose = new Purpose( listPerson.get(f),orders.get(i).get(j));
                allDividingPurpose.add(helpPurpose);
                if(result.get(i)<=i){
                    break;
                }
                i++;
            }

            i=0;
            f+=1;
            j=f;
        }
        Schedule firstSchedule = new Schedule(allDividingPurpose);
        return firstSchedule;
    }
    public static List<Purpose> firstScheduleTest(List<Order> listOrder, List<Person> listPerson) throws ParseException {
        List<List<Order>> orders;
        SortedOrder sortedOrder = new SortedOrder();
        List<Purpose> allDividingPurpose = new ArrayList<>();
        List<Integer> result = DividingTheQueue.sizeTheOrder(listOrder.size(), listPerson.size());
        orders = DividingTheQueue.chopped(sortedOrder.compare(listOrder), result);
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

        return allDividingPurpose;
    }
}
