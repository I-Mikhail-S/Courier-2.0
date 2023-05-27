package org.example.basicAlgorithm;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.util.*;


public class BasicAlgorithm {
    private static ArrayList<Integer> random(int size){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<size; i++) list.add(i);
        Collections.shuffle(list);
        return  list;
    }



    public static Schedule basicAlgorithm (List<Person> personList, List<Order> orderList) {

        if (personList == null && orderList == null) {
            throw new RuntimeException("Передан(ы) пустой(ые) лист(ы)!");
        }

        List<Schedule> ideaScheduleList = new ArrayList<>();
        while (ideaScheduleList.size() < 1000) {
            List<Order> unUsedOrder = new ArrayList<>(orderList);
            Schedule ideaSchedule = new Schedule();

            for (int k = 0,i = 0; unUsedOrder.size() != 0; k++,i++) {
                if (k == personList.size()) k = 0;
                Purpose ideaPurpose = new Purpose(personList.get(k), unUsedOrder.get(random(orderList.size()).get(i)));
                ideaSchedule.addPurpose(ideaPurpose);
                unUsedOrder.remove(unUsedOrder.get(0));
            }
            boolean flag = true;
            for (Schedule helpSchedule : ideaScheduleList)
                if (helpSchedule == ideaSchedule) {
                    flag = false;
                    break;
                }
            if (flag) ideaScheduleList.add(ideaSchedule);
        }
        int minIndex = 0;
        Schedule minLengthSchedule = ideaScheduleList.get(0);
        for (int i = 1; i < ideaScheduleList.size(); i++) {
            if (minLengthSchedule.getTotalLength() > ideaScheduleList.get(i).getTotalLength()) {
                minIndex = i;
            }
        }
        Schedule schedule = new Schedule(ideaScheduleList.get(minIndex).getAllPurpose());
        return schedule;
    }

}
