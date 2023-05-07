package org.example.schedule;

import org.example.pupose.Purpose;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Schedule {
    List<Purpose> allPurpose;

    public Schedule(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public Schedule() {
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

    @Override
    public String toString() {
        return "Schedule{" +
                "allPurpose=" + allPurpose +
                '}';
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