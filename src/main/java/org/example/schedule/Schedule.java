package org.example.schedule;

import org.example.pupose.Purpose;

import java.util.ArrayList;

public class Schedule {
    ArrayList<Purpose> allPurpose;

    public Schedule(ArrayList<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public ArrayList<Purpose> getAllPurpose() {
        return allPurpose;
    }

    public void setAllPurpose(ArrayList<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public void addPurpose(Purpose purpose) {
        allPurpose.add(purpose);
    }
}
