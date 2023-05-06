package org.example.dividingTheQueue;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DividingTheQueue {
    static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<List<T>>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(N, i + L)))
            );
        }
        return parts;
    }
    public List<List<Order>> cutTheQueue(List<Order> orders, List<Person> persons) {
        int remove = 0;
        List<List<Order>> listOrders = new ArrayList<>();
        List<Integer> result = sizeTheOrder(orders.size(), persons.size());
        for (int i = 0; i < result.size(); i++) {
            listOrders = chopped(orders,result.get(i));
        }

        return listOrders;
    }

    public List<Purpose> firstSchedule (List<Order> listOrder, List<Person> listPerson) {
        List<Purpose> allDividingPurpose = new ArrayList<>();
        double coefficient = listOrder.size() / listPerson.size();
        for (int i = 0; i < listPerson.size(); i++) {
            for (int j = i; j < listOrder.size(); j += (int) coefficient){
                Purpose helpPurpose = new Purpose(listPerson.get(i), listOrder.get(j),
                        Point.distanceFourPoint(listPerson.get(i).getLocation().getX(), listPerson.get(i).getLocation().getY(),
                                listOrder.get(j).getPointStart().getX(), listOrder.get(j).getPointStart().getY()));
                allDividingPurpose.add(helpPurpose);
            }
        }
    }

    public List<Integer> sizeTheOrder(int sizeOrder, int sizePerson) {
        List<Integer> allDividingNumber = new ArrayList<>();
        double coefficient = sizeOrder / sizePerson;
        for (int i = 0; i < sizePerson; i++) {
            allDividingNumber.add((int) coefficient);
        }
        if (sizeOrder % sizePerson == 0) {
            return allDividingNumber;
        }
        int alfa = (int) (coefficient * sizePerson);
        int needToDistribute = sizeOrder - alfa;
        for (int j = 0; j < needToDistribute; j++) {
            final int one = 1;
            Integer prev = allDividingNumber.get(j) + one;
            allDividingNumber.set(j, prev);
        }
        Collections.shuffle(allDividingNumber);
        return allDividingNumber;
    }
}
