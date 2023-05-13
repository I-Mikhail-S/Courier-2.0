package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.distanceAndTime.DistanceCalculate;
import org.example.distanceAndTime.SortedOrder;
import org.example.distanceAndTime.TimeCalculate;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.text.ParseException;
import java.util.*;


public class FirstSchedule {
    public static Schedule firstSchedule(List<Order> listOrder, List<Person> listPerson) {
        List<List<Order>> orders;
        List<Purpose> allDividingPurpose = new ArrayList<>();
        SortedOrder sortedOrder = new SortedOrder();
        List<Integer> result = DividingTheQueue.sizeTheOrder(listOrder.size(), listPerson.size());
        try {
            orders = DividingTheQueue.chopped(sortedOrder.compare(listOrder), result);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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
}
