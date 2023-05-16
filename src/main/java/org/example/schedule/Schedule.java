<<<<<<< HEAD
package org.example.Schedule;

import org.example.Purpose.Purpose;

import java.util.LinkedList;

public class Schedule {


    LinkedList<Purpose> Schedule;

    public Schedule(){}

   // добавить элемент в ячейку index
    public void setPurposeWithIndex(Purpose purpose, int index) {
        Schedule.set(index,purpose);
    }
    // добавить в конец
    public void setPurpose(Purpose purpose){
        Schedule.add(purpose);
    }
    // вернуть элемент ячейки index
    public Purpose getPurpose(int index){

        return Schedule.get(index);
    }

    // удалить ячейку index
    public void removePurpose(int index){
        Schedule.remove(index);
    }

    public String toString() {
        return "Расписание:" + "\n" + Schedule;
    }
}
=======
package org.example.schedule;
import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Класс необходимый для создания рассписания курьеров основанный на {@link Purpose} хранящиеся в {@link Schedule#allPurpose}
 */
public class Schedule {
    private List<Purpose> allPurpose;
    private double incomeSchedule;

    public Schedule(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
        for (Purpose helpPurpose : allPurpose) {
            this.incomeSchedule += helpPurpose.getIncome();
        }
    }

    public Schedule() {
        this.allPurpose = new ArrayList<>();
    }

    public List<Purpose> getAllPurpose() {
        return allPurpose;
    }

    public void setAllPurpose(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public void addPurpose(Purpose purpose) {
        allPurpose.add(purpose);
    }

    public Schedule merge (List<Purpose> listSecond) {
        this.allPurpose.addAll(listSecond);
        return this;
    }

    public double getIncomeSchedule() {
        return incomeSchedule;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "allPurpose=" + allPurpose +
                '}';
    }

    public void beautifulString() {
        for (Purpose helpPurpose : allPurpose) {
            System.out.println(helpPurpose);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(allPurpose, schedule.allPurpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allPurpose);
    }
}
>>>>>>> 9d5e560baebae9acca67c2f0da7df2534ce0d205
