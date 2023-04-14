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
