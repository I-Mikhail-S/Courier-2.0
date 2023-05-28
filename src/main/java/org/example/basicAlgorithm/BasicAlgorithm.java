package org.example.basicAlgorithm;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;
import org.example.time.Time;
import org.example.utils.Utils;

import java.util.*;


public class BasicAlgorithm {
    private static void updatePurpose(Purpose purpose){
        purpose.getCourier().setTimeStartCourier(Utils.timeExecution((int) purpose.getTimeExecution(),purpose.getCourier().getTimeStartCourier()));
        purpose.getOrder().getTime().setEndTimeInterval( purpose.getCourier().getTimeStartCourier());
    }
    private static void cleanPurpose(Schedule ideaSchedule){
        for (int i = 0; i < ideaSchedule.getAllPurpose().size(); i++) {
            ideaSchedule.getAllPurpose().get(i).getCourier().setTimeStartCourier(ideaSchedule.getAllPurpose().get(i).getOrder().getTime().getStartTimeInterval());
            ideaSchedule.getAllPurpose().get(i).getOrder().getTime().setEndTimeInterval( ideaSchedule.getAllPurpose().get(i).getCourier().getTimeEndCourier());
        }
    }
    private static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> random(int size){
        for (int i=0; i<size; i++) list.add(i);
        Collections.shuffle(list);
        return list;
    }

    private static Integer numberRandom () {
        if (list.isEmpty()) {
            throw new RuntimeException("Рандомные числа не сгенерированы!");
        }
        int value = list.get(0);;
        list.remove(0);
        return value;
    }

    public static Schedule basicAlgorithm (List<Person> personList, List<Order> orderList) {

        if (personList == null && orderList == null) {
            throw new RuntimeException("Передан(ы) пустой(ые) лист(ы)!");
        }

        List<Schedule> ideaScheduleList = new ArrayList<>();
<<<<<<< HEAD
        while (ideaScheduleList.size() < 100000) {
            List<Integer> prev = new ArrayList<>(random(orderList.size()));
=======
        while (ideaScheduleList.size() < 100000) { // при глубине просчёта 100000 считает в районе 1 минуты.
            random(orderList.size());
>>>>>>> aee0eecb4669576f3b54afd534281bc1a0b67340
            List<Order> unUsedOrder = new ArrayList<>(orderList);
            Schedule ideaSchedule = new Schedule();
            for (int k = 0,i = 0; list.size() > 0 ; k++,i++) {
                if (k == personList.size()) k = 0;
<<<<<<< HEAD
                Purpose ideaPurpose = new Purpose(personList.get(k), unUsedOrder.get(prev.get(i)));
                updatePurpose(ideaPurpose);
                ideaSchedule.addPurpose(ideaPurpose);
                unUsedOrder.remove(prev.get(i));
                list.remove(0);
            }

            list.clear();
=======
                Purpose ideaPurpose = new Purpose(personList.get(k), unUsedOrder.get(numberRandom()));
                updatePurpose(ideaPurpose);
                ideaSchedule.addPurpose(ideaPurpose);
                personList.get(k).getSchedule().addPurpose(ideaPurpose);
                //unUsedOrder.remove(ideaPurpose.getOrder());
            }
>>>>>>> aee0eecb4669576f3b54afd534281bc1a0b67340
            boolean flag = true;
            for (Schedule helpSchedule : ideaScheduleList)
                if (helpSchedule == ideaSchedule) {
                    flag = false;
                    break;
                }
            if (flag) ideaScheduleList.add(ideaSchedule);
            cleanPurpose(ideaSchedule);
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
