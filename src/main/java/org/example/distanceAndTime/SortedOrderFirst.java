package org.example.distanceAndTime;

import org.example.abstractOrder.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedOrderFirst implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        List<Integer> firstOrderOneInt = new ArrayList<>(); // время начала из первого заказа
        List<Integer> firstOrderTwoInt = new ArrayList<>(); // время конца из первого заказа
        List<Integer> secondOrderOneInt = new ArrayList<>();// время начала из второго заказа
        List<Integer> secondOrderTwoInt = new ArrayList<>();// время конца из второго заказа
        String[] firstOrderOneString = o1.getTime().getStartTimeInterval().split(":");
        String[] firstOrderTwoString = o1.getTime().getEndTimeInterval().split(":");
        String[] secondOrderOneString = o2.getTime().getStartTimeInterval().split(":");
        String[] secondOrderTwoString = o2.getTime().getEndTimeInterval().split(":");
        for (String s1 : firstOrderOneString) {
            firstOrderOneInt.add(Integer.parseInt(s1));
        }
        for (String s1 : firstOrderTwoString) {
            firstOrderTwoInt.add(Integer.parseInt(s1));
        }
        for (String s1 : secondOrderOneString) {
            secondOrderOneInt.add(Integer.parseInt(s1));
        }
        for (String s1 : secondOrderTwoString) {
            secondOrderTwoInt.add(Integer.parseInt(s1));
        }
        // firstOrderOneInt  время начала из первого заказа
        // firstOrderTwoInt  время конца из первого заказа
        // secondOrderOneInt время начала из второго заказа
        // secondOrderTwoInt время конца из второго заказа
        if ((firstOrderTwoInt.get(0) > secondOrderTwoInt.get(0))) {
            return -1;
        }
        return 0;
    }
}
