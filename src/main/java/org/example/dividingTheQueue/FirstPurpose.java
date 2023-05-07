package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.distanceAndTime.DistanceCalculate;
import org.example.distanceAndTime.TimeCalculate;
import org.example.point.Point;
import org.example.pupose.Purpose;

import java.util.ArrayList;
import java.util.List;

public class FirstPurpose {
    public static List<Purpose> firstPurpose (List<Order> listOrder, List<Person> listPerson){
        List<List<Order>> orders = new ArrayList<>();
        List<Purpose> allDividingPurpose = new ArrayList<>();
        List<Integer> result = DividingTheQueue.sizeTheOrder(listOrder.size(), listPerson.size());
        for (int i = 0; i < result.size(); i++) {
            orders = DividingTheQueue.chopped(listOrder,result.get(i));
        }
        for (int i = 0; i < listPerson.size(); i++) {
            for (int j = 0; j < orders.get(i).size(); j++) {
                Purpose helpPurpose = new Purpose(
                        listPerson.get(i),
                        orders.get(i).
                                get(j),
                        new Point(orders.get(i).get(j).getPointFinish().getX(),orders.get(i).get(j).getPointFinish().getX()),
                        TimeCalculate.getTime(listPerson.get(i),orders.get(i).get(j)),
                        DistanceCalculate.getDistance(listPerson.get(i),orders.get(i).get(j)));
                allDividingPurpose.add(helpPurpose);
            }
        }
        return allDividingPurpose;

    }
}