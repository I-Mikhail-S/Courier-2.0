package org.example.schedule;

import org.example.abstractPerson.Person;
import org.example.pupose.Purpose;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


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