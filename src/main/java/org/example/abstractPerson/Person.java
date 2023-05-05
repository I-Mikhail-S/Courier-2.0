package org.example.abstractPerson;

import org.example.ID.ID;
import org.example.point.Point;

/**
 * Фундаментальный класс person....
 */
public  class Person {

    private int id;
    private String name;
    private double speed;
    private double energy;
    private Point location;

    // setIsFree why?
    private boolean setIsFree;
    public boolean getIsFree() {
        return setIsFree;
    }
    public void setSetIsFree(boolean setIsFree) {
        this.setIsFree = setIsFree;
    }
    // setIsFree why?

    public Person() {}

    public Person(int id, String name, double speed, double energy, Point location) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.energy = energy;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                ", location=" + location +
                ", setIsFree=" + setIsFree +
                '}';
    }
}


