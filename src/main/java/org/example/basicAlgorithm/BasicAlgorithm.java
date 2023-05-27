package org.example.basicAlgorithm;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.util.*;


public class BasicAlgorithm {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> random(int size){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<size; i++) list.add(i);
        Collections.shuffle(list);
        return  list;
    }

    private static Integer numberRandom () {
        int value = 0;
        while (list.isEmpty()) {
            value = list.get(0);
            list.remove(0);
        }
        return value;
    }

    public static Schedule basicAlgorithm (List<Person> personList, List<Order> orderList) {

        if (personList == null && orderList == null) {
            throw new RuntimeException("Передан(ы) пустой(ые) лист(ы)!");
        }

        List<Schedule> ideaScheduleList = new ArrayList<>();
        while (ideaScheduleList.size() < 1000) {
            List<Order> unUsedOrder = new ArrayList<>(orderList);
            Schedule ideaSchedule = new Schedule();
            random(orderList.size());

            for (int k = 0; unUsedOrder.size() != 0; k++) {
                if (k == personList.size()) k = 0;
                Purpose ideaPurpose = new Purpose(personList.get(k), unUsedOrder.get(numberRandom()));
                ideaSchedule.addPurpose(ideaPurpose);
                unUsedOrder.remove(ideaPurpose.getOrder());
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
