package org.example.basicAlgorithm;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import java.util.ArrayList;
import java.util.List;


public class BasicAlgorithm {

    public static Schedule basicAlgorithm (List<Person> allPerson, List<Order> unUsedOrder, Schedule schedule) {

        ArrayList<Schedule> listIdeaScheduleAllPerson = new ArrayList<>();
        for (Person helpPerson : allPerson) {
            Schedule testSchedulePerson = helpPerson.getSchedule();
            for (Order helpOrder : unUsedOrder) {
                Purpose ideaPurpose = new Purpose(helpPerson, helpOrder);
                for (int i = 0; i < helpPerson.getSchedule().getAllPurpose().size(); i++) {
                    if (true) {/*должна быть нормальная проверка по времени*/
                        testSchedulePerson.getAllPurpose().add(i, ideaPurpose);
                        listIdeaScheduleAllPerson.add(testSchedulePerson);
                    }
                }
            }
        }
        Schedule maxIncome = listIdeaScheduleAllPerson.get(0);
        for (int i = 1; i < listIdeaScheduleAllPerson.size(); i++) {
            if (listIdeaScheduleAllPerson.get(i).getIncomeSchedule() > maxIncome.getIncomeSchedule()) {
                maxIncome = listIdeaScheduleAllPerson.get(i);
            }
        }
        maxIncome.getAllPurpose().get(0).getCourier().setSchedule(maxIncome); // делаем конечное назначение заказа на курьера

        int j = 0;
        int helpVariable = 0;
        for (int i = 0; i < schedule.getAllPurpose().size(); i++) {
            if (schedule.getAllPurpose().get(i).getCourier() == maxIncome.getAllPurpose().get(0).getCourier()) {
                helpVariable = i;
                schedule.getAllPurpose().set(i, maxIncome.getAllPurpose().get(j));
                j++;
            }
        }
        schedule.getAllPurpose().add(helpVariable + 1, maxIncome.getAllPurpose().get(maxIncome.getAllPurpose().size()));
        // делаем так, потому что мы заменили пурпосы в общем шедуле, но не добавили один, который вышел за рамки старого массива индивидуального шедула

        return schedule; // не тестил, мб не работает
    }

}
